package com.zenith.hrportal.service.nationnality.impl;

import com.zenith.hrportal.entities.nationnality.Nationality;
import com.zenith.hrportal.repository.NationalityRepository;
import com.zenith.hrportal.service.nationnality.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Default nationality service.
 */
@Service
public class DefaultNationalityService implements NationalityService {

    @Autowired
    private NationalityRepository nationalityRepository;

    @Override
    public Page< Nationality > getAll(Pageable pageable) {
        return nationalityRepository.findAll(pageable);
    }

    @Override
    public List< Nationality > getAll() {
        return nationalityRepository.findAll();
    }
}
