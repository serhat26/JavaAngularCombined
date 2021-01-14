package com.zenith.hrportal.rest;

import com.zenith.hrportal.constants.AuthoritiesConstants;
import com.zenith.hrportal.dto.leave.LeaveByMonthWsDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.zenith.hrportal.constants.FKConstants;
import com.zenith.hrportal.dto.leave.LeaveRequestWsDTO;
import com.zenith.hrportal.dto.leave.leaveTypeWsDTO;
import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.leave.LeaveRequestDetails;
import com.zenith.hrportal.entities.leave.LeaveRequestHeader;
import com.zenith.hrportal.entities.leave.LeaveType;
import com.zenith.hrportal.entities.voucher.VoucherIdentity;
import com.zenith.hrportal.populators.impl.LeaveTypeWsDtoPopulator;
import com.zenith.hrportal.service.employee.EmployeeService;
import com.zenith.hrportal.service.leave.LeaveRequestService;
import com.zenith.hrportal.service.leave.LeaveTypeService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The type Leave request controller.
 */
@Controller
@RequestMapping(value = "/api")
public class LeaveRequestController {

	private Logger LOG = LoggerFactory.getLogger(LeaveRequestController.class);
	
	@Autowired
	private LeaveRequestService leaveRequestService;
	
	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@Autowired
	private EmployeeService employeeService;
	
	private LeaveTypeWsDtoPopulator leaveTypeWsDtoPopulator = new LeaveTypeWsDtoPopulator();

