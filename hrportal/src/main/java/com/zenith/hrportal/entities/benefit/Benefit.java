package com.zenith.hrportal.entities.benefit;

import com.zenith.hrportal.entities.AbstractEntity;
import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.grademaster.TrxTypes;

import javax.persistence.*;
import java.util.Date;

/**
 * The type Benefit.
 */
@Entity
@Table(name = "PP_BENEFITS")
public class Benefit extends AbstractEntity {

    @EmbeddedId
    private BenefitIdentity benefitIdentity;

    @Column(name = "APPROVED_BY")
    private Long approvedBy;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "VALID_UPTO")
    private Date validUoTo;

    @Column(name = "FREQUENCY")
    private String frequency;

    @Column(name = "ADD_DEDUCT")
    private String addDeduct;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "CURRENT_BENF")
    private String currentBenef;

    @Column(name = "IDLE_AMOUNT")
    private Long idlAmount;

    @Column(name = "MONTH_AMOUNT")
    private Long mounthAmount;

    @Column(name = "REF")
    private String ref;

    @Column(name = "PPEH_ID")
    private String ppehId;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "EMP_ID", referencedColumnName = "ID",insertable = false,updatable = false),
            @JoinColumn(name = "EMP_PML_ID", referencedColumnName = "PML_ID",insertable = false, updatable = false)
    })
    private Employee employee;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "PPTRX_TRX_ID", referencedColumnName = "TRX_ID",insertable = false,updatable = false),
            @JoinColumn(name = "PPTRX_PML_ID", referencedColumnName = "PML_ID",insertable = false, updatable = false)

    })
    private TrxTypes trxTypes;
}

