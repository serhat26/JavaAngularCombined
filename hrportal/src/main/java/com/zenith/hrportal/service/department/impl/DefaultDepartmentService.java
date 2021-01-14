package com.zenith.hrportal.service.department.impl;

import com.zenith.hrportal.entities.department.Departement;
import com.zenith.hrportal.repository.DepartmentRepository;
import com.zenith.hrportal.service.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Default department service.
 */
@Service
public class DefaultDepartmentService implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Page< Departement > getPage(Pageable pageable) {
        return departmentRepository.findAll(pageable);
    }

    @Override
    public List< Departement > getAll() {
        return departmentRepository.findAll();
    }
}
