package com.zenith.hrportal.repository;

import java.time.Month;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.leave.LeaveRequestHeader;
import org.springframework.data.jpa.repository.Query;

/**
 * The interface Leave request header repository.
 */
public interface LeaveRequestHeaderRepository extends JpaRepository<LeaveRequestHeader, Long> {

    /**
     * Find by pass is null list.
     *
     * @return the list
     */
    List<LeaveRequestHeader> findByPassIsNull();

    /**
     * Find by pass list.
     *
     * @param pass the pass
     * @return the list
     */
    List<LeaveRequestHeader> findByPass(String pass);

    /**
     * Find by employee list.
     *
     * @param employee the employee
     * @return the list
     */
    List<LeaveRequestHeader> findByEmployee(Employee employee);


    /**
     * Find by created on month list.
     *
     * @param year  the year
     * @param month the month
     * @return the list
     */
    @Query(value = "select l from LeaveRequestHeader l where year(l.createdOn) = ?1 and month(l.createdOn) = ?2")
    List<LeaveRequestHeader> findByCreatedOnMonth(int year, int month);
}
