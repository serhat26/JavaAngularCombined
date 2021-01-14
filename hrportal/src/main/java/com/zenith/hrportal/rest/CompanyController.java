package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.company.CompanyWsDTO;
import com.zenith.hrportal.entities.company.Company;
import com.zenith.hrportal.populators.impl.CompanyWsDtoPopulator;
import com.zenith.hrportal.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Company controller.
 */
@Controller
@RequestMapping(value = "/api")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private CompanyWsDtoPopulator companyWsDtoPopulator;

    /**
     * Get comapnies list.
     *
     * @return the list
     */
    @GetMapping(value ="/companies")
    @ResponseBody
    public List<CompanyWsDTO> getComapnies(){
        List<Company> companies = companyService.getAll();
        List<CompanyWsDTO> companyWsDTOS = new ArrayList<>();
        companies.forEach(company -> {
            CompanyWsDTO companyWsDTO = new CompanyWsDTO();
            companyWsDtoPopulator.populate(company,companyWsDTO);
            companyWsDTOS.add(companyWsDTO);
        });
        return companyWsDTOS;
    }
}
