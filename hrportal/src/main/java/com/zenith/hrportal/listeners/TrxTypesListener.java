package com.zenith.hrportal.listeners;

import com.zenith.hrportal.entities.grademaster.TrxTypes;
import com.zenith.hrportal.repository.TrxTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.PrePersist;

public class TrxTypesListener {

    @Autowired
    private TrxTypesRepository trxTypesRepository;

    @PrePersist
    private void beforeAnyUpdate(TrxTypes trxTypes) {
        Long lastInserted = trxTypesRepository.findTopByOrderByTrxIdDesc().getCode();
        trxTypes.setCode(lastInserted + 1);
    }
}
