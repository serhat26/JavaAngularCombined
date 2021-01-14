package com.zenith.hrportal.service.leave;

import java.util.Date;
import java.util.List;

import com.zenith.hrportal.dto.leave.LeaveByMonthWsDTO;
import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.leave.LeaveRequestDetails;
import com.zenith.hrportal.entities.leave.LeaveRequestHeader;

/**
 * The interface Leave request service.
 */
public interface LeaveRequestService {


    /**
     * Save header leave request header.
     *
     * @param leaveRequestHeader the leave request header
     * @return the leave request header
     */
    LeaveRequestHeader saveHeader(LeaveRequestHeader leaveRequestHeader);

    /**
     * Save details leave request details.
     *
     * @param leaveRequestDetails the leave request details
     * @return the leave request details
     */
    LeaveRequestDetails saveDetails(LeaveRequestDetails leaveRequestDetails);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<LeaveRequestHeader> getAll();

    /**
     * Gets pending leave requests.
     *
     * @return the pending leave requests
     */
    List<LeaveRequestHeader> getPendingLeaveRequests();

    /**
     * Pass leave request header.
     *
     * @param leaveRequest the leave request
     * @return the leave request header
     */
    LeaveRequestHeader pass(LeaveRequestHeader leaveRequest);

    /**
     * Reject leave request header.
     *
     * @param leaveRequest the leave request
     * @return the leave request header
     */
    LeaveRequestHeader reject(LeaveRequestHeader leaveRequest);

    /**
     * Is valid leave request range boolean.
     *
     * @param start    the start
     * @param end      the end
     * @param employee the employee
     * @return the boolean
     */
    boolean isValidLeaveRequestRange(Date start,Date end, Employee employee);

    /**
     * Gets approved leave requests.
     *
     * @return the approved leave requests
     */
    List<LeaveRequestHeader> getApprovedLeaveRequests();

    /**
     * Gets rejected leave requests.
     *
     * @return the rejected leave requests
     */
    List<LeaveRequestHeader> getRejectedLeaveRequests();

    /**
     * Gets leave request by month.
     *
     * @param year the year
     * @return the leave request by month
     */
    List< LeaveByMonthWsDTO > getLeaveRequestByMonth(int year);
}
