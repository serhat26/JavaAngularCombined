package com.zenith.hrportal.entities.leave;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * The type Leave request details.
 */
@Entity
@Table(
		name = "PP_LEAVE_REQ_DETLS",
		uniqueConstraints={
			    @UniqueConstraint(columnNames = {"ID", "PPRQ_HDID"})
		})
public class LeaveRequestDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ID")
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "CREATE_ON")
	private Date createdOn;
	
	@ManyToOne
	@JoinColumn(name = "PPRQ_HDID",referencedColumnName = "ID")
	private LeaveRequestHeader leaveRequestHeader;
	
	@Column(name = "CREATE_BY")
	private String createdBy;
	
	@Column(name = "LVTYPE_LEAVE_ID")
	private Long leaveTypeId;
	
	@Column(name = "FROM_DATE")
	private Date fromDate;
	
	@Column(name = "TO_DATE")
	private Date toDate;
	
	@Column(name = "NO_OF_DYS")
	private Long numberOfDays;
	
	@Column(name = "LVTYPE_PML_ID")
	private Long pmlId;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
		return id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets created on.
     *
     * @return the created on
     */
    public Date getCreatedOn() {
		return createdOn;
	}

    /**
     * Sets created on.
     *
     * @param createdOn the created on
     */
    public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

    /**
     * Gets leave request header.
     *
     * @return the leave request header
     */
    public LeaveRequestHeader getLeaveRequestHeader() {
		return leaveRequestHeader;
	}

    /**
     * Sets leave request header.
     *
     * @param leaveRequestHeader the leave request header
     */
    public void setLeaveRequestHeader(LeaveRequestHeader leaveRequestHeader) {
		this.leaveRequestHeader = leaveRequestHeader;
	}

    /**
     * Gets created by.
     *
     * @return the created by
     */
    public String getCreatedBy() {
		return createdBy;
	}

    /**
     * Sets created by.
     *
     * @param createdBy the created by
     */
    public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

    /**
     * Gets leave type id.
     *
     * @return the leave type id
     */
    public Long getLeaveTypeId() {
		return leaveTypeId;
	}

    /**
     * Sets leave type id.
     *
     * @param leaveTypeId the leave type id
     */
    public void setLeaveTypeId(Long leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

    /**
     * Gets from date.
     *
     * @return the from date
     */
    public Date getFromDate() {
		return fromDate;
	}

    /**
     * Sets from date.
     *
     * @param fromDate the from date
     */
    public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

    /**
     * Gets to date.
     *
     * @return the to date
     */
    public Date getToDate() {
		return toDate;
	}

    /**
     * Sets to date.
     *
     * @param toDate the to date
     */
    public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

    /**
     * Gets number of days.
     *
     * @return the number of days
     */
    public Long getNumberOfDays() {
		return numberOfDays;
	}

    /**
     * Sets number of days.
     *
     * @param numberOfDays the number of days
     */
    public void setNumberOfDays(Long numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

    /**
     * Gets pml id.
     *
     * @return the pml id
     */
    public Long getPmlId() {
		return pmlId;
	}

    /**
     * Sets pml id.
     *
     * @param pmlId the pml id
     */
    public void setPmlId(Long pmlId) {
		this.pmlId = pmlId;
	}
	
	
	

}
