package com.zenith.hrportal.service.employee;

import com.zenith.hrportal.entities.employee.EmployeeType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * The interface Employee type service.
 */
public interface EmployeeTypeService {

    /**
     * Gets page.
     *
     * @param pageable the pageable
     * @return the page
     */
    Page< EmployeeType > getPage(Pageable pageable);

    /**
     * Gets all.
     *
     * @return the all
     */
    List< EmployeeType> getAll();
}
