package com.zenith.hrportal.service.leave.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenith.hrportal.entities.leave.LeaveType;
import com.zenith.hrportal.repository.LeaveTypeRepository;
import com.zenith.hrportal.service.leave.LeaveTypeService;

/**
 * The type Default leave type service.
 */
@Service
public class DefaultLeaveTypeService implements LeaveTypeService {
	
	@Autowired
	private LeaveTypeRepository leaveTypeRepository;
	
	@Override
	public List<LeaveType> getAll() {
		return leaveTypeRepository.findAll();
	}

}
