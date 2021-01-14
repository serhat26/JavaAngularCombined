package com.zenith.hrportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT)
/*
 * Exception is thrown everytime a model is not found on the DB
 */
public class ModelNotFoundException extends RuntimeException {

  public ModelNotFoundException(String message) {
    super(message);
  }
}
