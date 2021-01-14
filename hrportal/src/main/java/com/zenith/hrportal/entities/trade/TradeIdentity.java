package com.zenith.hrportal.entities.trade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * The type Trade identity.
 */
@Embeddable
public class TradeIdentity implements Serializable {
	
	@Column(name = "CODE")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long code;
	
	@Column(name = "COMP_CODE")
	private String compCode;
	
	@Column(name = "PML_ID")
	private Long pmlId;

    /**
     * Instantiates a new Trade identity.
     */
    public TradeIdentity() {
	}

    /**
     * Instantiates a new Trade identity.
     *
     * @param code     the code
     * @param compCode the comp code
     * @param pmlId    the pml id
     */
    public TradeIdentity(Long code, String compCode, Long pmlId) {
		this.code = code;
		this.compCode = compCode;
		this.pmlId = pmlId;
	}


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
     * Gets comp code.
     *
     * @return the comp code
     */
    public String getCompCode() {
		return compCode;
	}

    /**
     * Sets comp code.
     *
     * @param compCode the comp code
     */
    public void setCompCode(String compCode) {
		this.compCode = compCode;
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
