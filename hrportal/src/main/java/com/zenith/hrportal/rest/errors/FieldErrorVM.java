package com.zenith.hrportal.rest.errors;

import java.io.Serializable;

/**
 * The type Field error vm.
 */
public class FieldErrorVM implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String objectName;

	private final String field;

	private final String message;

    /**
     * Instantiates a new Field error vm.
     *
     * @param dto     the dto
     * @param field   the field
     * @param message the message
     */
    public FieldErrorVM(String dto, String field, String message) {
		this.objectName = dto;
		this.field = field;
		this.message = message;
	}

    /**
     * Gets object name.
     *
     * @return the object name
     */
    public String getObjectName() {
		return objectName;
	}

    /**
     * Gets field.
     *
     * @return the field
     */
    public String getField() {
		return field;
	}

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
		return message;
	}

}
