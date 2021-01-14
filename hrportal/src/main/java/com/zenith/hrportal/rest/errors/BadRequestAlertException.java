package com.zenith.hrportal.rest.errors;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

/**
 * The type Bad request alert exception.
 */
public class BadRequestAlertException extends AbstractThrowableProblem {

	private static final long serialVersionUID = 1L;

	private final String entityName;

	private final String errorKey;

    /**
     * Instantiates a new Bad request alert exception.
     *
     * @param defaultMessage the default message
     * @param entityName     the entity name
     * @param errorKey       the error key
     */
    public BadRequestAlertException(String defaultMessage, String entityName, String errorKey) {
		this(ErrorConstants.DEFAULT_TYPE, defaultMessage, entityName, errorKey);
	}

    /**
     * Instantiates a new Bad request alert exception.
     *
     * @param type           the type
     * @param defaultMessage the default message
     * @param entityName     the entity name
     * @param errorKey       the error key
     */
    public BadRequestAlertException(URI type, String defaultMessage, String entityName, String errorKey) {
		super(type, defaultMessage, Status.BAD_REQUEST, null, null, null, getAlertParameters(entityName, errorKey));
		this.entityName = entityName;
		this.errorKey = errorKey;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getEntityName() {
		return entityName;
	}

    /**
     * Gets error key.
     *
     * @return the error key
     */
    public String getErrorKey() {
		return errorKey;
	}

	private static Map<String, Object> getAlertParameters(String entityName, String errorKey) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("message", "error." + errorKey);
		parameters.put("params", entityName);
		return parameters;
	}
}