	/**
	 * Save leave request response entity.
	 *
	 * @param leaveRequest the leave request
	 * @return the response entity
	 */
	@RequestMapping(value = "/leave-request/add",method = RequestMethod.POST)
	 @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.CREATE_LEAVE_REQUEST + "\")")
	  @ResponseBody
	  public ResponseEntity<Object> saveLeaveRequest(@RequestBody LeaveRequestHeader leaveRequest) {
		  try {  
			   populatemockedFKData(leaveRequest);	 
         	   LeaveRequestHeader result =  leaveRequestService.saveHeader(leaveRequest);
			   return new ResponseEntity<Object>(leaveRequest, HttpStatus.OK);
		  }catch(Exception ex) {
			  LOG.error("Error while saving  Leave Request "+ex.getMessage());
			  return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		  }
		 
	  }

	/**
	 * Save leave request with details response entity.
	 *
	 * @param leaveRequest the leave request
	 * @return the response entity
	 */
	@RequestMapping(value = "/leave-request/add-with-details",method = RequestMethod.POST)
	 @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.CREATE_LEAVE_REQUEST + "\")")
	  @ResponseBody
	  public ResponseEntity<Object> saveLeaveRequestWithDetails(@RequestBody LeaveRequestWsDTO leaveRequest) {
		  try {  
			  LeaveRequestHeader header = leaveRequest.getHeader();
			  List<LeaveRequestDetails> details = leaveRequest.getDetails();
			  populatemockedFKData(header);	 
			  
        	   LeaveRequestHeader headerResult =  leaveRequestService.saveHeader(header);
        	   Employee employee = headerResult.getEmployee();
        	   for(LeaveRequestDetails detail : details ) {
        		   LOG.error(detail.getFromDate().toString());
        		   detail.setPmlId(employee != null ? employee.getMatnPmlId() : null);
        		   detail.setLeaveRequestHeader(header);
            	   LeaveRequestDetails detailsResult = leaveRequestService.saveDetails(detail);       		   
        	   }
        	   
			   return new ResponseEntity<Object>(leaveRequest, HttpStatus.OK);
		  }catch(Exception ex) {
			  LOG.error("Error while saving  Leave Request "+ex.getMessage());
			  return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		  }
		 
	  }


	/**
	 * Get all list.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "leave-request/all", method = RequestMethod.GET)
	 @ResponseBody
	 public List<LeaveRequestHeader> getAll(){
		 List<LeaveRequestHeader> leaveTypes = leaveRequestService.getAll();
		 return leaveTypes;
	 }

	/**
	 * Get leave types list.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "leave-types/all", method = RequestMethod.GET)
	 @ResponseBody
	 public List<leaveTypeWsDTO> getLeaveTypes(){
		 List<leaveTypeWsDTO> result = new ArrayList<leaveTypeWsDTO>();
		 List<LeaveType> leaveTypes = leaveTypeService.getAll();
		 leaveTypes.stream().forEach(leaveType ->{
			 leaveTypeWsDTO dto = new leaveTypeWsDTO();
			 leaveTypeWsDtoPopulator.populate(leaveType, dto);
			 result.add(dto);
		 });
		 return result;
	 }

	/**
	 * Get unapproved leave request list.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "leave-request/pending", method = RequestMethod.GET)
	 @ResponseBody
	 public List<LeaveRequestHeader> getUnapprovedLeaveRequest(){
		 List<LeaveRequestHeader> unapprovedLeaveRequests = leaveRequestService.getPendingLeaveRequests();
		 return unapprovedLeaveRequests;
	 }

	/**
	 * Get approved leave request list.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "leave-request/approved", method = RequestMethod.GET)
	@ResponseBody
	public List<LeaveRequestHeader> getApprovedLeaveRequest(){
		List<LeaveRequestHeader> approvedLeaveRequests = leaveRequestService.getApprovedLeaveRequests();
		return approvedLeaveRequests;
	}

	/**
	 * Get pending leave request list.
	 *
	 * @return the list
	 */
	@RequestMapping(value = "leave-request/rejected", method = RequestMethod.GET)
	@ResponseBody
	public List<LeaveRequestHeader> getPendingLeaveRequest(){
		List<LeaveRequestHeader> pendingLeaveRequests = leaveRequestService.getRejectedLeaveRequests();
		return pendingLeaveRequests;
	}

	/**
	 * Check dates boolean.
	 *
	 * @param start the start
	 * @param end   the end
	 * @param empNo the emp no
	 * @return the boolean
	 */
	@RequestMapping(value = "leave-request/check-dates", method = RequestMethod.GET)
	 @ResponseBody
	 public Boolean checkDates(@RequestParam(name = "start", defaultValue = "01/01/1950") @DateTimeFormat(pattern = "dd/MM/yyyy")  Date start,
			 @RequestParam(name = "end", defaultValue = "01/01/1950") @DateTimeFormat(pattern = "dd/MM/yyyy") Date end, 
			 @RequestParam("employee")long  empNo){
		 Employee employee = employeeService.getByEmpNo(empNo);
		 return leaveRequestService.isValidLeaveRequestRange(start, end, employee);
	 }


	/**
	 * Approve leave request response entity.
	 *
	 * @param leaveRequest the leave request
	 * @return the response entity
	 */
	@RequestMapping(value = "/leave-request/pass",method = RequestMethod.POST)
	  @ResponseBody
	  public ResponseEntity<LeaveRequestHeader> approveLeaveRequest(@RequestBody LeaveRequestHeader leaveRequest) {
		 LeaveRequestHeader passedLR = leaveRequestService.pass(leaveRequest);		 
		 return new ResponseEntity<LeaveRequestHeader>(passedLR, HttpStatus.OK);
	  }

	/**
	 * Reject leave request response entity.
	 *
	 * @param leaveRequest the leave request
	 * @return the response entity
	 */
	@RequestMapping(value = "/leave-request/reject",method = RequestMethod.POST)
	  @ResponseBody
	  public ResponseEntity<LeaveRequestHeader> rejectLeaveRequest(@RequestBody LeaveRequestHeader leaveRequest) {
		 LeaveRequestHeader rejectedLR = leaveRequestService.reject(leaveRequest);
		 return new ResponseEntity<LeaveRequestHeader>(rejectedLR, HttpStatus.OK);
	  }

	/**
	 * Gets leaves by month.
	 *
	 * @param year the year
	 * @return the leaves by month
	 */
	@RequestMapping(value = "/leave-request/by-month/{year}",method = RequestMethod.GET)
	@ResponseBody
	public List< LeaveByMonthWsDTO >  getLeavesByMonth(@PathVariable int year) {
		List< LeaveByMonthWsDTO > leaveByMonthWsDTOS = leaveRequestService.getLeaveRequestByMonth(year);
		return leaveByMonthWsDTOS;
	}



	private void populatemockedFKData(LeaveRequestHeader leaveRequest) {
		leaveRequest.setEmplPmlId(leaveRequest.getEmployee().getEmployeeIdentity().getPmlId());
		   leaveRequest.setEmplId(leaveRequest.getEmployee().getEmployeeIdentity().getId());
		   leaveRequest.setBrncCode(FKConstants.BRNC_CODE);
		   leaveRequest.setBrncCompCode(FKConstants.BRNC_COMP_CODE);
		   leaveRequest.setApprPpapprlId(FKConstants.APPR_PPAPPRL_ID);
		   
		   VoucherIdentity voucherIdentity = leaveRequest.getVoucher().getVoucherIdentity();
		   leaveRequest.setVtypeDocType(voucherIdentity.getVtypeDocType());
		   leaveRequest.setVtypeModsModule(voucherIdentity.getVtypeModsModule());
		   leaveRequest.setFyerId(voucherIdentity.getFyerId());
		   leaveRequest.setVoucherCode(voucherIdentity.getCode());
		   leaveRequest.setCompCode(voucherIdentity.getCompCode());
	}
}
