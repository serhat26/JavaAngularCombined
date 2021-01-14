package com.zenith.hrportal.populators.impl;

import com.zenith.hrportal.dto.salary.SalaryDefinitionWsDTO;
import com.zenith.hrportal.entities.category.CategoryStatusesSales;
import com.zenith.hrportal.populators.Populator;
import org.springframework.stereotype.Component;

@Component("salaryDefinitionWsDtoPopulator")
public class SalaryDefinitionWsDtoPopulator implements Populator<CategoryStatusesSales, SalaryDefinitionWsDTO> {

    @Override
    public void populate(CategoryStatusesSales source, SalaryDefinitionWsDTO target) {
        target.setCode(source.getId());
        target.setTrxTypeCode(source.getTrxType().getCode());
        target.setDescription(source.getTrxType() != null ? source.getTrxType().getDescription() : null);
        target.setPercentage(source.getPayPerc());
    }
}
