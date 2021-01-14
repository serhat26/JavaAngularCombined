package com.zenith.hrportal.entities.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

/**
 * The type Employee identity.
 */
@Embeddable
public class EmployeeIdentity implements Serializable {
	
	@NotNull
	@Column(name = "ID")
	private Long id;
	
	@NotNull
	@Column(name = "PML_ID")
	private Long pmlId;


    /**
     * Instantiates a new Employee identity.
     */
    public EmployeeIdentity() {
		super();
	}

    /**
     * Instantiates a new Employee identity.
     *
     * @param id    the id
     * @param pmlId the pml id
     */
    public EmployeeIdentity(Long id, Long pmlId) {
		super();
		this.id = id;
		this.pmlId = pmlId;
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
     * Gets pml id.
     *
     * @return the pml id
     */
    public Long getPmlId() {
		return pmlId;
	}

    /**
     * Sets pml id.
     *
     * @param pmlId the pml id
     */
    public void setPmlId(Long pmlId) {
		this.pmlId = pmlId;
	}

	
}
