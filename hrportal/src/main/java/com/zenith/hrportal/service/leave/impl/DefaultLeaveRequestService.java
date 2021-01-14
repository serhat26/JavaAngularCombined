package com.zenith.hrportal.service.leave.impl;

import java.text.DateFormatSymbols;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zenith.hrportal.dto.leave.LeaveByMonthWsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.leave.LeaveRequestDetails;
import com.zenith.hrportal.entities.leave.LeaveRequestHeader;
import com.zenith.hrportal.repository.LeaveRequestDetailsRepository;
import com.zenith.hrportal.repository.LeaveRequestHeaderRepository;
import com.zenith.hrportal.service.leave.LeaveRequestService;

/**
 * The type Default leave request service.
 */
@Service
public class DefaultLeaveRequestService implements LeaveRequestService{

	private static final  String YES ="Y";
	private static final  String NO ="N";
	
	private static Logger LOG = LoggerFactory.getLogger(DefaultLeaveRequestService.class);
	@Autowired
	private LeaveRequestHeaderRepository leaveRequestHeaderRepository;
	
	@Autowired
	private LeaveRequestDetailsRepository leaveRequestDetailsRepository;
	
	
	@Override
	public LeaveRequestHeader saveHeader(LeaveRequestHeader leaveRequest) {
		leaveRequest.setCreatedOn(new Date());
		return leaveRequestHeaderRepository.save(leaveRequest);	
	}
	
	@Override
	public LeaveRequestDetails saveDetails(LeaveRequestDetails leaveRequestDetails) {
		leaveRequestDetails.setCreatedOn(new Date());
		return leaveRequestDetailsRepository.save(leaveRequestDetails);
	}

	@Override
	public List<LeaveRequestHeader> getAll() {
		return leaveRequestHeaderRepository.findAll();
	}

	@Override
	public List<LeaveRequestHeader> getPendingLeaveRequests() {
		return leaveRequestHeaderRepository.findByPassIsNull();
	}
	
	@Override
	public LeaveRequestHeader pass(LeaveRequestHeader leaveRequest) {
		leaveRequest.setPass(YES);
		leaveRequest.setPassedOn(new Date());
		return leaveRequestHeaderRepository.save(leaveRequest);
	}
	
	@Override
	public LeaveRequestHeader reject(LeaveRequestHeader leaveRequest) {
		leaveRequest.setReject(NO);
		leaveRequest.setRejectedOn(new Date());
		return leaveRequestHeaderRepository.save(leaveRequest);
	}


    /**
     * Sets leave request repository.
     *
     * @param leaveRequestRepository the leave request repository
     */
    public void setLeaveRequestRepository(LeaveRequestHeaderRepository leaveRequestRepository) {
		this.leaveRequestHeaderRepository = leaveRequestRepository;
	}
	
	@Override
	public boolean isValidLeaveRequestRange(Date start, Date end, Employee employee) {
		List<LeaveRequestHeader> leaveRequestHeaders = leaveRequestHeaderRepository.findByEmployee(employee);
		for(LeaveRequestHeader leaveRequestHeader : leaveRequestHeaders) {
			List<LeaveRequestDetails> leaveRequestDetails = leaveRequestDetailsRepository.findByLeaveRequestHeader(leaveRequestHeader);
			for(LeaveRequestDetails leaveRequestDetail : leaveRequestDetails) {
				LOG.info(leaveRequestDetail.getFromDate().toString());
				LOG.info(leaveRequestDetail.getToDate().toString());
				if(start.after(leaveRequestDetail.getToDate()) && end.before(leaveRequestDetail.getToDate())) {
					
					LOG.warn("Range : "+start.toString()+" - "+end.toString()+" for leave request is not valid");
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public List<LeaveRequestHeader> getApprovedLeaveRequests() {
		return leaveRequestHeaderRepository.findByPass("Y");

	}

	@Override
	public List<LeaveRequestHeader> getRejectedLeaveRequests() {
		return leaveRequestHeaderRepository.findByPass("N");
	}

	@Override
	public List< LeaveByMonthWsDTO > getLeaveRequestByMonth(int year) {
		List< LeaveByMonthWsDTO > result = new ArrayList<>();
		String[] months = new DateFormatSymbols().getMonths();
		for (int i = 0; i < months.length; i++) {
			String month = months[i];
			long count = leaveRequestHeaderRepository.findByCreatedOnMonth(year,i+1).size();
			result.add(new LeaveByMonthWsDTO(month,count));
		}
		return result;
	}
}
