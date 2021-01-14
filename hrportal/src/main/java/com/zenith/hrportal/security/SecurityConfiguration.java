package com.zenith.hrportal.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.header.writers.ReferrerPolicyHeaderWriter;
import org.springframework.web.filter.CorsFilter;
import org.zalando.problem.spring.web.advice.security.SecurityProblemSupport;

/**
 * The type Security configuration.
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Import(SecurityProblemSupport.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private final CorsFilter corsFilter;

	private final TokenProvider tokenProvider;

	private final SecurityProblemSupport problemSupport;

    /**
     * Instantiates a new Security configuration.
     *
     * @param corsFilter     the cors filter
     * @param tokenProvider  the token provider
     * @param problemSupport the problem support
     */
    public SecurityConfiguration(CorsFilter corsFilter, TokenProvider tokenProvider,
			SecurityProblemSupport problemSupport) {
		this.corsFilter = corsFilter;
		this.tokenProvider = tokenProvider;
		this.problemSupport = problemSupport;
	}

    /**
     * Password encoder password encoder.
     *
     * @return the password encoder
     */
    @Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().addFilterBefore(corsFilter, UsernamePasswordAuthenticationFilter.class)
				.exceptionHandling().authenticationEntryPoint(problemSupport).accessDeniedHandler(problemSupport).and()
				.headers()
				.contentSecurityPolicy(
						"default-src 'self'; frame-src 'self' data:; script-src 'self' 'unsafe-inline' 'unsafe-eval' https://storage.googleapis.com; style-src 'self' 'unsafe-inline'; img-src 'self' data:; font-src 'self' data:")
				.and().referrerPolicy(ReferrerPolicyHeaderWriter.ReferrerPolicy.STRICT_ORIGIN_WHEN_CROSS_ORIGIN).and()
				.featurePolicy(
						"geolocation 'none'; midi 'none'; sync-xhr 'none'; microphone 'none'; camera 'none'; magnetometer 'none'; gyroscope 'none'; speaker 'none'; fullscreen 'self'; payment 'none'")
				.and().frameOptions().deny().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
				.antMatchers("/api/authenticate").permitAll()
				.antMatchers("/api/register").permitAll()
				.antMatchers("/api/activate").permitAll()
				.antMatchers("/api/account/reset-password/init").permitAll()
				.antMatchers("/api/companies").permitAll()
				.antMatchers("/api/account/reset-password/finish").permitAll()
				.antMatchers("/**").authenticated()
				.and().httpBasic().and().apply(securityConfigurerAdapter());
	}

	private JWTConfigurer securityConfigurerAdapter() {
		return new JWTConfigurer(tokenProvider);
	}

//	private CorsFilter corsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = hrPortalProperties.getCors();
//		if (config.getAllowedOrigins() != null && !config.getAllowedOrigins().isEmpty()) {
//			log.debug("Registering CORS filter");
//			source.registerCorsConfiguration("/api/**", config);
//		}
//		return new CorsFilter(source);
//	}
}
