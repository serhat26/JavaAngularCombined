package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.employee.EmployeeType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Employee type repository.
 */
public interface EmployeeTypeRepository extends JpaRepository< EmployeeType ,Long> {

    Page<EmployeeType> findAll(Pageable pageable);
}
