package com.zenith.hrportal.service.company.impl;

import com.zenith.hrportal.entities.company.Company;
import com.zenith.hrportal.repository.CompanyRepository;
import com.zenith.hrportal.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Default company service.
 */
@Service
public class DefaultCompanyService  implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company getByCode(String code) {
        Optional<Company> companyOptional = companyRepository.findById(code);
        return  companyOptional.isPresent() ? companyOptional.get() : null;
    }
}
