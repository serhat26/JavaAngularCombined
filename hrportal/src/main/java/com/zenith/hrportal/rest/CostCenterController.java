package com.zenith.hrportal.rest;


import com.zenith.hrportal.dto.costcenter.CostCenterWsDTO;
import com.zenith.hrportal.entities.costcenter.CostCenter;
import com.zenith.hrportal.repository.CostCenterRepository;
import com.zenith.hrportal.rest.errors.CodeAlreadyExistsException;
import com.zenith.hrportal.service.costcenter.CostCenterService;
import com.zenith.hrportal.utils.HeaderUtil;
import com.zenith.hrportal.utils.PaginationUtil;
import com.zenith.hrportal.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * The type Cost center controller.
 */
@RestController
@RequestMapping("/api")
public class CostCenterController {
	
	private static final List<String> ALLOWED_ORDERED_PROPERTIES = Collections
            .unmodifiableList(Arrays.asList("id", "companyCode", "code", "description", "moduleCc", "active"));

	
	private Logger log = LoggerFactory.getLogger(CostCenterController.class);
	
	@Value("${hrportal.clientApp.name}")
    private String applicationName;
	
	@Autowired
	private CostCenterService costCentreService;
	
	@Autowired
	private CostCenterRepository costCentreRepository;

	/**
	 * Ping string.
	 *
	 * @return the string
	 */
	@GetMapping(value = "/costcenter")
    public String ping(){
        return "success from cost center home method";
    }

	/**
	 * Get all cost centre response entity.
	 *
	 * @param pageable the pageable
	 * @return the response entity
	 */
	@GetMapping("/costcentres")
	public ResponseEntity< List<CostCenter> > getAllCostCentre(Pageable pageable){
		if (!onlyContainsAllowedProperties(pageable)) {
            return ResponseEntity.badRequest().build();
        }
		final List<CostCenter> costCenters = costCentreService.getAll();
        return new ResponseEntity<>(costCenters, HttpStatus.OK);
	}

	private boolean onlyContainsAllowedProperties(Pageable pageable) {
		return pageable.getSort().stream().map(Sort.Order::getProperty).allMatch(ALLOWED_ORDERED_PROPERTIES::contains);
	}

	/**
	 * Get cost centre optional.
	 *
	 * @param id the id
	 * @return the optional
	 */
	@GetMapping("/costcenter/{id}")
	public Optional<CostCenter> getCostCentre(@PathVariable Long id){
		return costCentreService.getCostCenter(id);
	}

	/**
	 * Insert cost center response entity.
	 *
	 * @param costCentreDTO the cost centre dto
	 * @return the response entity
	 * @throws URISyntaxException the uri syntax exception
	 */
	@PostMapping("/costcenter")
    public ResponseEntity<CostCenter> insertCostCenter(@Valid @RequestBody CostCenterWsDTO costCentreDTO) throws URISyntaxException{
		log.debug("REST request to save CostCentre : {}", costCentreDTO);
		if(costCentreRepository.findByCode(costCentreDTO.getCode()).isPresent()) {
			throw new CodeAlreadyExistsException();
		}
		CostCenter costCenter = costCentreService.saveNewCostCenter(costCentreDTO);
        return ResponseEntity.created(new URI("/api/costcenter/" + costCenter.getId()))
                .headers(HeaderUtil.createAlert(applicationName, "Cost centre created", costCenter.getCode()))
                .body(costCenter);
    }

	/**
	 * Update cost center response entity.
	 *
	 * @param costCentreDTO the cost centre dto
	 * @return the response entity
	 */
	@PutMapping("/costcenter")
    //@PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<CostCenterWsDTO> updateCostCenter(@Valid @RequestBody CostCenterWsDTO costCentreDTO) {
        log.debug("REST request to update CostCentre : {}", costCentreDTO);
        Optional<CostCenter> existingCostCentre = costCentreRepository.findByCode(costCentreDTO.getCode());
        if (existingCostCentre.isPresent() && (!existingCostCentre.get().getId().equals(costCentreDTO.getId()))) {
            throw new CodeAlreadyExistsException();
        }
        Optional<CostCenterWsDTO> updatedCostCentre = costCentreService.updateCostCenter(costCentreDTO);

        return ResponseUtil.wrapOrNotFound(updatedCostCentre,
                HeaderUtil.createAlert(applicationName, "Cost centre updated", costCentreDTO.getCode()));
    }

	/**
	 * Delete cost center response entity.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@DeleteMapping("/costcenter/{id}")
    public ResponseEntity<String> deleteCostCenter(@PathVariable Long id) {
        log.debug("REST request to delete CostCentre: {}", id);
        costCentreService.deleteCostCurrency(id);
        return ResponseEntity.noContent()
                .headers(HeaderUtil.createAlert(applicationName, "Cost Currency deleted", id.toString())).build();
    }
	
}
