package com.zenith.hrportal.entities.grademaster;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Trx types identity.
 */
@Embeddable
public class TrxTypesIdentity implements Serializable {

    @Column(name = "TRX_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trxId;

    @Column(name = "PML_ID")
    private Long pmlId;

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
