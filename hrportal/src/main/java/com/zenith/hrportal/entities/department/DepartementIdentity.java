package com.zenith.hrportal.entities.department;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * The type Departement identity.
 */
@Embeddable
public class DepartementIdentity implements Serializable{
	
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "COMP_CODE")
	private String company;

    /**
     * Instantiates a new Departement identity.
     */
    public DepartementIdentity() {
	}


    /**
     * Instantiates a new Departement identity.
     *
     * @param code    the code
     * @param company the company
     */
    public DepartementIdentity(String code, String company) {
		this.code = code;
		this.company = company;
	}


    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets company.
     *
     * @return the company
     */
    public String getCompany() {
		return company;
	}

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(String company) {
		this.company = company;
	}
}
