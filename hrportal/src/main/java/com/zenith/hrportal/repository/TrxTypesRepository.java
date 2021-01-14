package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.grademaster.TrxTypes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Trx types repository.
 */
public interface TrxTypesRepository extends JpaRepository<TrxTypes, Long> {

    /**
     * Find top by order by trx id desc trx types.
     *
     * @return the trx types
     */
    TrxTypes findTopByOrderByTrxIdDesc();
}
