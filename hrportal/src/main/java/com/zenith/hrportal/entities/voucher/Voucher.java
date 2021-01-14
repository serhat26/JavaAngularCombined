package com.zenith.hrportal.entities.voucher;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Voucher.
 */
@Entity
@Table(name = "PP_VOUCHERS")
public class Voucher implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VoucherIdentity voucherIdentity;

    /**
     * Gets voucher identity.
     *
     * @return the voucher identity
     */
    public VoucherIdentity getVoucherIdentity() {
		return voucherIdentity;
	}

    /**
     * Sets voucher identity.
     *
     * @param voucherIdentity the voucher identity
     */
    public void setVoucherIdentity(VoucherIdentity voucherIdentity) {
		this.voucherIdentity = voucherIdentity;
	}
	
	
	
	

}
