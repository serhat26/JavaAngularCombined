package com.zenith.hrportal.rest.errors;

/**
 * The type Login already used exception.
 */
public class LoginAlreadyUsedException extends BadRequestAlertException {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Login already used exception.
     */
    public LoginAlreadyUsedException() {
		super(ErrorConstants.LOGIN_ALREADY_USED_TYPE, "Login name already used!", "userManagement", "userexists");
	}
}
