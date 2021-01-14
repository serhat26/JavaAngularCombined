package com.zenith.hrportal.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The type Database configuration.
 */
@Configuration
@EnableJpaRepositories("com.zenith.hrportal.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {
	private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);
}
