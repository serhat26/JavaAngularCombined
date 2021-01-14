package com.zenith.hrportal.service.leave;

import java.util.List;

import com.zenith.hrportal.entities.leave.LeaveType;

/**
 * The interface Leave type service.
 */
public interface LeaveTypeService {

    /**
     * Gets all.
     *
     * @return the all
     */
    List<LeaveType> getAll();

}
