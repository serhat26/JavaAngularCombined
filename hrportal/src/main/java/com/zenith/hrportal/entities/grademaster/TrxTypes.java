package com.zenith.hrportal.entities.grademaster;

import com.zenith.hrportal.listeners.TrxTypesListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The type Trx types.
 */
@Entity
@Table(name = "PP_TRX_TYPES")
public class TrxTypes implements Serializable {

   /* @EmbeddedId
    private TrxTypesIdentity trxTypesIdentity;
*/

    @Id
    @Column(name = "TRX_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trxId;

    @Column(name = "PML_ID")
    private Long pmlId;

    @Column(name = "CODE",columnDefinition="serial")
    private Long code;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "UPDATE_BY")
    private String updatedBy;

    @Column(name = "UPDATE_ON")
    private Date updatedOn;

    @Column(name = "CREATE_BY")
    private String createdBy;

    @Column(name = "CREATE_ON")
    private Date createdOn;

    @Column(name = "TRX_TYPE")
    private String trxType;

    @Column(name = "ADD_DEDUCT")
    private String adDeduct;

    @Column(name = "PAY")
    private String pay;

    @Column(name = "ALLOW_TYPE")
    private String allowType;

    @Column(name = "PAY_SUBCONT")
    private String paySubCont;

    /**
     * Gets code.
     *
     * @return the code
     */
    public Long getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(Long code) {
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
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
    public String getTrxType() {
        return trxType;
    }

    /**
     * Sets trx type.
     *
     * @param trxType the trx type
     */
    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    /**
     * Gets ad deduct.
     *
     * @return the ad deduct
     */
    public String getAdDeduct() {
        return adDeduct;
    }

    /**
     * Sets ad deduct.
     *
     * @param adDeduct the ad deduct
     */
    public void setAdDeduct(String adDeduct) {
        this.adDeduct = adDeduct;
    }

    /**
     * Gets pay.
     *
     * @return the pay
     */
    public String getPay() {
        return pay;
    }

    /**
     * Sets pay.
     *
     * @param pay the pay
     */
    public void setPay(String pay) {
        this.pay = pay;
    }

    /**
     * Gets allow type.
     *
     * @return the allow type
     */
    public String getAllowType() {
        return allowType;
    }

    /**
     * Sets allow type.
     *
     * @param allowType the allow type
     */
    public void setAllowType(String allowType) {
        this.allowType = allowType;
    }

    /**
     * Gets pay sub cont.
     *
     * @return the pay sub cont
     */
    public String getPaySubCont() {
        return paySubCont;
    }

    /**
     * Sets pay sub cont.
     *
     * @param paySubCont the pay sub cont
     */
    public void setPaySubCont(String paySubCont) {
        this.paySubCont = paySubCont;
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
