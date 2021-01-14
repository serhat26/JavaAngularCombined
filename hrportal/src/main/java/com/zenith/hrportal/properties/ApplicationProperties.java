package com.zenith.hrportal.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to HrPortal.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
