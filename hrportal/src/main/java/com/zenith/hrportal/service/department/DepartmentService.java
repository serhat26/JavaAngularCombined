package com.zenith.hrportal.service.department;

import com.zenith.hrportal.entities.department.Departement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * The interface Department service.
 */
public interface DepartmentService {

    /**
     * Gets page.
     *
     * @param pageable the pageable
     * @return the page
     */
    Page< Departement > getPage(Pageable pageable);

    /**
     * Gets all.
     *
     * @return the all
     */
    List< Departement> getAll();
}
