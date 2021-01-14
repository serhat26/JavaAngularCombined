package com.zenith.hrportal.entities.department;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Departement.
 */
@Entity
@Table(name = "PP_DEPARTMENTS")
public class Departement implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DepartementIdentity departementIdentity;
	
	
	
	@Column(name = "DESCRIPTION")
	private String description;

    /**
     * Gets departement identity.
     *
     * @return the departement identity
     */
    public DepartementIdentity getDepartementIdentity() {
		return departementIdentity;
	}

    /**
     * Sets departement identity.
     *
     * @param departementIdentity the departement identity
     */
    public void setDepartementIdentity(DepartementIdentity departementIdentity) {
		this.departementIdentity = departementIdentity;
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

	
}
