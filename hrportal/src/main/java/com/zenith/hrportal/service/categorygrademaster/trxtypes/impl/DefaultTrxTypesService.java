package com.zenith.hrportal.service.categorygrademaster.trxtypes.impl;

import com.zenith.hrportal.entities.grademaster.TrxTypes;
import com.zenith.hrportal.repository.TrxTypesRepository;
import com.zenith.hrportal.service.categorygrademaster.trxtypes.TrxTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type D efault trx types service.
 */
@Service
public class DefaultTrxTypesService implements TrxTypesService {

    @Autowired
    private TrxTypesRepository trxTypesRepository;

    @Override
    public List<TrxTypes> getAll() {
        return trxTypesRepository.findAll();
    }
}
