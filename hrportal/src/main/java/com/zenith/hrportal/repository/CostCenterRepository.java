package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.costcenter.CostCenter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The interface Cost center repository.
 */
@Repository
public interface CostCenterRepository extends JpaRepository< CostCenter, Long> {
	
	Page<CostCenter> findAll(Pageable pageable);

    /**
     * Find by code optional.
     *
     * @param code the code
     * @return the optional
     */
    Optional<CostCenter> findByCode(String code);

    /**
     * Find cost centre by code cost center.
     *
     * @param code the code
     * @return the cost center
     */
    CostCenter findCostCentreByCode(String code);
}
