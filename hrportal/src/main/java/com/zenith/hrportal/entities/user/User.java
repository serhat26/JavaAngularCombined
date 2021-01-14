package com.zenith.hrportal.entities.user;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.zenith.hrportal.entities.AbstractAuditingEntity;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zenith.hrportal.constants.Constants;

/**
 * The type User.
 */
@Entity
@Table(name = "user_credentials")
public class User extends AbstractAuditingEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;

	@NotNull
	@Pattern(regexp = Constants.LOGIN_REGEX)
	@Size(min = 1, max = 50)
	@Column(length = 50, unique = true, nullable = false)
	private String login;

	@JsonIgnore
	@NotNull
	@Size(min = 60, max = 60)
	@Column(name = "password_hash", length = 60, nullable = false)
	private String password;

	@Size(max = 50)
	@Column(name = "first_name", length = 50)
	private String firstName;

	@Size(max = 50)
	@Column(name = "last_name", length = 50)
	private String lastName;

	@Email
	@Size(min = 5, max = 254)
	@Column(length = 254, unique = true)
	private String email;

	@NotNull
	@Column(nullable = false)
	private boolean activated = false;

	@Size(max = 20)
	@Column(name = "reset_key", length = 20)
	@JsonIgnore
	private String resetKey;

	@Column(name = "reset_date")
	private Instant resetDate = null;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "user_authority", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "authority_name", referencedColumnName = "name") })
	@BatchSize(size = 20)
	private Set<Authority> authorities = new HashSet<>();

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
// Lowercase the login before saving it in database
	public void setLogin(String login) {
		this.login = StringUtils.lowerCase(login, Locale.ENGLISH);
	}

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
		return password;
	}

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
		this.password = password;
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
     * Gets activated.
     *
     * @return the activated
     */
    public boolean getActivated() {
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
     * Gets reset key.
     *
     * @return the reset key
     */
    public String getResetKey() {
		return resetKey;
	}

    /**
     * Sets reset key.
     *
     * @param resetKey the reset key
     */
    public void setResetKey(String resetKey) {
		this.resetKey = resetKey;
	}

    /**
     * Gets reset date.
     *
     * @return the reset date
     */
    public Instant getResetDate() {
		return resetDate;
	}

    /**
     * Sets reset date.
     *
     * @param resetDate the reset date
     */
    public void setResetDate(Instant resetDate) {
		this.resetDate = resetDate;
	}

    /**
     * Gets authorities.
     *
     * @return the authorities
     */
    public Set<Authority> getAuthorities() {
		return authorities;
	}

    /**
     * Sets authorities.
     *
     * @param authorities the authorities
     */
    public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}
		return id != null && id.equals(((User) o).id);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", activated=" + activated + ", resetKey=" + resetKey
				+ ", resetDate=" + resetDate + ", authorities=" + authorities + "]";
	}

}
