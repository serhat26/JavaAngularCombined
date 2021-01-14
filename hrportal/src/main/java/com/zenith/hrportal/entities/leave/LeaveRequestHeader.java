package com.zenith.hrportal.entities.leave;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.zenith.hrportal.entities.voucher.Voucher;
import com.zenith.hrportal.entities.employee.Employee;

/**
 * The type Leave request header.
 */
@Entity
@Table(name = "PP_LEAVE_REQ_HDRS")
public class LeaveRequestHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "APPLY_DATE")
	private Date applyDate;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	@ManyToOne
	private Employee employee;
	
	@Column(name = "EMP_PML_ID")
	private Long emplPmlId;
	
	@Column(name = "EMP_ID")
	private Long emplId;
	
	@Column(name = "BRNC_COMP_CODE")
	private String brncCompCode;
	
	@Column(name = "BRNC_CODE")
	private String brncCode;
	
	@Column(name = "APPR_PPAPPRL_ID")
	private String apprPpapprlId;
	
	@Column(name = "REJ_PPAPPRL_ID")
	private String rejPpapprlId;
	
	@Column(name = "FROM_DATE")
	private Date fromDate;
	
	@Column(name = "TO_DATE")
	private Date toDate;
	

	@Column(name = "US_VTYPE_DOC_TYPE")
	@NotNull
	private String vtypeDocType;
	
	@Column(name = "US_VTYPE_MODS_MODULE")
	@NotNull
	private String vtypeModsModule;
	
	@Column(name = "US_CODE")
	private String voucherCode;
	
	@Column(name = "US_COMP_CODE")
	@NotNull
	private String compCode;
	
	@Column(name = "US_FYER_ID")
	@NotNull
	private Long fyerId;
	
	@Column(name = "PASS")
	private String pass;
	
	@Column(name = "REJECT")
	private String reject;
	
	@Column(name = "REJ_REMARKS")
	private String rejectRemarks;
	
	@Column(name = "REJECT_ON")
	private Date rejectedOn;
	
	@Column(name = "PASS_ON")
	private Date passedOn;
	@ManyToOne
	private Voucher voucher;

	@Column(name = "CREATE_ON")
	private Date createdOn;

	@Column(name = "CREATE_BY")
	private String createdBy;

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
     * Gets apply date.
     *
     * @return the apply date
     */
    public Date getApplyDate() {
		return applyDate;
	}

    /**
     * Sets apply date.
     *
     * @param applyDate the apply date
     */
    public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

    /**
     * Gets employee.
     *
     * @return the employee
     */
    public Employee getEmployee() {
		return employee;
	}

    /**
     * Sets employee.
     *
     * @param employee the employee
     */
    public void setEmployee(Employee employee) {
		this.employee = employee;
	}

    /**
     * Gets empl pml id.
     *
     * @return the empl pml id
     */
    public Long getEmplPmlId() {
		return emplPmlId;
	}

    /**
     * Sets empl pml id.
     *
     * @param emplPmlId the empl pml id
     */
    public void setEmplPmlId(Long emplPmlId) {
		this.emplPmlId = emplPmlId;
	}

    /**
     * Gets empl id.
     *
     * @return the empl id
     */
    public Long getEmplId() {
		return emplId;
	}

    /**
     * Sets empl id.
     *
     * @param emplId the empl id
     */
    public void setEmplId(Long emplId) {
		this.emplId = emplId;
	}

    /**
     * Gets brnc comp code.
     *
     * @return the brnc comp code
     */
    public String getBrncCompCode() {
		return brncCompCode;
	}

    /**
     * Sets brnc comp code.
     *
     * @param brncCompCode the brnc comp code
     */
    public void setBrncCompCode(String brncCompCode) {
		this.brncCompCode = brncCompCode;
	}

    /**
     * Gets brnc code.
     *
     * @return the brnc code
     */
    public String getBrncCode() {
		return brncCode;
	}

    /**
     * Sets brnc code.
     *
     * @param brncCode the brnc code
     */
    public void setBrncCode(String brncCode) {
		this.brncCode = brncCode;
	}

    /**
     * Gets appr ppapprl id.
     *
     * @return the appr ppapprl id
     */
    public String getApprPpapprlId() {
		return apprPpapprlId;
	}

    /**
     * Sets appr ppapprl id.
     *
     * @param apprPpapprlId the appr ppapprl id
     */
    public void setApprPpapprlId(String apprPpapprlId) {
		this.apprPpapprlId = apprPpapprlId;
	}

    /**
     * Gets rej ppapprl id.
     *
     * @return the rej ppapprl id
     */
    public String getRejPpapprlId() {
		return rejPpapprlId;
	}

    /**
     * Sets rej ppapprl id.
     *
     * @param rejPpapprlId the rej ppapprl id
     */
    public void setRejPpapprlId(String rejPpapprlId) {
		this.rejPpapprlId = rejPpapprlId;
	}

    /**
     * Gets voucher.
     *
     * @return the voucher
     */
    public Voucher getVoucher() {
		return voucher;
	}

    /**
     * Sets voucher.
     *
     * @param voucher the voucher
     */
    public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

    /**
     * Gets vtype doc type.
     *
     * @return the vtype doc type
     */
    public String getVtypeDocType() {
		return vtypeDocType;
	}

    /**
     * Sets vtype doc type.
     *
     * @param vtypeDocType the vtype doc type
     */
    public void setVtypeDocType(String vtypeDocType) {
		this.vtypeDocType = vtypeDocType;
	}

    /**
     * Gets vtype mods module.
     *
     * @return the vtype mods module
     */
    public String getVtypeModsModule() {
		return vtypeModsModule;
	}

    /**
     * Sets vtype mods module.
     *
     * @param vtypeModsModule the vtype mods module
     */
    public void setVtypeModsModule(String vtypeModsModule) {
		this.vtypeModsModule = vtypeModsModule;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return voucherCode;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.voucherCode = code;
	}

    /**
     * Gets voucher code.
     *
     * @return the voucher code
     */
    public String getVoucherCode() {
		return voucherCode;
	}

    /**
     * Sets voucher code.
     *
     * @param voucherCode the voucher code
     */
    public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

    /**
     * Gets comp code.
     *
     * @return the comp code
     */
    public String getCompCode() {
		return compCode;
	}

    /**
     * Sets comp code.
     *
     * @param compCode the comp code
     */
    public void setCompCode(String compCode) {
		this.compCode = compCode;
	}

    /**
     * Gets fyer id.
     *
     * @return the fyer id
     */
    public Long getFyerId() {
		return fyerId;
	}

    /**
     * Sets fyer id.
     *
     * @param fyerId the fyer id
     */
    public void setFyerId(Long fyerId) {
		this.fyerId = fyerId;
	}

    /**
     * Gets remarks.
     *
     * @return the remarks
     */
    public String getRemarks() {
		return remarks;
	}

    /**
     * Sets remarks.
     *
     * @param remarks the remarks
     */
    public void setRemarks(String remarks) {
		this.remarks = remarks;
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
     * Gets pass.
     *
     * @return the pass
     */
    public String getPass() {
		return pass;
	}

    /**
     * Sets pass.
     *
     * @param pass the pass
     */
    public void setPass(String pass) {
		this.pass = pass;
	}

    /**
     * Gets reject remarks.
     *
     * @return the reject remarks
     */
    public String getRejectRemarks() {
		return rejectRemarks;
	}

    /**
     * Sets reject remarks.
     *
     * @param rejectRemarks the reject remarks
     */
    public void setRejectRemarks(String rejectRemarks) {
		this.rejectRemarks = rejectRemarks;
	}

    /**
     * Gets rejected on.
     *
     * @return the rejected on
     */
    public Date getRejectedOn() {
		return rejectedOn;
	}

    /**
     * Sets rejected on.
     *
     * @param rejectedOn the rejected on
     */
    public void setRejectedOn(Date rejectedOn) {
		this.rejectedOn = rejectedOn;
	}

    /**
     * Gets passed on.
     *
     * @return the passed on
     */
    public Date getPassedOn() {
		return passedOn;
	}

    /**
     * Sets passed on.
     *
     * @param passedOn the passed on
     */
    public void setPassedOn(Date passedOn) {
		this.passedOn = passedOn;
	}

    /**
     * Gets reject.
     *
     * @return the reject
     */
    public String getReject() {
		return reject;
	}

    /**
     * Sets reject.
     *
     * @param reject the reject
     */
    public void setReject(String reject) {
		this.reject = reject;
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
}
