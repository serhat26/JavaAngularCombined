package com.zenith.hrportal.entities.category;

import com.zenith.hrportal.entities.company.Company;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The type Category grade.
 */
@Entity
@Table(name = "PP_CATG_STATUSES")
public class CategoryGrade implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CategoryGradIdentity categoryGradIdentity;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "UPDATE_BY")
    private String updatedBy;

    @Column(name = "UPDATE_ON")
    private Date updatedOn;

    @Column(name = "CREATE_BY")
    private String createdBy;

    @Column(name = "CREATE_ON")
    private Date createdOn;

    @ManyToOne()
    @JoinColumn(name = "COMP_CODE",insertable = false,updatable = false)
    private Company company;

    @Column(name = "SALARY_FROM")
    private Long salaryFrom;

    @Column(name = "SALARY_TO")
    private Long salaryTo;


    /**
     * Gets category grad identity.
     *
     * @return the category grad identity
     */
    public CategoryGradIdentity getCategoryGradIdentity() {
        return categoryGradIdentity;
    }

    /**
     * Sets category grad identity.
     *
     * @param categoryGradIdentity the category grad identity
     */
    public void setCategoryGradIdentity(CategoryGradIdentity categoryGradIdentity) {
        this.categoryGradIdentity = categoryGradIdentity;
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
     * Gets company.
     *
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

}
