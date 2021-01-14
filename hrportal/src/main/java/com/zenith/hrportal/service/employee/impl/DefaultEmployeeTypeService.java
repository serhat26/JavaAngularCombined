package com.zenith.hrportal.service.employee.impl;

import com.zenith.hrportal.entities.employee.EmployeeType;
import com.zenith.hrportal.repository.EmployeeTypeRepository;
import com.zenith.hrportal.service.employee.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Default employee type service.
 */
@Service
public class DefaultEmployeeTypeService implements EmployeeTypeService {

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    @Override
    public Page< EmployeeType > getPage(Pageable pageable) {
        return employeeTypeRepository.findAll(pageable);
    }

    @Override
    public List< EmployeeType > getAll() {
        return employeeTypeRepository.findAll();
    }
}
