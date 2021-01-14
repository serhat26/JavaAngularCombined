package com.zenith.hrportal.entities.benefit;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * The type Benefit identity.
 */
@Embeddable
public class BenefitIdentity implements Serializable {

    @Column(name = "EFFECTIVE_FROM")
    private Date effectiveFrom;

    @Column(name = "EMP_PML_ID")
    private Long pmlId;

    @Column(name = "EMP_ID")
    private Long empId;

    @Column(name = "PPTRX_TRX_ID")
    private Long trxId;

    @Column(name = "PPTRX_PML_ID")
    private Long trxPmlId;
}
