package com.zenith.hrportal.service.costcenter;


import com.zenith.hrportal.dto.costcenter.CostCenterWsDTO;
import com.zenith.hrportal.entities.costcenter.CostCenter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * The interface Cost center service.
 */
public interface CostCenterService {
    /**
     * Save new cost center cost center.
     *
     * @param CostCenterDto the cost center dto
     * @return the cost center
     */
    CostCenter saveNewCostCenter(CostCenterWsDTO CostCenterDto);

    /**
     * Gets cost center.
     *
     * @param id the id
     * @return the cost center
     */
    Optional<CostCenter> getCostCenter(Long id);

    /**
     * Gets all cost center.
     *
     * @param pageable the pageable
     * @return the all cost center
     */
    Page<CostCenter> getAllCostCenter(Pageable pageable);

    /**
     * Update cost center optional.
     *
     * @param CostCenterDTO the cost center dto
     * @return the optional
     */
    Optional< CostCenterWsDTO > updateCostCenter(@Valid CostCenterWsDTO CostCenterDTO);

    /**
     * Delete cost currency.
     *
     * @param id the id
     */
    void deleteCostCurrency(Long id);

    /**
     * Gets all.
     *
     * @return the all
     */
    List< CostCenter> getAll();
}
