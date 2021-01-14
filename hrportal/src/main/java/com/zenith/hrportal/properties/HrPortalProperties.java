package com.zenith.hrportal.properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.cors.CorsConfiguration;

/**
 * Properties specific to HrPortal.
 *
 * <p>
 * Properties are configured in the application.yml file.
 * </p>
 */
@Configuration
@ConfigurationProperties(prefix = "hrportal", ignoreUnknownFields = false)
@PropertySources({ @PropertySource(value = "classpath:git.properties", ignoreResourceNotFound = true),
		@PropertySource(value = "classpath:META-INF/build-info.properties", ignoreResourceNotFound = true) })
public class HrPortalProperties {

	private final Http http = new Http();

	private final Mail mail = new Mail();

	private final Security security = new Security();

	private final CorsConfiguration cors = new CorsConfiguration();

	private final ClientApp clientApp = new ClientApp();

	/**
	 * <p>
	 * Getter for the field <code>http</code>.
	 * </p>
	 */
	public Http getHttp() {
		return http;
	}

	/**
	 * <p>
	 * Getter for the field <code>mail</code>.
	 * </p>
	 */
	public Mail getMail() {
		return mail;
	}

	/**
	 * <p>
	 * Getter for the field <code>security</code>.
	 * </p>
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * <p>
	 * Getter for the field <code>cors</code>.
	 * </p>
	 */
	public CorsConfiguration getCors() {
		return cors;
	}

	/**
	 * <p>
	 * Getter for the field <code>clientApp</code>.
	 * </p>
	 */
	public ClientApp getClientApp() {
		return clientApp;
	}

	public static class Http {

		private final Cache cache = new Cache();

		public Cache getCache() {
			return cache;
		}

		public static class Cache {

			private int timeToLiveInDays = HrPortalDefaults.Http.Cache.timeToLiveInDays;

			public int getTimeToLiveInDays() {
				return timeToLiveInDays;
			}

			public void setTimeToLiveInDays(int timeToLiveInDays) {
				this.timeToLiveInDays = timeToLiveInDays;
			}
		}
	}

	public static class Mail {

		private boolean enabled = HrPortalDefaults.Mail.enabled;

		private String from = HrPortalDefaults.Mail.from;

		private String baseUrl = HrPortalDefaults.Mail.baseUrl;

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public String getFrom() {
			return from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getBaseUrl() {
			return baseUrl;
		}

		public void setBaseUrl(String baseUrl) {
			this.baseUrl = baseUrl;
		}
	}

	public static class Security {

		private final ClientAuthorization clientAuthorization = new ClientAuthorization();

		private final Authentication authentication = new Authentication();

		private final RememberMe rememberMe = new RememberMe();

		private final OAuth2 oauth2 = new OAuth2();

		public ClientAuthorization getClientAuthorization() {
			return clientAuthorization;
		}

		public Authentication getAuthentication() {
			return authentication;
		}

		public RememberMe getRememberMe() {
			return rememberMe;
		}

		public OAuth2 getOauth2() {
			return oauth2;
		}

		public static class ClientAuthorization {

			private String accessTokenUri = HrPortalDefaults.Security.ClientAuthorization.accessTokenUri;

			private String tokenServiceId = HrPortalDefaults.Security.ClientAuthorization.tokenServiceId;

			private String clientId = HrPortalDefaults.Security.ClientAuthorization.clientId;

			private String clientSecret = HrPortalDefaults.Security.ClientAuthorization.clientSecret;

			public String getAccessTokenUri() {
				return accessTokenUri;
			}

			public void setAccessTokenUri(String accessTokenUri) {
				this.accessTokenUri = accessTokenUri;
			}

			public String getTokenServiceId() {
				return tokenServiceId;
			}

			public void setTokenServiceId(String tokenServiceId) {
				this.tokenServiceId = tokenServiceId;
			}

			public String getClientId() {
				return clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getClientSecret() {
				return clientSecret;
			}

			public void setClientSecret(String clientSecret) {
				this.clientSecret = clientSecret;
			}
		}

		public static class Authentication {

			private final Jwt jwt = new Jwt();

			public Jwt getJwt() {
				return jwt;
			}

			public static class Jwt {

				private String secret = HrPortalDefaults.Security.Authentication.Jwt.secret;

				private String base64Secret = HrPortalDefaults.Security.Authentication.Jwt.base64Secret;

				private long tokenValidityInSeconds = HrPortalDefaults.Security.Authentication.Jwt.tokenValidityInSeconds;

				private long tokenValidityInSecondsForRememberMe = HrPortalDefaults.Security.Authentication.Jwt.tokenValidityInSecondsForRememberMe;

				public String getSecret() {
					return secret;
				}

				public void setSecret(String secret) {
					this.secret = secret;
				}

				public String getBase64Secret() {
					return base64Secret;
				}

				public void setBase64Secret(String base64Secret) {
					this.base64Secret = base64Secret;
				}

				public long getTokenValidityInSeconds() {
					return tokenValidityInSeconds;
				}

				public void setTokenValidityInSeconds(long tokenValidityInSeconds) {
					this.tokenValidityInSeconds = tokenValidityInSeconds;
				}

				public long getTokenValidityInSecondsForRememberMe() {
					return tokenValidityInSecondsForRememberMe;
				}

				public void setTokenValidityInSecondsForRememberMe(long tokenValidityInSecondsForRememberMe) {
					this.tokenValidityInSecondsForRememberMe = tokenValidityInSecondsForRememberMe;
				}
			}
		}

		public static class RememberMe {

			@NotNull
			private String key = HrPortalDefaults.Security.RememberMe.key;

			public String getKey() {
				return key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class OAuth2 {
			private List<String> audience = new ArrayList<>();

			public List<String> getAudience() {
				return Collections.unmodifiableList(audience);
			}

			public void setAudience(@NotNull List<String> audience) {
				this.audience.addAll(audience);
			}
		}
	}

	public static class ClientApp {

		private String name = HrPortalDefaults.ClientApp.name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
