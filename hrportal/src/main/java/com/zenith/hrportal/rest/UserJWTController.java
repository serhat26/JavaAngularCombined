package com.zenith.hrportal.rest;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zenith.hrportal.entities.user.User;
import com.zenith.hrportal.rest.vm.LoginVM;
import com.zenith.hrportal.security.JWTFilter;
import com.zenith.hrportal.security.TokenProvider;

/**
 * Controller to authenticate users.
 */
@RestController
@RequestMapping("/api")
public class UserJWTController {

	private final TokenProvider tokenProvider;

	private final AuthenticationManagerBuilder authenticationManagerBuilder;

	/**
	 * Instantiates a new User jwt controller.
	 *
	 * @param tokenProvider                the token provider
	 * @param authenticationManagerBuilder the authentication manager builder
	 */
	public UserJWTController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder) {
		this.tokenProvider = tokenProvider;
		this.authenticationManagerBuilder = authenticationManagerBuilder;
	}

	/**
	 * Authorize response entity.
	 *
	 * @param loginVM the login vm
	 * @return the response entity
	 */
	@PostMapping("/authenticate")
	public ResponseEntity<JWTToken> authorize(@Valid @RequestBody LoginVM loginVM) {

		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
				loginVM.getUsername(), loginVM.getPassword());

		Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		boolean rememberMe = (loginVM.isRememberMe() == null) ? false : loginVM.isRememberMe();
		String jwt = tokenProvider.createToken(authentication, rememberMe);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(JWTFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);
		return new ResponseEntity<>(new JWTToken(jwt), httpHeaders, HttpStatus.OK);
	}

	/**
	 * Create test user.
	 */
	@GetMapping("/createTestUser")
	public void createTestUser() {
		User user = new User();
		user.setActivated(true);
		user.setEmail("test@test.com");
		user.setLogin("test");
		user.setPassword("123456789");
		user.setFirstName("test");
		user.setLastName("test");
		user.setCreatedBy("Brahim");
	}

	/**
	 * Object to return as body in JWT Authentication.
	 */
	static class JWTToken {

		private String idToken;

		/**
		 * Instantiates a new Jwt token.
		 *
		 * @param idToken the id token
		 */
		JWTToken(String idToken) {
			this.idToken = idToken;
		}

		/**
		 * Gets id token.
		 *
		 * @return the id token
		 */
		@JsonProperty("id_token")
		String getIdToken() {
			return idToken;
		}

		/**
		 * Sets id token.
		 *
		 * @param idToken the id token
		 */
		void setIdToken(String idToken) {
			this.idToken = idToken;
		}
	}
}
