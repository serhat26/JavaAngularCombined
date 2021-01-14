package com.zenith.hrportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.hrportal.entities.leave.LeaveType;
import com.zenith.hrportal.entities.leave.LeaveTypeIdentity;

/**
 * The interface Leave type repository.
 */
public interface LeaveTypeRepository extends JpaRepository<LeaveType, LeaveTypeIdentity>{

}
