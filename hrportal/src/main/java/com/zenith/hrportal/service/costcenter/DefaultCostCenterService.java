package com.zenith.hrportal.service.costcenter;


import com.zenith.hrportal.dto.costcenter.CostCenterWsDTO;
import com.zenith.hrportal.entities.costcenter.CostCenter;
import com.zenith.hrportal.repository.CostCenterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * The type Default cost center service.
 */
@Service
public class DefaultCostCenterService implements CostCenterService {
	private static Logger log = LoggerFactory.getLogger(DefaultCostCenterService.class);
	
	@Autowired
    private CostCenterRepository costCenterRepository;
	
	public CostCenter saveNewCostCenter(CostCenterWsDTO CostCenterDto) {
		CostCenter CostCenter = new CostCenter();
		CostCenter.setId(CostCenterDto.getId());
		CostCenter.setCompanyCode(CostCenterDto.getCompanyCode());
		CostCenter.setCode(CostCenterDto.getCode());
		CostCenter.setDescription(CostCenterDto.getDescription());
		CostCenter.setCreatedBy(CostCenterDto.getCreatedBy());
		CostCenter.setCreatedDate(new Date());
		

		CostCenter.setActive("Y");
		
		costCenterRepository.save(CostCenter);
		
		log.debug("Created Information for Cost Centre: {}", CostCenter);
		
		return CostCenter;
	}
	
	@Transactional(readOnly = true)
	public Optional<CostCenter> getCostCenter(Long id){
		return costCenterRepository.findById(id);
	}

	@Transactional(readOnly = true)
	public Page<CostCenter> getAllCostCenter(Pageable pageable) {
		Page<CostCenter> CostCenter = costCenterRepository.findAll(pageable);
		List<CostCenter> cCentre = CostCenter.getContent();

		Page<CostCenter> newCostCenter = new PageImpl<CostCenter>(cCentre,pageable,cCentre.size());
		return newCostCenter;
	}

	public Optional<CostCenterWsDTO> updateCostCenter(@Valid CostCenterWsDTO CostCenterDTO) {
		return Optional.of(costCenterRepository.findById(CostCenterDTO.getId())).filter(Optional::isPresent)
				.map(Optional::get)
				.map(CostCenter -> {
					CostCenter.setCompanyCode(CostCenterDTO.getCompanyCode());
					CostCenter.setCode(CostCenterDTO.getCode());
					CostCenter.setDescription(CostCenterDTO.getDescription());
					CostCenter.setLastModifiedDate(new Date());

					costCenterRepository.save(CostCenter);
					log.debug("Changed Information for Cost Centre: {}", CostCenter);
					return CostCenter;
				})
				.map(CostCenterWsDTO::new);
	}

	@Override
	public List< CostCenter > getAll() {
		return costCenterRepository.findAll();
	}

	public void deleteCostCurrency(Long id) {
		costCenterRepository.findById(id).ifPresent(currency -> {
			//CostCenterRepository.delete(currency);
            log.debug("Deleted Cost Currency: {}", currency);
        });
	}
}
