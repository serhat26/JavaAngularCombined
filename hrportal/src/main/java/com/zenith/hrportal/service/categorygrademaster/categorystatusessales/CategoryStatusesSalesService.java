package com.zenith.hrportal.service.categorygrademaster.categorystatusessales;

import com.zenith.hrportal.entities.category.CategoryStatusesSales;

import java.util.List;

/**
 * The interface Category statuses sales service.
 */
public interface CategoryStatusesSalesService {

    /**
     * Gets by category grade.
     *
     * @param categoryGrade the category grade
     * @return the by category grade
     */
    List<CategoryStatusesSales> getByCategoryGrade(String categoryGrade);

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    CategoryStatusesSales getById(Long id);

    /**
     * Save category statuses sales.
     *
     * @param categoryStatusesSales the category statuses sales
     * @return the category statuses sales
     */
    CategoryStatusesSales save(CategoryStatusesSales categoryStatusesSales);

}
