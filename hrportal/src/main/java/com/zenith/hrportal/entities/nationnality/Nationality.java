package com.zenith.hrportal.entities.nationnality;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * The type Nationality.
 */
@Entity
@Table(name = "PP_NATIONALITIES")
public class Nationality implements Serializable {
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private NationalityIdentity nationalityIdentity;
	
	@Column(name = "DESCRIPTION")
	@NotNull
	private String description;
	
	@Column(name = "NATION_CODE")
	@NotNull
	private String nationCode;

    /**
     * Gets nationality identity.
     *
     * @return the nationality identity
     */
    public NationalityIdentity getNationalityIdentity() {
		return nationalityIdentity;
	}

    /**
     * Sets nationality identity.
     *
     * @param nationalityIdentity the nationality identity
     */
    public void setNationalityIdentity(NationalityIdentity nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets nation code.
     *
     * @return the nation code
     */
    public String getNationCode() {
		return nationCode;
	}

    /**
     * Sets nation code.
     *
     * @param nationCode the nation code
     */
    public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}
	
	
}
