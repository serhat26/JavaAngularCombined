package com.zenith.hrportal.dto.leave;

import java.util.List;

import com.zenith.hrportal.entities.leave.LeaveRequestDetails;
import com.zenith.hrportal.entities.leave.LeaveRequestHeader;

/**
 * The type Leave request ws dto.
 */
public class LeaveRequestWsDTO {
	
	private LeaveRequestHeader header;
	private List<LeaveRequestDetails> details;

    /**
     * Gets header.
     *
     * @return the header
     */
    public LeaveRequestHeader getHeader() {
		return header;
	}

    /**
     * Sets header.
     *
     * @param header the header
     */
    public void setHeader(LeaveRequestHeader header) {
		this.header = header;
	}

    /**
     * Gets details.
     *
     * @return the details
     */
    public List<LeaveRequestDetails> getDetails() {
		return details;
	}

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(List<LeaveRequestDetails> details) {
		this.details = details;
	}
	
	
	

}
