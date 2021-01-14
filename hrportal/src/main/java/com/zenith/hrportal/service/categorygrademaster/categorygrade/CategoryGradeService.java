package com.zenith.hrportal.service.categorygrademaster.categorygrade;

import com.zenith.hrportal.entities.category.CategoryGrade;
import com.zenith.hrportal.entities.company.Company;

import java.util.List;

/**
 * The interface Category grade service.
 */
public interface CategoryGradeService {

    /**
     * Gets by company.
     *
     * @param company the company
     * @return the by company
     */
    List<CategoryGrade> getByCompany(Company company);

    /**
     * Save category grade.
     *
     * @param categoryGrade the category grade
     * @return the category grade
     */
    CategoryGrade save(CategoryGrade categoryGrade);
}
