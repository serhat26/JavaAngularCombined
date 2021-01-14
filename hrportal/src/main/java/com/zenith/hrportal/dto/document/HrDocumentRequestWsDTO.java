package com.zenith.hrportal.dto.document;
import com.zenith.hrportal.entities.employee.Employee;

import java.util.Date;

/**
 * The type Hr document request ws dto.
 */
public class HrDocumentRequestWsDTO {

    private Long id;
    private Long docNo;
    private Date docDate;
    private Date createOn;
    private Employee employee;
    private DocumentTypeWsDTO documentType;
    private Long emplPmlId;
    private Long emplId;
    private String compCode;
    private Boolean approved = Boolean.FALSE;
    private Boolean rejected = Boolean.FALSE;

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
    public DocumentTypeWsDTO getDocumentType() {
        return documentType;
    }

    /**
     * Sets document type.
     *
     * @param documentType the document type
     */
    public void setDocumentType(DocumentTypeWsDTO documentType) {
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
