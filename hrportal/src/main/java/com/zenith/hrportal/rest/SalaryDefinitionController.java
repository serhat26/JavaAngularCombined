package com.zenith.hrportal.rest;

import com.zenith.hrportal.constants.FKConstants;
import com.zenith.hrportal.dto.salary.SalaryDefinitionCreationWsDTO;
import com.zenith.hrportal.dto.salary.SalaryDefinitionWsDTO;
import com.zenith.hrportal.entities.category.CategoryStatusesSales;
import com.zenith.hrportal.entities.grademaster.TrxTypes;
import com.zenith.hrportal.entities.grademaster.TrxTypesIdentity;
import com.zenith.hrportal.populators.impl.SalaryDefinitionWsDtoPopulator;
import com.zenith.hrportal.repository.TrxTypesRepository;
import com.zenith.hrportal.service.categorygrademaster.categorystatusessales.CategoryStatusesSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type Salary definition controller.
 */
@RestController
@RequestMapping("/api/salary-definition")
public class SalaryDefinitionController {

    @Autowired
    private CategoryStatusesSalesService categoryStatusesSalesService;

    @Autowired
    private SalaryDefinitionWsDtoPopulator salaryDefinitionWsDtoPopulator;

    @Autowired
    private TrxTypesRepository trxTypesRepository;

    /**
     * Get by category grade list.
     *
     * @param categoryGrade the category grade
     * @return the list
     */
    @GetMapping("/category-grade/{categoryGrade}")
    public List<SalaryDefinitionWsDTO>getByCategoryGrade(@PathVariable("categoryGrade") String categoryGrade){
       List<SalaryDefinitionWsDTO> result = new ArrayList<>();
       List<CategoryStatusesSales> cataCategoryStatusesSales = categoryStatusesSalesService.getByCategoryGrade(categoryGrade);
        cataCategoryStatusesSales.stream().forEach(categoryStatusesSales -> {
            SalaryDefinitionWsDTO dto = new SalaryDefinitionWsDTO();
            salaryDefinitionWsDtoPopulator.populate(categoryStatusesSales,dto);
            result.add(dto);
        });
        return result;
    }

    /**
     * Update response entity.
     *
     * @param salaryDefinitionWsDTO the salary definition ws dto
     * @return the response entity
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<Object> update(@RequestBody SalaryDefinitionWsDTO salaryDefinitionWsDTO){
        CategoryStatusesSales categoryStatusesSales = categoryStatusesSalesService.getById(salaryDefinitionWsDTO.getCode());
        categoryStatusesSales.setPayPerc(salaryDefinitionWsDTO.getPercentage());
        categoryStatusesSales = categoryStatusesSalesService.save(categoryStatusesSales);
        return new ResponseEntity<Object>(categoryStatusesSales, HttpStatus.CREATED);
    }

    /**
     * Create response entity.
     *
     * @param salaryDefinitionCreationWsDTO the salary definition creation ws dto
     * @return the response entity
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody SalaryDefinitionCreationWsDTO salaryDefinitionCreationWsDTO){
        TrxTypes trxTypes = createTrxType(salaryDefinitionCreationWsDTO.getSalaryDefinition());
        CategoryStatusesSales categoryStatusesSales = new CategoryStatusesSales();
        categoryStatusesSales.setCreatedOn(new Date());
        categoryStatusesSales.setTrxType(trxTypes);
        categoryStatusesSales.setCompany(FKConstants.COMP_CODE);
        categoryStatusesSales.setPayPerc(salaryDefinitionCreationWsDTO.getPayPerc());
        categoryStatusesSales.setTrxPmlId(FKConstants.PML_ID);
        categoryStatusesSales.setCategoryGradeCode(salaryDefinitionCreationWsDTO.getCategoryGrade());
        categoryStatusesSales.setTrxType(trxTypes);
        categoryStatusesSales.setTrxId(trxTypes.getTrxId());
        categoryStatusesSales.setCreatedBy(salaryDefinitionCreationWsDTO.getCreatedBy());
        categoryStatusesSalesService.save(categoryStatusesSales);
        return new ResponseEntity<Object>(trxTypes, HttpStatus.CREATED);
    }

    private TrxTypes createTrxType(SalaryDefinitionWsDTO salaryDefinitionWsDTO) {
        TrxTypes trxTypes = new TrxTypes();
        TrxTypesIdentity identity = new TrxTypesIdentity();
        //TODO replace with current user pml id
        trxTypes.setPmlId(FKConstants.PML_ID);
        // trxTypes.setTrxTypesIdentity(identity);
        trxTypes.setDescription(salaryDefinitionWsDTO.getDescription());
        Long code = trxTypesRepository.findTopByOrderByTrxIdDesc().getCode() + 1;
        trxTypes.setCode(code);
        trxTypes.setCode(code);
        trxTypes.setCreatedBy(salaryDefinitionWsDTO.getCreatedby());
        trxTypesRepository.save(trxTypes);
        return trxTypes;
    }

}

