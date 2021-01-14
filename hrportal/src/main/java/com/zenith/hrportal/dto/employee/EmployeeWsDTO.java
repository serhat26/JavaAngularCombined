package com.zenith.hrportal.dto.employee;

import com.zenith.hrportal.entities.department.Departement;
import com.zenith.hrportal.entities.employee.EmployeeType;
import com.zenith.hrportal.entities.nationnality.Nationality;
import com.zenith.hrportal.entities.trade.Trade;

import java.util.Date;

/**
 * The type Employee ws dto.
 */
public class EmployeeWsDTO {

    private Long empNo;
    private String name;
    private Date doj;
    private Date dob;
    private String compCode;
    private EmployeeType employeeType;
    private Departement departement;
    private Trade profession;
    private Nationality nationality;
    private Long matnPmlId;
    private Long matnMatId;
    private Long ppEmpTypeId;
    private Long levBalDays;
    private Long levBalprov;
    private Long gratuityProv;
    private Long gratuityDays;
    private String grade;
    private String gender;
    private String bankAcno;
    private String bankName;

    /**
     * Gets emp no.
     *
     * @return the emp no
     */
    public Long getEmpNo() {
        return empNo;
    }

    /**
     * Sets emp no.
     *
     * @param empNo the emp no
     */
    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets doj.
     *
     * @return the doj
     */
    public Date getDoj() {
        return doj;
    }

    /**
     * Sets doj.
     *
     * @param doj the doj
     */
    public void setDoj(Date doj) {
        this.doj = doj;
    }

    /**
     * Gets dob.
     *
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * Sets dob.
     *
     * @param dob the dob
     */
    public void setDob(Date dob) {
        this.dob = dob;
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
     * Gets employee type.
     *
     * @return the employee type
     */
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets employee type.
     *
     * @param employeeType the employee type
     */
    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    /**
     * Gets departement.
     *
     * @return the departement
     */
    public Departement getDepartement() {
        return departement;
    }

    /**
     * Sets departement.
     *
     * @param departement the departement
     */
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    /**
     * Gets profession.
     *
     * @return the profession
     */
    public Trade getProfession() {
        return profession;
    }

    /**
     * Sets profession.
     *
     * @param profession the profession
     */
    public void setProfession(Trade profession) {
        this.profession = profession;
    }

    /**
     * Gets nationality.
     *
     * @return the nationality
     */
    public Nationality getNationality() {
        return nationality;
    }

    /**
     * Sets nationality.
     *
     * @param nationality the nationality
     */
    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    /**
     * Gets matn pml id.
     *
     * @return the matn pml id
     */
    public Long getMatnPmlId() {
        return matnPmlId;
    }

    /**
     * Sets matn pml id.
     *
     * @param matnPmlId the matn pml id
     */
    public void setMatnPmlId(Long matnPmlId) {
        this.matnPmlId = matnPmlId;
    }

    /**
     * Gets matn mat id.
     *
     * @return the matn mat id
     */
    public Long getMatnMatId() {
        return matnMatId;
    }

    /**
     * Sets matn mat id.
     *
     * @param matnMatId the matn mat id
     */
    public void setMatnMatId(Long matnMatId) {
        this.matnMatId = matnMatId;
    }

    /**
     * Gets pp emp type id.
     *
     * @return the pp emp type id
     */
    public Long getPpEmpTypeId() {
        return ppEmpTypeId;
    }

    /**
     * Sets pp emp type id.
     *
     * @param ppEmpTypeId the pp emp type id
     */
    public void setPpEmpTypeId(Long ppEmpTypeId) {
        this.ppEmpTypeId = ppEmpTypeId;
    }

    /**
     * Gets lev bal days.
     *
     * @return the lev bal days
     */
    public Long getLevBalDays() {
        return levBalDays;
    }

    /**
     * Sets lev bal days.
     *
     * @param levBalDays the lev bal days
     */
    public void setLevBalDays(Long levBalDays) {
        this.levBalDays = levBalDays;
    }

    /**
     * Gets lev balprov.
     *
     * @return the lev balprov
     */
    public Long getLevBalprov() {
        return levBalprov;
    }

    /**
     * Sets lev balprov.
     *
     * @param levBalprov the lev balprov
     */
    public void setLevBalprov(Long levBalprov) {
        this.levBalprov = levBalprov;
    }

    /**
     * Gets gratuity prov.
     *
     * @return the gratuity prov
     */
    public Long getGratuityProv() {
        return gratuityProv;
    }

    /**
     * Sets gratuity prov.
     *
     * @param gratuityProv the gratuity prov
     */
    public void setGratuityProv(Long gratuityProv) {
        this.gratuityProv = gratuityProv;
    }

    /**
     * Gets gratuity days.
     *
     * @return the gratuity days
     */
    public Long getGratuityDays() {
        return gratuityDays;
    }

    /**
     * Sets gratuity days.
     *
     * @param gratuityDays the gratuity days
     */
    public void setGratuityDays(Long gratuityDays) {
        this.gratuityDays = gratuityDays;
    }

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets bank acno.
     *
     * @return the bank acno
     */
    public String getBankAcno() {
        return bankAcno;
    }

    /**
     * Sets bank acno.
     *
     * @param bankAcno the bank acno
     */
    public void setBankAcno(String bankAcno) {
        this.bankAcno = bankAcno;
    }

    /**
     * Gets bank name.
     *
     * @return the bank name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets bank name.
     *
     * @param bankName the bank name
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
