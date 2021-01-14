package com.zenith.hrportal.entities.step;

import com.zenith.hrportal.entities.company.Company;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The type Step.
 */
@Entity
@Table(name = "PP_STEPS")
public class Step implements Serializable {

    @EmbeddedId
    private StepIdentity stepIdentity;

    @Column(name = "PER")
    private Long per;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "UPDATE_BY")
    private String updatedBy;

    @Column(name = "UPDATE_ON")
    private Date updatedOn;

    @Column(name = "CREATE_BY")
    private String createdBy;

    @Column(name = "CREATE_ON")
    private Date createdOn;

    @Column(name = "START_BASIC")
    private Long startBasic;

    @ManyToOne
    @JoinColumn(name = "COMP_CODE",insertable = false,updatable = false)
    private Company company;

    /**
     * Gets step identity.
     *
     * @return the step identity
     */
    public StepIdentity getStepIdentity() {
        return stepIdentity;
    }

    /**
     * Sets step identity.
     *
     * @param stepIdentity the step identity
     */
    public void setStepIdentity(StepIdentity stepIdentity) {
        this.stepIdentity = stepIdentity;
    }

    /**
     * Gets per.
     *
     * @return the per
     */
    public Long getPer() {
        return per;
    }

    /**
     * Sets per.
     *
     * @param per the per
     */
    public void setPer(Long per) {
        this.per = per;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Long amount) {
        this.amount = amount;
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
     * Gets start basic.
     *
     * @return the start basic
     */
    public Long getStartBasic() {
        return startBasic;
    }

    /**
     * Sets start basic.
     *
     * @param startBasic the start basic
     */
    public void setStartBasic(Long startBasic) {
        this.startBasic = startBasic;
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
