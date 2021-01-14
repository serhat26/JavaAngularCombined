package com.zenith.hrportal.dto.user;

import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.zenith.hrportal.constants.Constants;
import com.zenith.hrportal.entities.user.Authority;
import com.zenith.hrportal.entities.user.User;

/**
 * A DTO representing a user, with his authorities.
 */
public class UserDTO {

	private Long id;

	@NotBlank
	@Pattern(regexp = Constants.LOGIN_REGEX)
	@Size(min = 1, max = 50)
	private String login;

	@Size(max = 50)
	private String firstName;

	@Size(max = 50)
	private String lastName;

	@Email
	@Size(min = 5, max = 254)
	private String email;

	private boolean activated = false;

	private String createdBy;

	private Instant createdDate;

	private String lastModifiedBy;

	private Instant lastModifiedDate;

	private Set<String> authorities;

    /**
     * Instantiates a new User dto.
     */
    public UserDTO() {
	}

    /**
     * Instantiates a new User dto.
     *
     * @param user the user
     */
    public UserDTO(User user) {
		this.id = user.getId();
		this.login = user.getLogin();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		this.activated = user.getActivated();
		this.createdBy = user.getCreatedBy();
		this.createdDate = user.getCreatedDate();
		this.lastModifiedBy = user.getLastModifiedBy();
		this.lastModifiedDate = user.getLastModifiedDate();
		this.authorities = user.getAuthorities().stream().map(Authority::getName).collect(Collectors.toSet());
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
		return id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets login.
     *
     * @return the login
     */
    public String getLogin() {
		return login;
	}

    /**
     * Sets login.
     *
     * @param login the login
     */
    public void setLogin(String login) {
		this.login = login;
	}

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
		return firstName;
	}

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
		return lastName;
	}

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
		return email;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
	}

    /**
     * Is activated boolean.
     *
     * @return the boolean
     */
    public boolean isActivated() {
		return activated;
	}

    /**
     * Sets activated.
     *
     * @param activated the activated
     */
    public void setActivated(boolean activated) {
		this.activated = activated;
	}

    /**
     * Gets created by.
     *
     * @return the created by
     */
    public String getCreatedBy() {
		return createdBy;
	}

    /**
     * Sets created by.
     *
     * @param createdBy the created by
     */
    public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

    /**
     * Gets created date.
     *
     * @return the created date
     */
    public Instant getCreatedDate() {
		return createdDate;
	}

    /**
     * Sets created date.
     *
     * @param createdDate the created date
     */
    public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

    /**
     * Gets last modified by.
     *
     * @return the last modified by
     */
    public String getLastModifiedBy() {
		return lastModifiedBy;
	}

    /**
     * Sets last modified by.
     *
     * @param lastModifiedBy the last modified by
     */
    public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

    /**
     * Gets last modified date.
     *
     * @return the last modified date
     */
    public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}

    /**
     * Sets last modified date.
     *
     * @param lastModifiedDate the last modified date
     */
    public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

    /**
     * Gets authorities.
     *
     * @return the authorities
     */
    public Set<String> getAuthorities() {
		return authorities;
	}

    /**
     * Sets authorities.
     *
     * @param authorities the authorities
     */
    public void setAuthorities(Set<String> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "UserDTO{" + "login='" + login + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
				+ '\'' + ", email='" + email + '\'' + ", activated=" + activated + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastModifiedBy='" + lastModifiedBy + '\'' + ", lastModifiedDate="
				+ lastModifiedDate + ", authorities=" + authorities + "}";
	}
}
