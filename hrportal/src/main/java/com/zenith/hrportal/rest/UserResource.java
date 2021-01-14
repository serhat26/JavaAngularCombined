package com.zenith.hrportal.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zenith.hrportal.constants.AuthoritiesConstants;
import com.zenith.hrportal.constants.Constants;
import com.zenith.hrportal.dto.user.UserDTO;
import com.zenith.hrportal.entities.user.User;
import com.zenith.hrportal.repository.UserRepository;
import com.zenith.hrportal.rest.errors.BadRequestAlertException;
import com.zenith.hrportal.rest.errors.EmailAlreadyUsedException;
import com.zenith.hrportal.rest.errors.LoginAlreadyUsedException;
import com.zenith.hrportal.service.UserService;
import com.zenith.hrportal.utils.HeaderUtil;
import com.zenith.hrportal.utils.PaginationUtil;
import com.zenith.hrportal.utils.ResponseUtil;

@RestController
@RequestMapping("/api")
public class UserResource {
	private static final List<String> ALLOWED_ORDERED_PROPERTIES = Collections
			.unmodifiableList(Arrays.asList("id", "login", "firstName", "lastName", "email", "activated"));

	private final Logger log = LoggerFactory.getLogger(UserResource.class);

	@Value("${hrportal.clientApp.name}")
	private String applicationName;

	private final UserService userService;

	private final UserRepository userRepository;

	public UserResource(UserService userService, UserRepository userRepository) {
		this.userService = userService;
		this.userRepository = userRepository;
	}

	/**
	 * {@code POST  /users} : Creates a new user.
	 * <p>
	 * Creates a new user if the login and email are not already used, and sends an
	 * mail with an activation link. The user needs to be activated on creation.
	 *
	 * @param userDTO the user to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new user, or with status {@code 400 (Bad Request)} if the
	 *         login or email is already in use.
	 * @throws URISyntaxException       if the Location URI syntax is incorrect.
	 * @throws BadRequestAlertException {@code 400 (Bad Request)} if the login or
	 *                                  email is already in use.
	 */
	@PostMapping("/users")
	@PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
	public ResponseEntity<User> createUser(@Valid @RequestBody UserDTO userDTO) throws URISyntaxException {
		log.debug("REST request to save User : {}", userDTO);

		if (userDTO.getId() != null) {
			throw new BadRequestAlertException("A new user cannot already have an ID", "userManagement", "idexists");
			// Lowercase the user login before comparing with database
		} else if (userRepository.findOneByLogin(userDTO.getLogin().toLowerCase()).isPresent()) {
			throw new LoginAlreadyUsedException();
		} else if (userRepository.findOneByEmailIgnoreCase(userDTO.getEmail()).isPresent()) {
			throw new EmailAlreadyUsedException();
		} else {
			User newUser = userService.createUser(userDTO);
			return ResponseEntity.created(new URI("/api/users/" + newUser.getLogin()))
					.headers(HeaderUtil.createAlert(applicationName, "userManagement.created", newUser.getLogin()))
					.body(newUser);
		}
	}

	/**
	 * {@code PUT /users} : Updates an existing User.
	 *
	 * @param userDTO the user to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated user.
	 * @throws EmailAlreadyUsedException {@code 400 (Bad Request)} if the email is
	 *                                   already in use.
	 * @throws LoginAlreadyUsedException {@code 400 (Bad Request)} if the login is
	 *                                   already in use.
	 */
	@PutMapping("/users")
	@PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
	public ResponseEntity<UserDTO> updateUser(@Valid @RequestBody UserDTO userDTO) {
		log.debug("REST request to update User : {}", userDTO);
		Optional<User> existingUser = userRepository.findOneByEmailIgnoreCase(userDTO.getEmail());
		if (existingUser.isPresent() && (!existingUser.get().getId().equals(userDTO.getId()))) {
			throw new EmailAlreadyUsedException();
		}
		existingUser = userRepository.findOneByLogin(userDTO.getLogin().toLowerCase());
		if (existingUser.isPresent() && (!existingUser.get().getId().equals(userDTO.getId()))) {
			throw new LoginAlreadyUsedException();
		}
		Optional<UserDTO> updatedUser = userService.updateUser(userDTO);

		return ResponseUtil.wrapOrNotFound(updatedUser,
				HeaderUtil.createAlert(applicationName, "userManagement.updated", userDTO.getLogin()));
	}

	/**
	 * {@code GET /users} : get all users.
	 *
	 * @param pageable the pagination information.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         all users.
	 */
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> getAllUsers(Pageable pageable) {
		if (!onlyContainsAllowedProperties(pageable)) {
			return ResponseEntity.badRequest().build();
		}

		final Page<UserDTO> page = userService.getAllManagedUsers(pageable);
		HttpHeaders headers = PaginationUtil
				.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
		return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
	}

	private boolean onlyContainsAllowedProperties(Pageable pageable) {
		return pageable.getSort().stream().map(Sort.Order::getProperty).allMatch(ALLOWED_ORDERED_PROPERTIES::contains);
	}

	/**
	 * Gets a list of all roles.
	 * 
	 * @return a string list of all roles.
	 */
	@GetMapping("/users/authorities")
	@PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
	public List<String> getAuthorities() {
		return userService.getAuthorities();
	}

	/**
	 * {@code GET /users/:login} : get the "login" user.
	 *
	 * @param login the login of the user to find.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the "login" user, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/users/{login:" + Constants.LOGIN_REGEX + "}")
	public ResponseEntity<UserDTO> getUser(@PathVariable String login) {
		log.debug("REST request to get User : {}", login);
		return ResponseUtil.wrapOrNotFound(userService.getUserWithAuthoritiesByLogin(login).map(UserDTO::new));
	}

	/**
	 * {@code DELETE /users/:login} : delete the "login" User.
	 *
	 * @param login the login of the user to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
	@DeleteMapping("/users/{login:" + Constants.LOGIN_REGEX + "}")
	@PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
	public ResponseEntity<Void> deleteUser(@PathVariable String login) {
		log.debug("REST request to delete User: {}", login);
		userService.deleteUser(login);
		return ResponseEntity.noContent()
				.headers(HeaderUtil.createAlert(applicationName, "userManagement.deleted", login)).build();
	}
}
