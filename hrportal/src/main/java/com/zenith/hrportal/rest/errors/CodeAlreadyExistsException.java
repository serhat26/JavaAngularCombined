package com.zenith.hrportal.rest.errors;

/**
 * The type Code already exists exception.
 */
public class CodeAlreadyExistsException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Code already exists exception.
     */
    public CodeAlreadyExistsException() {
		super("Code is already exists");
	}
}
