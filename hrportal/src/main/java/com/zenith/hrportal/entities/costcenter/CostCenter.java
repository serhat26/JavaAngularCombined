package com.zenith.hrportal.entities.costcenter;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * The type Cost center.
 */
@Entity
@Table(name = "GL_COST_CENTRES")
public class CostCenter implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "comp_code",unique = true,nullable = false)
    @Size(max = 2)
    private String companyCode;

    @Column(name = "code",unique = true,nullable = false)
    @Size(max = 3)
    private String code;

    @Column(name = "description",nullable = false)
    @Size(max = 30)
    private String description;

    @Column(name = "create_by")
    private String createdBy;

    @Column(name = "create_on")
    private Date createdDate;

    @Column(name = "update_by")
    private String lastModifiedBy;

    @Column(name = "update_on")
    private Date lastModifiedDate;

    @Column(name = "module_cc")
    private String moduleCc;

    @Column(name = "active")
    @Size(max = 1)
    private String active;

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
     * Gets created date.
     *
     * @return the created date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets created date.
     *
     * @param createdDate the created date
     */
    public void setCreatedDate(Date createdDate) {
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
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets last modified date.
     *
     * @param lastModifiedDate the last modified date
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets module cc.
     *
     * @return the module cc
     */
    public String getModuleCc() {
        return moduleCc;
    }

    /**
     * Sets module cc.
     *
     * @param moduleCC2 the module cc 2
     */
    public void setModuleCc(String moduleCC2) {
        this.moduleCc = moduleCC2;
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
        return "CostCentre [id=" + id + ", companyCode=" + companyCode + ", code=" + code + ", description="
                + description + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastModifiedBy="
                + lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + ", moduleCc=" + moduleCc + ", active="
                + active + "]";
    }

}
