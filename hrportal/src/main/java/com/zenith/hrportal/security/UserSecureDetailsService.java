package com.zenith.hrportal.security;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zenith.hrportal.entities.user.User;
import com.zenith.hrportal.exceptions.UserNotActivatedException;
import com.zenith.hrportal.repository.UserRepository;

/**
 * The type User secure details service.
 */
@Component("userDetailsService")
public class UserSecureDetailsService implements UserDetailsService {

	private final Logger log = LoggerFactory.getLogger(UserSecureDetailsService.class);

	private final UserRepository userRepository;

    /**
     * Instantiates a new User secure details service.
     *
     * @param userRepository the user repository
     */
    public UserSecureDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(final String login) {
		log.debug("Authenticating {}", login);

		if (new EmailValidator().isValid(login, null)) {
			return userRepository.findOneWithAuthoritiesByEmailIgnoreCase(login)
					.map(user -> createSpringSecurityUser(login, user)).orElseThrow(() -> new UsernameNotFoundException(
							"User with email " + login + " was not found in the database"));
		}

		String lowercaseLogin = login.toLowerCase(Locale.ENGLISH);
		return userRepository.findOneWithAuthoritiesByLogin(lowercaseLogin)
				.map(user -> createSpringSecurityUser(lowercaseLogin, user))
				.orElseThrow(() -> new UsernameNotFoundException(
						"User " + lowercaseLogin + " was not found in the database"));

	}

	private org.springframework.security.core.userdetails.User createSpringSecurityUser(String lowercaseLogin,
			User user) {
		if (!user.getActivated()) {
			throw new UserNotActivatedException("User " + lowercaseLogin + " was not activated");
		}
		List<GrantedAuthority> grantedAuthorities = user.getAuthorities().stream()
				.map(authority -> new SimpleGrantedAuthority(authority.getName())).collect(Collectors.toList());
		return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
				grantedAuthorities);
	}

}
