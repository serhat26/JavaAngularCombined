package com.zenith.hrportal.dto.employee;

import com.zenith.hrportal.dto.city.CityWsDTO;
import com.zenith.hrportal.dto.costcenter.CostCenterWsDTO;
import com.zenith.hrportal.dto.department.DepartmentWsDTO;
import com.zenith.hrportal.dto.nationnality.NationalityWsDTO;
import com.zenith.hrportal.dto.trade.TradeWsDTO;
import com.zenith.hrportal.entities.employee.EmployeeType;

import java.util.Date;
import java.util.List;

/**
 * The type Employee search params dto.
 */
public class EmployeeSearchParamsDTO {


    private  String companyCodeFrom;
    private String companyCodeTo;
    private Long departmentFrom;
    private Long departmentTo;
    private Long empNoFrom;
    private Long empNoTo;
    private Date birthDateFrom;
    private Date birthDateTo;
    private Date joiningDateFrom;
    private Date joiningDateTo;
    private List< DepartmentWsDTO > departments;
    private List< NationalityWsDTO > nationalities;
    private  List< TradeWsDTO  > professions;
    private List< EmployeeType > employeeTypes;
    private List< CityWsDTO > cities;
    private List< CostCenterWsDTO > costCenters;


    /**
     * Gets company code from.
     *
     * @return the company code from
     */
    public String getCompanyCodeFrom() {
        return companyCodeFrom;
    }

    /**
     * Sets company code from.
     *
     * @param companyCodeFrom the company code from
     */
    public void setCompanyCodeFrom(String companyCodeFrom) {
        this.companyCodeFrom = companyCodeFrom;
    }

    /**
     * Gets company code to.
     *
     * @return the company code to
     */
    public String getCompanyCodeTo() {
        return companyCodeTo;
    }

    /**
     * Sets company code to.
     *
     * @param companyCodeTo the company code to
     */
    public void setCompanyCodeTo(String companyCodeTo) {
        this.companyCodeTo = companyCodeTo;
    }

    /**
     * Gets emp no from.
     *
     * @return the emp no from
     */
    public Long getEmpNoFrom() {
        return empNoFrom;
    }

    /**
     * Sets emp no from.
     *
     * @param empNoFrom the emp no from
     */
    public void setEmpNoFrom(Long empNoFrom) {
        this.empNoFrom = empNoFrom;
    }

    /**
     * Gets emp no to.
     *
     * @return the emp no to
     */
    public Long getEmpNoTo() {
        return empNoTo;
    }

    /**
     * Sets emp no to.
     *
     * @param empNoTo the emp no to
     */
    public void setEmpNoTo(Long empNoTo) {
        this.empNoTo = empNoTo;
    }

    /**
     * Gets department from.
     *
     * @return the department from
     */
    public Long getDepartmentFrom() {
        return departmentFrom;
    }

    /**
     * Sets department from.
     *
     * @param departmentFrom the department from
     */
    public void setDepartmentFrom(Long departmentFrom) {
        this.departmentFrom = departmentFrom;
    }

    /**
     * Gets department to.
     *
     * @return the department to
     */
    public Long getDepartmentTo() {
        return departmentTo;
    }

    /**
     * Sets department to.
     *
     * @param departmentTo the department to
     */
    public void setDepartmentTo(Long departmentTo) {
        this.departmentTo = departmentTo;
    }

    /**
     * Gets birth date from.
     *
     * @return the birth date from
     */
    public Date getBirthDateFrom() {
        return birthDateFrom;
    }

    /**
     * Sets birth date from.
     *
     * @param birthDateFrom the birth date from
     */
    public void setBirthDateFrom(Date birthDateFrom) {
        this.birthDateFrom = birthDateFrom;
    }

    /**
     * Gets birth date to.
     *
     * @return the birth date to
     */
    public Date getBirthDateTo() {
        return birthDateTo;
    }

    /**
     * Sets birth date to.
     *
     * @param birthDateTo the birth date to
     */
    public void setBirthDateTo(Date birthDateTo) {
        this.birthDateTo = birthDateTo;
    }

    /**
     * Gets joining date from.
     *
     * @return the joining date from
     */
    public Date getJoiningDateFrom() {
        return joiningDateFrom;
    }

    /**
     * Sets joining date from.
     *
     * @param joiningDateFrom the joining date from
     */
    public void setJoiningDateFrom(Date joiningDateFrom) {
        this.joiningDateFrom = joiningDateFrom;
    }

    /**
     * Gets joining date to.
     *
     * @return the joining date to
     */
    public Date getJoiningDateTo() {
        return joiningDateTo;
    }

    /**
     * Sets joining date to.
     *
     * @param joiningDateTo the joining date to
     */
    public void setJoiningDateTo(Date joiningDateTo) {
        this.joiningDateTo = joiningDateTo;
    }

    /**
     * Gets departments.
     *
     * @return the departments
     */
    public List< DepartmentWsDTO > getDepartments() {
        return departments;
    }

    /**
     * Sets departments.
     *
     * @param departments the departments
     */
    public void setDepartments(List< DepartmentWsDTO > departments) {
        this.departments = departments;
    }

    /**
     * Gets nationalities.
     *
     * @return the nationalities
     */
    public List< NationalityWsDTO > getNationalities() {
        return nationalities;
    }

    /**
     * Sets nationalities.
     *
     * @param nationalities the nationalities
     */
    public void setNationalities(List< NationalityWsDTO > nationalities) {
        this.nationalities = nationalities;
    }

    /**
     * Gets professions.
     *
     * @return the professions
     */
    public List< TradeWsDTO > getProfessions() {
        return professions;
    }

    /**
     * Sets professions.
     *
     * @param professions the professions
     */
    public void setProfessions(List< TradeWsDTO > professions) {
        this.professions = professions;
    }

    /**
     * Gets employee types.
     *
     * @return the employee types
     */
    public List< EmployeeType > getEmployeeTypes() {
        return employeeTypes;
    }

    /**
     * Sets employee types.
     *
     * @param employeeTypes the employee types
     */
    public void setEmployeeTypes(List< EmployeeType > employeeTypes) {
        this.employeeTypes = employeeTypes;
    }

    /**
     * Gets cities.
     *
     * @return the cities
     */
    public List< CityWsDTO > getCities() {
        return cities;
    }

    /**
     * Sets cities.
     *
     * @param cities the cities
     */
    public void setCities(List< CityWsDTO > cities) {
        this.cities = cities;
    }

    /**
     * Gets cost centers.
     *
     * @return the cost centers
     */
    public List< CostCenterWsDTO > getCostCenters() {
        return costCenters;
    }

    /**
     * Sets cost centers.
     *
     * @param costCenters the cost centers
     */
    public void setCostCenters(List< CostCenterWsDTO > costCenters) {
        this.costCenters = costCenters;
    }
}
