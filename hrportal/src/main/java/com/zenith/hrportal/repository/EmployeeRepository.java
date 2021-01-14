package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.nationnality.Nationality;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.employee.EmployeeIdentity;
import java.util.List;


/**
 * The interface Employee repository.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, EmployeeIdentity>
, JpaSpecificationExecutor<Employee> {

    /**
     * Find by emp no list.
     *
     * @param empNo the emp no
     * @return the list
     */
    List<Employee> findByEmpNo(Long empNo);

    /**
     * Find by name containing list.
     *
     * @param name the name
     * @return the list
     */
    List<Employee> findByNameContaining(String name);

    /**
     * Find by emp no or name containing list.
     *
     * @param empNo the emp no
     * @param name  the name
     * @return the list
     */
    List<Employee> findByEmpNoOrNameContaining(Long empNo, String name);

    @Query("SELECT  DISTINCT status FROM Employee ")
    List<String> findStatuses();

}
