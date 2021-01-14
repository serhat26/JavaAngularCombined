package com.zenith.hrportal.entities.category;

import com.zenith.hrportal.entities.grademaster.TrxTypes;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The type Category statuses sales.
 */
@Entity
@Table(name = "PP_CATG_STATUSES_SALS")
public class CategoryStatusesSales implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PPCS_CODE")
    private String categoryGradeCode;

    @Column(name = "PPCS_COMP_CODE")
    private String company;

    @Column(name = "PPTRX_TRX_ID")
    private Long trxId;

    @Column(name = "PPTRX_PML_ID")
    private Long trxPmlId;

    @Column(name = "PAY_PERC")
    private Long payPerc;


    @Column(name = "UPDATE_BY")
    private String updatedBy;

    @Column(name = "UPDATE_ON")
    private Date updatedOn;

    @Column(name = "CREATE_BY")
    private String createdBy;

    @Column(name = "CREATE_ON")
    private Date createdOn;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PPTRX_TRX_ID", referencedColumnName = "TRX_ID",insertable = false,updatable = false),
            @JoinColumn(name = "PPTRX_PML_ID", referencedColumnName = "PML_ID",insertable = false,updatable = false)

    })
    private TrxTypes trxType;

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
     * Gets category grade code.
     *
     * @return the category grade code
     */
    public String getCategoryGradeCode() {
        return categoryGradeCode;
    }

    /**
     * Sets category grade code.
     *
     * @param categoryGradeCode the category grade code
     */
    public void setCategoryGradeCode(String categoryGradeCode) {
        this.categoryGradeCode = categoryGradeCode;
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

    /**
     * Gets trx id.
     *
     * @return the trx id
     */
    public Long getTrxId() {
        return trxId;
    }

    /**
     * Sets trx id.
     *
     * @param trxId the trx id
     */
    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    /**
     * Gets trx pml id.
     *
     * @return the trx pml id
     */
    public Long getTrxPmlId() {
        return trxPmlId;
    }

    /**
     * Sets trx pml id.
     *
     * @param trxPmlId the trx pml id
     */
    public void setTrxPmlId(Long trxPmlId) {
        this.trxPmlId = trxPmlId;
    }

    /**
     * Gets pay perc.
     *
     * @return the pay perc
     */
    public Long getPayPerc() {
        return payPerc;
    }

    /**
     * Sets pay perc.
     *
     * @param payPerc the pay perc
     */
    public void setPayPerc(Long payPerc) {
        this.payPerc = payPerc;
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
     * Gets trx type.
     *
     * @return the trx type
     */
    public TrxTypes getTrxType() {
        return trxType;
    }

    /**
     * Sets trx type.
     *
     * @param trxType the trx type
     */
    public void setTrxType(TrxTypes trxType) {
        this.trxType = trxType;
    }
}
