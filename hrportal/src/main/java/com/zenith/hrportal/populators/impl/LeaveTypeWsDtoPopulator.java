package com.zenith.hrportal.populators.impl;

import com.zenith.hrportal.dto.leave.leaveTypeWsDTO;
import com.zenith.hrportal.entities.leave.LeaveType;
import com.zenith.hrportal.populators.Populator;

public class LeaveTypeWsDtoPopulator implements Populator<LeaveType,leaveTypeWsDTO> {

	@Override
	public void populate(LeaveType source, leaveTypeWsDTO target) {
		target.setId(source.getLeaveTypeIdentity().getId());
		target.setLeaveType(source.getLeaveType());
		target.setDescription(source.getDescription());
		target.setMaxDaysAllow(source.getMaxDaysAllow());
		target.setCarryOver(source.getCarryOver());
	}

}
