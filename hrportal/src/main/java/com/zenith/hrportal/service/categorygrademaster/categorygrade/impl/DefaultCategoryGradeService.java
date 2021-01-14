package com.zenith.hrportal.service.categorygrademaster.categorygrade.impl;

import com.zenith.hrportal.entities.category.CategoryGrade;
import com.zenith.hrportal.entities.company.Company;
import com.zenith.hrportal.repository.CategoryGradeRepository;
import com.zenith.hrportal.service.categorygrademaster.categorygrade.CategoryGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Default category grade service.
 */
@Service
public class DefaultCategoryGradeService implements CategoryGradeService {

    @Autowired
    private CategoryGradeRepository categoryGradeRepository;

    @Override
    public List<CategoryGrade> getByCompany(Company company) {
        return categoryGradeRepository.findByCompany(company);
    }

    @Override
    public CategoryGrade save(CategoryGrade categoryGrade) {
        return categoryGradeRepository.save(categoryGrade);
    }
}
