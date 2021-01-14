package com.zenith.hrportal.rest.errors;

import java.net.URI;

/**
 * The type Error constants.
 */
public final class ErrorConstants {

    /**
     * The constant ERR_CONCURRENCY_FAILURE.
     */
    public static final String ERR_CONCURRENCY_FAILURE = "error.concurrencyFailure";
    /**
     * The constant ERR_VALIDATION.
     */
    public static final String ERR_VALIDATION = "error.validation";
    /**
     * The constant PROBLEM_BASE_URL.
     */
    public static final String PROBLEM_BASE_URL = "https://www.jhipster.tech/problem";
    /**
     * The constant DEFAULT_TYPE.
     */
    public static final URI DEFAULT_TYPE = URI.create(PROBLEM_BASE_URL + "/problem-with-message");
    /**
     * The constant CONSTRAINT_VIOLATION_TYPE.
     */
    public static final URI CONSTRAINT_VIOLATION_TYPE = URI.create(PROBLEM_BASE_URL + "/constraint-violation");
    /**
     * The constant INVALID_PASSWORD_TYPE.
     */
    public static final URI INVALID_PASSWORD_TYPE = URI.create(PROBLEM_BASE_URL + "/invalid-password");
    /**
     * The constant EMAIL_ALREADY_USED_TYPE.
     */
    public static final URI EMAIL_ALREADY_USED_TYPE = URI.create(PROBLEM_BASE_URL + "/email-already-used");
    /**
     * The constant LOGIN_ALREADY_USED_TYPE.
     */
    public static final URI LOGIN_ALREADY_USED_TYPE = URI.create(PROBLEM_BASE_URL + "/login-already-used");

	private ErrorConstants() {
	}
}
