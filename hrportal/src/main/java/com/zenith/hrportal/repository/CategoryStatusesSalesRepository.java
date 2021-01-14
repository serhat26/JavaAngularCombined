package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.category.CategoryStatusesSales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Category statuses sales repository.
 */
public interface CategoryStatusesSalesRepository extends JpaRepository<CategoryStatusesSales,Long> {

    /**
     * Find by category grade code list.
     *
     * @param categoryGrade the category grade
     * @return the list
     */
    List<CategoryStatusesSales> findByCategoryGradeCode(String categoryGrade);
}
