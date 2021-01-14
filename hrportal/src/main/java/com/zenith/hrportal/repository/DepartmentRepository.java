package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.department.Departement;
import com.zenith.hrportal.entities.department.DepartementIdentity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Department repository.
 */
public interface DepartmentRepository extends JpaRepository<Departement, DepartementIdentity> {

    /**
     * Find by departement identity code list.
     *
     * @param code the code
     * @return the list
     */
    List<Departement> findByDepartementIdentityCode(String code);

    /**
     * Find by departement identity list.
     *
     * @param identity the identity
     * @return the list
     */
    List<Departement> findByDepartementIdentity(DepartementIdentity identity);

    Page<Departement> findAll(Pageable pageable);
}
