package com.zenith.hrportal.service.company;

import com.zenith.hrportal.entities.company.Company;

import java.util.List;

/**
 * The interface Company service.
 */
public interface CompanyService {

    /**
     * Gets all.
     *
     * @return the all
     */
    List<Company> getAll();

    /**
     * Gets by code.
     *
     * @param code the code
     * @return the by code
     */
    Company getByCode(String code);
}
