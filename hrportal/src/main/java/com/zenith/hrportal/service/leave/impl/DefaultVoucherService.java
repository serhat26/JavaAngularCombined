package com.zenith.hrportal.service.leave.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenith.hrportal.entities.voucher.Voucher;
import com.zenith.hrportal.repository.VoucherRepository;
import com.zenith.hrportal.service.leave.VoucherService;

/**
 * The type Default voucher service.
 */
@Service
public class DefaultVoucherService implements VoucherService {
	
	@Autowired
	private VoucherRepository voucherRepository;
	
	@Override
	public List<Voucher> getAll() {
		return voucherRepository.findByVoucherIdentityCodeStartingWith("L");
	}

    /**
     * Sets voucher repository.
     *
     * @param voucherRepository the voucher repository
     */
    public void setVoucherRepository(VoucherRepository voucherRepository) {
		this.voucherRepository = voucherRepository;
	}

	
}
