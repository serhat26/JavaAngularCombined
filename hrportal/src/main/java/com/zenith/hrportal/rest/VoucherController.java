package com.zenith.hrportal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zenith.hrportal.entities.voucher.Voucher;
import com.zenith.hrportal.service.leave.VoucherService;

/**
 * The type Voucher controller.
 */
@RestController
@RequestMapping(value = "/api")
public class VoucherController {
	
	@Autowired
	private VoucherService voucherService;

	/**
	 * Get all employees list.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "/vouchers", method = RequestMethod.GET)
	  @ResponseBody
	  public List<Voucher> getAllEmployees(){
		  return voucherService.getAll();
	  }

}
