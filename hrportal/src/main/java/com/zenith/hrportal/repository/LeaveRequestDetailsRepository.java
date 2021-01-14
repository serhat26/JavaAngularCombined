package com.zenith.hrportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.hrportal.entities.leave.LeaveRequestDetails;
import com.zenith.hrportal.entities.leave.LeaveRequestHeader;

/**
 * The interface Leave request details repository.
 */
public interface LeaveRequestDetailsRepository extends  JpaRepository<LeaveRequestDetails, Long> {

    /**
     * Find by leave request header list.
     *
     * @param leaveRequestHeader the leave request header
     * @return the list
     */
    List<LeaveRequestDetails> findByLeaveRequestHeader(LeaveRequestHeader leaveRequestHeader);
}
