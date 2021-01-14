package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Company repository.
 */
public interface CompanyRepository extends JpaRepository<Company,String> {

}
