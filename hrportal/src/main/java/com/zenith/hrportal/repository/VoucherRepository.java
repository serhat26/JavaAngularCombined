package com.zenith.hrportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.hrportal.entities.voucher.Voucher;
import com.zenith.hrportal.entities.voucher.VoucherIdentity;

/**
 * The interface Voucher repository.
 */
public interface VoucherRepository extends JpaRepository<Voucher, VoucherIdentity> {

    /**
     * Find by voucher identity code starting with list.
     *
     * @param code the code
     * @return the list
     */
    List<Voucher> findByVoucherIdentityCodeStartingWith(String code);
	
	
	


}
