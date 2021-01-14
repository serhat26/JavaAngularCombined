package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.mastergrade.CategoryGradeWsDTO;
import com.zenith.hrportal.entities.category.CategoryGradIdentity;
import com.zenith.hrportal.entities.category.CategoryGrade;
import com.zenith.hrportal.entities.company.Company;
import com.zenith.hrportal.service.categorygrademaster.categorygrade.CategoryGradeService;
import com.zenith.hrportal.service.company.CompanyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Category grade controller.
 */
@RestController
@RequestMapping("/api/category-grades")
public class CategoryGradeController {

    @Autowired
    private CategoryGradeService categoryGradeService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Gets by company.
     *
     * @param companyCode the company code
     * @return the by company
     */
    @GetMapping("/company/{companyCode}")
    public List<CategoryGradeWsDTO> getByCompany(@PathVariable("companyCode") String companyCode) {
        Company company = companyService.getByCode(companyCode);
        return categoryGradeService.getByCompany(company).stream().map(categoryGrade -> this.convertToDto(categoryGrade))
                .collect(Collectors.toList());
    }

    /**
     * Save response entity.
     *
     * @param categoryGradeWsDTO the category grade ws dto
     * @return the response entity
     */
    @PostMapping("/save")
    public ResponseEntity<Object> save(@RequestBody CategoryGradeWsDTO categoryGradeWsDTO) {
        CategoryGrade categoryGrade = convertToEntity(categoryGradeWsDTO);
        categoryGrade =  categoryGradeService.save(categoryGrade);
        return new ResponseEntity<Object>(categoryGrade, HttpStatus.CREATED);

    }

    private CategoryGradeWsDTO convertToDto(CategoryGrade categoryGrade) {
        CategoryGradeWsDTO dto = modelMapper.map(categoryGrade, CategoryGradeWsDTO.class);
        dto.setCode(categoryGrade.getCategoryGradIdentity().getCode());
        return dto;
    }

    private CategoryGrade convertToEntity(CategoryGradeWsDTO categoryGradeWsDTO) {
        CategoryGrade categoryGrade = new CategoryGrade();
        Company company = categoryGradeWsDTO.getCompany() != null ? companyService.getByCode(categoryGradeWsDTO.getCompany().getCode()) : null;
        categoryGrade = modelMapper.map(categoryGradeWsDTO, CategoryGrade.class);
        CategoryGradIdentity identity = new CategoryGradIdentity();
        identity.setCode(categoryGradeWsDTO.getCode());
        identity.setCompCode(company.getCode());
        categoryGrade.setCompany(company);
        categoryGrade.setCategoryGradIdentity(identity);
        return categoryGrade;
    }

}
