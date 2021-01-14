package com.zenith.hrportal.service.leave;

import java.util.List;

import com.zenith.hrportal.entities.voucher.Voucher;

/**
 * The interface Voucher service.
 */
public interface VoucherService {

    /**
     * Gets all.
     *
     * @return the all
     */
    List<Voucher> getAll();
}
