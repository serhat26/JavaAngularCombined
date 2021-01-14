package com.zenith.hrportal.service.categorygrademaster.categorystatusessales.impl;

import com.zenith.hrportal.entities.category.CategoryStatusesSales;
import com.zenith.hrportal.repository.CategoryStatusesSalesRepository;
import com.zenith.hrportal.service.categorygrademaster.categorystatusessales.CategoryStatusesSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Default category statuses sales service.
 */
@Service
public class DefaultCategoryStatusesSalesService implements CategoryStatusesSalesService {

    @Autowired
    private CategoryStatusesSalesRepository categoryStatusesSalesRepository;

    @Override
    public List<CategoryStatusesSales> getByCategoryGrade(String categoryGrade) {
        return categoryStatusesSalesRepository.findByCategoryGradeCode(categoryGrade);
    }

    @Override
    public CategoryStatusesSales getById(Long id) {
        Optional<CategoryStatusesSales> categoryStatusesSales = categoryStatusesSalesRepository.findById(id);
        return categoryStatusesSales.isPresent() ? categoryStatusesSales.get() : null;
    }

    @Override
    public CategoryStatusesSales save(CategoryStatusesSales categoryStatusesSales) {
        return categoryStatusesSalesRepository.save(categoryStatusesSales);
    }
}
