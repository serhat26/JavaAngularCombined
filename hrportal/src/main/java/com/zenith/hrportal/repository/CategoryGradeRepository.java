package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.category.CategoryGradIdentity;
import com.zenith.hrportal.entities.category.CategoryGrade;
import com.zenith.hrportal.entities.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Category grade repository.
 */
public interface CategoryGradeRepository extends JpaRepository<CategoryGrade, CategoryGradIdentity> {

    /**
     * Find by company list.
     *
     * @param company the company
     * @return the list
     */
    List<CategoryGrade> findByCompany(Company company);
}
