package com.zenith.hrportal.entities.voucher;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * The type Voucher identity.
 */
@Embeddable
public class VoucherIdentity implements Serializable {
	
	@Column(name = "COMP_CODE")
	@NotNull
	private String compCode;
	
	@Column(name = "FYER_ID")
	@NotNull
	private Long fyerId;
	
	@Column(name = "VTYPE_DOC_TYPE")
	@NotNull
	private String vtypeDocType;
	
	@Column(name = "VTYPE_MODS_MODULE")
	@NotNull
	private String vtypeModsModule;
	
	@Column(name = "CODE")
	private String code;

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
     * Gets fyer id.
     *
     * @return the fyer id
     */
    public Long getFyerId() {
		return fyerId;
	}

    /**
     * Sets fyer id.
     *
     * @param fyerId the fyer id
     */
    public void setFyerId(Long fyerId) {
		this.fyerId = fyerId;
	}

    /**
     * Gets vtype doc type.
     *
     * @return the vtype doc type
     */
    public String getVtypeDocType() {
		return vtypeDocType;
	}

    /**
     * Sets vtype doc type.
     *
     * @param vtypeDocType the vtype doc type
     */
    public void setVtypeDocType(String vtypeDocType) {
		this.vtypeDocType = vtypeDocType;
	}

    /**
     * Gets vtype mods module.
     *
     * @return the vtype mods module
     */
    public String getVtypeModsModule() {
		return vtypeModsModule;
	}

    /**
     * Sets vtype mods module.
     *
     * @param vtypeModsModule the vtype mods module
     */
    public void setVtypeModsModule(String vtypeModsModule) {
		this.vtypeModsModule = vtypeModsModule;
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
