package com.zenith.hrportal.populators.impl;

import com.zenith.hrportal.dto.company.CompanyWsDTO;
import com.zenith.hrportal.entities.company.Company;
import com.zenith.hrportal.populators.Populator;
import org.springframework.stereotype.Component;

@Component("companyWsDtoPopulator")
public class CompanyWsDtoPopulator implements Populator<Company, CompanyWsDTO> {

    @Override
    public void populate(Company source, CompanyWsDTO target) {
        target.setCode(source.getCode());
        target.setName(source.getName());
    }
}
