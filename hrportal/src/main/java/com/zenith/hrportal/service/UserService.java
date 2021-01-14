package com.zenith.hrportal.service;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zenith.hrportal.constants.AuthoritiesConstants;
import com.zenith.hrportal.constants.Constants;
import com.zenith.hrportal.dto.user.UserDTO;
import com.zenith.hrportal.entities.user.Authority;
import com.zenith.hrportal.entities.user.User;
import com.zenith.hrportal.exceptions.EmailAlreadyUsedException;
import com.zenith.hrportal.exceptions.InvalidPasswordException;
import com.zenith.hrportal.exceptions.UsernameAlreadyUsedException;
import com.zenith.hrportal.repository.AuthorityRepository;
import com.zenith.hrportal.repository.UserRepository;
import com.zenith.hrportal.security.SecurityUtils;
import com.zenith.hrportal.utils.RandomUtil;

/**
 * The type User service.
 */
@Service
@Transactional
public class UserService {

	private final Logger log = LoggerFactory.getLogger(UserService.class);

	private final UserRepository userRepository;

	private final PasswordEncoder passwordEncoder;

	private final AuthorityRepository authorityRepository;

    /**
     * Instantiates a new User service.
     *
     * @param userRepository      the user repository
     * @param passwordEncoder     the password encoder
     * @param authorityRepository the authority repository
     */
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder,
			AuthorityRepository authorityRepository) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.authorityRepository = authorityRepository;
	}

    /**
     * Complete password reset optional.
     *
     * @param newPassword the new password
     * @param key         the key
     * @return the optional
     */
    public Optional<User> completePasswordReset(String newPassword, String key) {
		log.debug("Reset user password for reset key {}", key);
		return userRepository.findOneByResetKey(key)
				.filter(user -> user.getResetDate().isAfter(Instant.now().minusSeconds(86400))).map(user -> {
					user.setPassword(passwordEncoder.encode(newPassword));
					user.setResetKey(null);
					user.setResetDate(null);
					return user;
				});
	}

    /**
     * Request password reset optional.
     *
     * @param mail the mail
     * @return the optional
     */
    public Optional<User> requestPasswordReset(String mail) {
		return userRepository.findOneByEmailIgnoreCase(mail).filter(User::getActivated).map(user -> {
			user.setResetKey(RandomUtil.generateResetKey());
			user.setResetDate(Instant.now());
			return user;
		});
	}

    /**
     * Register user user.
     *
     * @param userDTO  the user dto
     * @param password the password
     * @return the user
     */
    public User registerUser(UserDTO userDTO, String password) {
		userRepository.findOneByLogin(userDTO.getLogin().toLowerCase()).ifPresent(existingUser -> {
			throw new UsernameAlreadyUsedException();
		});
		userRepository.findOneByEmailIgnoreCase(userDTO.getEmail()).ifPresent(existingUser -> {
			throw new EmailAlreadyUsedException();
		});
		User newUser = new User();
		String encryptedPassword = passwordEncoder.encode(password);
		newUser.setLogin(userDTO.getLogin().toLowerCase());
		// new user gets initially a generated password
		newUser.setPassword(encryptedPassword);
		newUser.setFirstName(userDTO.getFirstName());
		newUser.setLastName(userDTO.getLastName());
		if (userDTO.getEmail() != null) {
			newUser.setEmail(userDTO.getEmail().toLowerCase());
		}
		newUser.setActivated(true);
		newUser.setCreatedBy(userDTO.getLogin());
		// new user gets registration key
		Set<Authority> authorities = new HashSet<>();
		authorityRepository.findById(AuthoritiesConstants.USER).ifPresent(authorities::add);
		newUser.setAuthorities(authorities);
		userRepository.save(newUser);
		log.debug("Created Information for User: {}", newUser);
		return newUser;
	}

	private boolean removeNonActivatedUser(User existingUser) {
		if (existingUser.getActivated()) {
			return false;
		}
		userRepository.delete(existingUser);
		userRepository.flush();
		return true;
	}

    /**
     * Create user user.
     *
     * @param userDTO the user dto
     * @return the user
     */
    public User createUser(UserDTO userDTO) {
		User user = new User();
		user.setLogin(userDTO.getLogin().toLowerCase());
		user.setFirstName(userDTO.getFirstName());
		user.setLastName(userDTO.getLastName());
		if (userDTO.getEmail() != null) {
			user.setEmail(userDTO.getEmail().toLowerCase());
		}
		String encryptedPassword = passwordEncoder.encode(RandomUtil.generatePassword());
		user.setPassword(encryptedPassword);
		user.setResetKey(RandomUtil.generateResetKey());
		user.setResetDate(Instant.now());
		user.setActivated(true);
		if (userDTO.getAuthorities() != null) {
			Set<Authority> authorities = userDTO.getAuthorities().stream().map(authorityRepository::findById)
					.filter(Optional::isPresent).map(Optional::get).collect(Collectors.toSet());
			user.setAuthorities(authorities);
		}
		userRepository.save(user);
		log.debug("Created Information for User: {}", user);
		return user;
	}

    /**
     * Update all information for a specific user, and return the modified user.
     *
     * @param userDTO user to update.
     * @return updated user.
     */
    public Optional<UserDTO> updateUser(UserDTO userDTO) {
		return Optional.of(userRepository.findById(userDTO.getId())).filter(Optional::isPresent).map(Optional::get)
				.map(user -> {
					user.setLogin(userDTO.getLogin().toLowerCase());
					user.setFirstName(userDTO.getFirstName());
					user.setLastName(userDTO.getLastName());
					if (userDTO.getEmail() != null) {
						user.setEmail(userDTO.getEmail().toLowerCase());
					}
					user.setActivated(userDTO.isActivated());
					Set<Authority> managedAuthorities = user.getAuthorities();
					managedAuthorities.clear();
					userDTO.getAuthorities().stream().map(authorityRepository::findById).filter(Optional::isPresent)
							.map(Optional::get).forEach(managedAuthorities::add);
					log.debug("Changed Information for User: {}", user);
					return user;
				}).map(UserDTO::new);
	}

    /**
     * Delete user.
     *
     * @param login the login
     */
    public void deleteUser(String login) {
		userRepository.findOneByLogin(login).ifPresent(user -> {
			userRepository.delete(user);
			log.debug("Deleted User: {}", user);
		});
	}

    /**
     * Update basic information (first name, last name, email, language) for the
     * current user.
     *
     * @param firstName first name of user.
     * @param lastName  last name of user.
     * @param email     email id of user.
     */
    public void updateUser(String firstName, String lastName, String email) {
		SecurityUtils.getCurrentUserLogin().flatMap(userRepository::findOneByLogin).ifPresent(user -> {
			user.setFirstName(firstName);
			user.setLastName(lastName);
			if (email != null) {
				user.setEmail(email.toLowerCase());
			}
			log.debug("Changed Information for User: {}", user);
		});
	}

    /**
     * Change password.
     *
     * @param currentClearTextPassword the current clear text password
     * @param newPassword              the new password
     */
    @Transactional
	public void changePassword(String currentClearTextPassword, String newPassword) {
		SecurityUtils.getCurrentUserLogin().flatMap(userRepository::findOneByLogin).ifPresent(user -> {
			String currentEncryptedPassword = user.getPassword();
			if (!passwordEncoder.matches(currentClearTextPassword, currentEncryptedPassword)) {
				throw new InvalidPasswordException();
			}
			String encryptedPassword = passwordEncoder.encode(newPassword);
			user.setPassword(encryptedPassword);
			log.debug("Changed password for User: {}", user);
		});
	}

    /**
     * Gets all managed users.
     *
     * @param pageable the pageable
     * @return the all managed users
     */
    @Transactional(readOnly = true)
	public Page<UserDTO> getAllManagedUsers(Pageable pageable) {
		return userRepository.findAllByLoginNot(pageable, Constants.ANONYMOUS_USER).map(UserDTO::new);
	}

    /**
     * Gets user with authorities by login.
     *
     * @param login the login
     * @return the user with authorities by login
     */
    @Transactional(readOnly = true)
	public Optional<User> getUserWithAuthoritiesByLogin(String login) {
		return userRepository.findOneWithAuthoritiesByLogin(login);
	}

    /**
     * Gets user with authorities.
     *
     * @return the user with authorities
     */
    @Transactional(readOnly = true)
	public Optional<User> getUserWithAuthorities() {
		return SecurityUtils.getCurrentUserLogin().flatMap(userRepository::findOneWithAuthoritiesByLogin);
	}

    /**
     * Gets a list of all the authorities.
     *
     * @return a list of all the authorities.
     */
    @Transactional(readOnly = true)
	public List<String> getAuthorities() {
		return authorityRepository.findAll().stream().map(Authority::getName).collect(Collectors.toList());
	}
}
