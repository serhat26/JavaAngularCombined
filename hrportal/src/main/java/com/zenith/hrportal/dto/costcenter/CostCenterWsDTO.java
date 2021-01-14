package com.zenith.hrportal.dto.costcenter;


import com.zenith.hrportal.entities.costcenter.CostCenter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * The type Cost center ws dto.
 */
public class CostCenterWsDTO {

	private Long id;

	@NotNull
	@Size(max = 2)
    private String companyCode;

	@NotNull
	@Size(max = 3)
    private String code;

	@NotNull
	@Size(max = 30)
    private String description;

	private String createdBy;

	private Date createdOn;

	private Date modifiedOn;

	private String modifiedBy;

	@Size(max = 1)
	private String active;

    /**
     * Instantiates a new Cost center ws dto.
     */
    public CostCenterWsDTO() {
	}

    /**
     * Instantiates a new Cost center ws dto.
     *
     * @param costCentre the cost centre
     */
    public CostCenterWsDTO(CostCenter costCentre) {
		this.id = costCentre.getId();
		this.companyCode = costCentre.getCompanyCode();
		this.code = costCentre.getCode();
		this.description = costCentre.getDescription();
		this.active = costCentre.getActive();
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
     * Gets company code.
     *
     * @return the company code
     */
    public String getCompanyCode() {
		return companyCode;
	}

    /**
     * Sets company code.
     *
     * @param companyCode the company code
     */
    public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
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
     * Gets created on.
     *
     * @return the created on
     */
    public Date getCreatedOn() {
		return createdOn;
	}

    /**
     * Sets created on.
     *
     * @param createdOn the created on
     */
    public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

    /**
     * Gets modified on.
     *
     * @return the modified on
     */
    public Date getModifiedOn() {
		return modifiedOn;
	}

    /**
     * Sets modified on.
     *
     * @param modifiedOn the modified on
     */
    public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

    /**
     * Gets modified by.
     *
     * @return the modified by
     */
    public String getModifiedBy() {
		return modifiedBy;
	}

    /**
     * Sets modified by.
     *
     * @param modifiedBy the modified by
     */
    public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


    /**
     * Gets active.
     *
     * @return the active
     */
    public String getActive() {
		return active;
	}

    /**
     * Sets active.
     *
     * @param active the active
     */
    public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "CostCentreDTO [id=" + id + ", companyCode=" + companyCode + ", code=" + code + ", description="
				+ description + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn
				+ ", modifiedBy=" + modifiedBy + ", active=" + active + "]";
	}

}
