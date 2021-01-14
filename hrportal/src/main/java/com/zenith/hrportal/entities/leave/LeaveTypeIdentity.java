package com.zenith.hrportal.entities.leave;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

/**
 * The type Leave type identity.
 */
@Embeddable
public class LeaveTypeIdentity implements Serializable {
	

	@Column(name = "LEAVE_ID")
	@NotNull
	private Long id;
	
	@Column(name = "PML_ID")
	@NotNull
	private Long pmiId;

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
     * Gets pmi id.
     *
     * @return the pmi id
     */
    public Long getPmiId() {
		return pmiId;
	}

    /**
     * Sets pmi id.
     *
     * @param pmiId the pmi id
     */
    public void setPmiId(Long pmiId) {
		this.pmiId = pmiId;
	}
	
	

}
