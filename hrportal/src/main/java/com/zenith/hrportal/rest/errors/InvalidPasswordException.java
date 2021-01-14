package com.zenith.hrportal.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

/**
 * The type Invalid password exception.
 */
public class InvalidPasswordException extends AbstractThrowableProblem {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Invalid password exception.
     */
    public InvalidPasswordException() {
		super(ErrorConstants.INVALID_PASSWORD_TYPE, "Incorrect password", Status.BAD_REQUEST);
	}
}
