package com.zenith.hrportal.dto.mastergrade;


import com.zenith.hrportal.dto.company.CompanyWsDTO;

import java.util.Date;

/**
 * The type Category grade ws dto.
 */
public class CategoryGradeWsDTO {

    private String code;

    private String description;

    private String updatedBy;

    private Date updatedOn;

    private String createdBy;

    private Date createdOn;

    private Long salaryFrom;

    private Long salaryTo;

    private CompanyWsDTO company;

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
     * Gets updated by.
     *
     * @return the updated by
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets updated by.
     *
     * @param updatedBy the updated by
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * Gets updated on.
     *
     * @return the updated on
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Sets updated on.
     *
     * @param updatedOn the updated on
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
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
     * Gets salary from.
     *
     * @return the salary from
     */
    public Long getSalaryFrom() {
        return salaryFrom;
    }

    /**
     * Sets salary from.
     *
     * @param salaryFrom the salary from
     */
    public void setSalaryFrom(Long salaryFrom) {
        this.salaryFrom = salaryFrom;
    }

    /**
     * Gets salary to.
     *
     * @return the salary to
     */
    public Long getSalaryTo() {
        return salaryTo;
    }

    /**
     * Sets salary to.
     *
     * @param salaryTo the salary to
     */
    public void setSalaryTo(Long salaryTo) {
        this.salaryTo = salaryTo;
    }

    /**
     * Gets company.
     *
     * @return the company
     */
    public CompanyWsDTO getCompany() {
        return company;
    }

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(CompanyWsDTO company) {
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
}
