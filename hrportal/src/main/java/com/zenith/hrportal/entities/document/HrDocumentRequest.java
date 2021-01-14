package com.zenith.hrportal.entities.document;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.zenith.hrportal.entities.employee.Employee;

import java.util.Date;

/**
 * The type Hr document request.
 */
@Entity()
@Table(name = "HR_DOC_REQUEST")
public class HrDocumentRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "DOC_NO")
	private Long docNo;

	@Column(name = "DOC_DATE")
	private Date docDate;
	
	@Column(name = "CREATE_ON")
	private Date createOn;

	@ManyToOne
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "HRDT_ID",referencedColumnName = "ID")
	private HrDocumentType documentType;


	@Column(name = "EMP_PML_ID")
	private Long emplPmlId;
	
	@Column(name = "EMP_ID")
	private Long emplId;
	
	@Column(name = "COMP_CODE")
	private String compCode;
	
	@Column(name = "APPROVED")
	private Boolean approved = Boolean.FALSE;
	
	@Column(name = "REJECTED")
	private Boolean rejected = Boolean.FALSE;


    /**
     * Instantiates a new Hr document request.
     */
    public HrDocumentRequest() {
		super();
	}

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
     * Gets doc no.
     *
     * @return the doc no
     */
    public Long getDocNo() {
		return docNo;
	}

    /**
     * Sets doc no.
     *
     * @param docNo the doc no
     */
    public void setDocNo(Long docNo) {
		this.docNo = docNo;
	}

    /**
     * Gets doc date.
     *
     * @return the doc date
     */
    public Date getDocDate() {
		return docDate;
	}

    /**
     * Sets doc date.
     *
     * @param docDate the doc date
     */
    public void setDocDate(Date docDate) {
		this.docDate = docDate;
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
     * Gets document type.
     *
     * @return the document type
     */
    public HrDocumentType getDocumentType() {
		return documentType;
	}

    /**
     * Sets document type.
     *
     * @param documentType the document type
     */
    public void setDocumentType(HrDocumentType documentType) {
		this.documentType = documentType;
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
     * Gets create on.
     *
     * @return the create on
     */
    public Date getCreateOn() {
		return createOn;
	}

    /**
     * Sets create on.
     *
     * @param createOn the create on
     */
    public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

    /**
     * Gets approved.
     *
     * @return the approved
     */
    public Boolean getApproved() {
		return approved;
	}

    /**
     * Sets approved.
     *
     * @param approved the approved
     */
    public void setApproved(Boolean approved) {
		this.approved = approved;
	}

    /**
     * Gets rejected.
     *
     * @return the rejected
     */
    public Boolean getRejected() {
		return rejected;
	}

    /**
     * Sets rejected.
     *
     * @param rejected the rejected
     */
    public void setRejected(Boolean rejected) {
		this.rejected = rejected;
	}



}
