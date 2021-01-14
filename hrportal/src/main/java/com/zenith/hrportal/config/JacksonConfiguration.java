package com.zenith.hrportal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.problem.ProblemModule;
import org.zalando.problem.violations.ConstraintViolationProblemModule;

import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * The type Jackson configuration.
 */
@Configuration
public class JacksonConfiguration {

    /**
     * Support for Java date and time API.
     *
     * @return the corresponding Jackson module.
     */
    @Bean
	public JavaTimeModule javaTimeModule() {
		return new JavaTimeModule();
	}

    /**
     * Jdk 8 time module jdk 8 module.
     *
     * @return the jdk 8 module
     */
    @Bean
	public Jdk8Module jdk8TimeModule() {
		return new Jdk8Module();
	}

    /**
     * Problem module problem module.
     *
     * @return the problem module
     */
    /*
	 * Module for serialization/deserialization of RFC7807 Problem.
	 */
	@Bean
	public ProblemModule problemModule() {
		return new ProblemModule();
	}

    /**
     * Constraint violation problem module constraint violation problem module.
     *
     * @return the constraint violation problem module
     */
    /*
	 * Module for serialization/deserialization of ConstraintViolationProblem.
	 */
	@Bean
	public ConstraintViolationProblemModule constraintViolationProblemModule() {
		return new ConstraintViolationProblemModule();
	}
}
