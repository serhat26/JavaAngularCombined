package com.zenith.hrportal.dto.leave;

import java.util.Date;

import javax.persistence.Column;

/**
 * The type Leave type ws dto.
 */
public class leaveTypeWsDTO {

	private Long id;
	
	private String leaveType;
	
	private String description;
	
	private String paid;
	
	private String updateBy;
	
	private Date updateDate;
	
	private String carryOver;
	
	private String entitle;
	
	private String type;
	
	private long maxDaysAllow;
	
	private Long maxDaysCF;

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
     * Gets leave type.
     *
     * @return the leave type
     */
    public String getLeaveType() {
		return leaveType;
	}

    /**
     * Sets leave type.
     *
     * @param leaveType the leave type
     */
    public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets paid.
     *
     * @return the paid
     */
    public String getPaid() {
		return paid;
	}

    /**
     * Sets paid.
     *
     * @param paid the paid
     */
    public void setPaid(String paid) {
		this.paid = paid;
	}

    /**
     * Gets update by.
     *
     * @return the update by
     */
    public String getUpdateBy() {
		return updateBy;
	}

    /**
     * Sets update by.
     *
     * @param updateBy the update by
     */
    public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

    /**
     * Gets update date.
     *
     * @return the update date
     */
    public Date getUpdateDate() {
		return updateDate;
	}

    /**
     * Sets update date.
     *
     * @param updateDate the update date
     */
    public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

    /**
     * Gets carry over.
     *
     * @return the carry over
     */
    public String getCarryOver() {
		return carryOver;
	}

    /**
     * Sets carry over.
     *
     * @param carryOver the carry over
     */
    public void setCarryOver(String carryOver) {
		this.carryOver = carryOver;
	}

    /**
     * Gets entitle.
     *
     * @return the entitle
     */
    public String getEntitle() {
		return entitle;
	}

    /**
     * Sets entitle.
     *
     * @param entitle the entitle
     */
    public void setEntitle(String entitle) {
		this.entitle = entitle;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets max days allow.
     *
     * @return the max days allow
     */
    public long getMaxDaysAllow() {
		return maxDaysAllow;
	}

    /**
     * Sets max days allow.
     *
     * @param maxDaysAllow the max days allow
     */
    public void setMaxDaysAllow(long maxDaysAllow) {
		this.maxDaysAllow = maxDaysAllow;
	}

    /**
     * Gets max days cf.
     *
     * @return the max days cf
     */
    public Long getMaxDaysCF() {
		return maxDaysCF;
	}

    /**
     * Sets max days cf.
     *
     * @param maxDaysCF the max days cf
     */
    public void setMaxDaysCF(Long maxDaysCF) {
		this.maxDaysCF = maxDaysCF;
	}
	
	
}
