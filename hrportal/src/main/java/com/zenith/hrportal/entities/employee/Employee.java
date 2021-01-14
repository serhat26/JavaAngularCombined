package com.zenith.hrportal.entities.employee;

import com.zenith.hrportal.entities.category.CategoryGrade;
import java.io.Serializable;
import java.util.Date;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumns;

import com.sun.istack.NotNull;
import com.zenith.hrportal.entities.cities.City;
import com.zenith.hrportal.entities.company.Company;
import com.zenith.hrportal.entities.costcenter.CostCenter;
import com.zenith.hrportal.entities.department.Departement;
import com.zenith.hrportal.entities.grademaster.GradeMaster;
import com.zenith.hrportal.entities.nationnality.Nationality;
import com.zenith.hrportal.entities.trade.Trade;

/**
 * The type Employee.
 */
@Entity
@Table(name = "pp_employees")
public class Employee implements Serializable {

	@EmbeddedId
	private EmployeeIdentity employeeIdentity;

	@Column(name = "EMPNO", unique = true)
	private Long empNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DOJ")
	private Date doj;

	@Column(name = "DOB")
	private Date dob;


	@Column(name = "COMP_CODE")
	@NotNull
	private String compCode;

	@ManyToOne
	@JoinColumn(name = "PP_EMP_TYPE_ID",insertable = false,updatable = false)
	private EmployeeType employeeType;

	@ManyToOne()
	@JoinColumns(
			{
	        @JoinColumn(name = "PPDPRT_COMP_CODE", referencedColumnName = "COMP_CODE"),
	        @JoinColumn(name = "PPDPRT_CODE", referencedColumnName = "CODE")
	    })
	private Departement departement;

  @ManyToMany
  @JoinTable(
      name = "PP_EMP_TRANSFERS",
      joinColumns = {@JoinColumn(name = "EMP_ID", referencedColumnName = "ID"),
          @JoinColumn(name = "EMP_PML_ID", referencedColumnName = "PML_ID")},
      inverseJoinColumns = {
          @JoinColumn(name = "PPGM_PPCS_CODE", referencedColumnName = "CODE"),
          @JoinColumn(name = "PPGM_PPCS_COMP_CODE", referencedColumnName = "COMP_CODE")}
  )
  private Set<CategoryGrade> grades;

  public Set<CategoryGrade> getGrades() {
    return grades;
  }

  public void setGrades(Set<CategoryGrade> grades) {
    this.grades = grades;
  }

  @ManyToOne()
	@JoinColumns(
			{
	        @JoinColumn(name = "PPTRA_PML_ID", referencedColumnName = "PML_ID"),
	        @JoinColumn(name = "PPTRA_CODE", referencedColumnName = "CODE"),
	        @JoinColumn(name = "PPTRA_COMP_CODE", referencedColumnName = "COMP_CODE")
	 })
	private Trade profession;

	@ManyToOne()
	@JoinColumns({
			@JoinColumn(name = "NATN_NAT_ID", referencedColumnName = "NAT_ID",insertable = false,updatable = false),
			@JoinColumn(name = "NATN_PML_ID", referencedColumnName = "PML_ID",insertable = false,updatable = false)

	})
	private Nationality nationality;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "PLGM_PPCS_COMP_CODE", referencedColumnName = "PPCS_COMP_CODE",insertable = false,updatable = false),
			@JoinColumn(name = "PLGM_PPCS_CODE", referencedColumnName = "PPCS_CODE",insertable = false,updatable = false),
			@JoinColumn(name = "PLGM_CODE", referencedColumnName = "CODE",insertable = false,updatable = false)

	})
	private GradeMaster gradeMaster;

	@ManyToOne()
	@JoinColumns({
			@JoinColumn(name = "PPCTY_PPSTA_PPCTRY_CODE", referencedColumnName = "PPSTA_PPCTRY_CODE",insertable = false,updatable = false),
			@JoinColumn(name = "PPCTY_PPSTA_CODE", referencedColumnName = "PPSTA_CODE",insertable = false,updatable = false),
			@JoinColumn(name = "PPCTY_CODE", referencedColumnName = "CODE",insertable = false,updatable = false)

	})
	private City city;

	@ManyToOne()
	@JoinColumn(name = "GL_CC_ID" , referencedColumnName = "ID")
	private CostCenter costCenter;

	@Column(name = "NATN_PML_ID")
	@NotNull
	private Long matnPmlId;

	@Column(name = "NATN_NAT_ID")
	@NotNull
	private Long matnMatId;

	@Column(name = "PP_EMP_TYPE_ID")
	@NotNull
	private Long ppEmpTypeId;

	@Column(name = "lev_bal_days")
	private Long levBalDays;

	@Column(name = "lev_bal_prov")
	private Long levBalprov;

	@Column(name = "gratuity_prov")
	private Long gratuityProv;

	@Column(name = "gratuity_days")
	private Long gratuityDays;

	@Column(name = "GRADE")
	private String grade;

	@Column(name = "SEX")
	private String gender;

	@Column(name = "BANKACNO")
	private String bankAcno;

	@Column(name = "EMP_BANK_NAME")
	private String bankName;

	@ManyToOne()
	@JoinColumn(name = "COMP_CODE",referencedColumnName = "CODE",insertable = false,updatable = false)
	private Company company;

	@Column(name = "STATUS")
	private String status;


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
     * Gets employee identity.
     *
     * @return the employee identity
     */
    public EmployeeIdentity getEmployeeIdentity() {
		return employeeIdentity;
	}


    /**
     * Sets employee identity.
     *
     * @param employeeIdentity the employee identity
     */
    public void setEmployeeIdentity(EmployeeIdentity employeeIdentity) {
		this.employeeIdentity = employeeIdentity;
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

    /**
     * Gets company.
     *
     * @return the company
     */
    public Company getCompany() {
		return company;
	}

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(Company company) {
		this.company = company;
	}

    /**
     * Gets grade master.
     *
     * @return the grade master
     */
    public GradeMaster getGradeMaster() {
		return gradeMaster;
	}

    /**
     * Sets grade master.
     *
     * @param gradeMaster the grade master
     */
    public void setGradeMaster(GradeMaster gradeMaster) {
		this.gradeMaster = gradeMaster;
	}

    /**
     * Gets cost center.
     *
     * @return the cost center
     */
    public CostCenter getCostCenter() {
		return costCenter;
	}

    /**
     * Sets cost center.
     *
     * @param costCenter the cost center
     */
    public void setCostCenter(CostCenter costCenter) {
		this.costCenter = costCenter;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public City getCity() {
		return city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(City city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
