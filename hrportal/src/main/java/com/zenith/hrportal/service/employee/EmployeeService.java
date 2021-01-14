package com.zenith.hrportal.service.employee;

import java.util.List;

import com.zenith.hrportal.dto.employee.EmployeeNationalityPercentageDTO;
import com.zenith.hrportal.dto.employee.EmployeeSearchParamsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.zenith.hrportal.entities.employee.Employee;
import org.springframework.data.domain.Pageable;

/**
 * The interface Employee service.
 */
public interface EmployeeService {

    /**
     * Gets all.
     *
     * @return the all
     */
    List<Employee> getAll();

    /**
     * Gets by name.
     *
     * @param name the name
     * @return the by name
     */
    List<Employee> getByName(String name);

    /**
     * Gets employees by num or name.
     *
     * @param empNo the emp no
     * @param name  the name
     * @return the employees by num or name
     */
    List<Employee> getEmployeesByNumOrName(Long empNo, String name);

    /**
     * Gets page.
     *
     * @param pageRequest the page request
     * @return the page
     */
    Page<Employee> getPage(PageRequest pageRequest);

    /**
     * Get employee.
     *
     * @param id    the id
     * @param pmlId the pml id
     * @return the employee
     */
    Employee get(Long id, Long pmlId);

    /**
     * Add employee.
     *
     * @param Employeee the employeee
     * @return the employee
     */
    Employee add(Employee Employeee);

    /**
     * Update employee.
     *
     * @param Employeee the employeee
     * @return the employee
     */
    Employee update(Employee Employeee);

    /**
     * Delete boolean.
     *
     * @param id    the id
     * @param pmlId the pml id
     * @return the boolean
     */
    boolean delete(Long id,Long pmlId);

    /**
     * Gets by emp no.
     *
     * @param empNo the emp no
     * @return the by emp no
     */
    Employee getByEmpNo(Long empNo);

    /**
     * Search page.
     *
     * @param employeeSearchParamsDTO the employee search params dto
     * @param pageable                the pageable
     * @return the page
     */
    Page<Employee> search(EmployeeSearchParamsDTO employeeSearchParamsDTO , Pageable pageable);


    /**
     * Search page.
     *
     * @param employeeSearchParamsDTO the employee search params dto
     * @return the page
     */
    List<Employee> search(EmployeeSearchParamsDTO employeeSearchParamsDTO);


    /**
     * Calculate employee nationalities percentage list.
     *
     * @param status the status
     * @return the list
     */
    List< EmployeeNationalityPercentageDTO> calculateEmployeeNationalitiesPercentage(String status);


    /**
     * Gets statuses.
     *
     * @return the statuses
     */
    List<String> getStatuses();

}
