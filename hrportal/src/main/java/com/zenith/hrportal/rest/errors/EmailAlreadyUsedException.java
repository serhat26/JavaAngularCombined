package com.zenith.hrportal.rest.errors;

/**
 * The type Email already used exception.
 */
public class EmailAlreadyUsedException extends BadRequestAlertException {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Email already used exception.
     */
    public EmailAlreadyUsedException() {
		super(ErrorConstants.EMAIL_ALREADY_USED_TYPE, "Email is already in use!", "userManagement", "emailexists");
	}
}
