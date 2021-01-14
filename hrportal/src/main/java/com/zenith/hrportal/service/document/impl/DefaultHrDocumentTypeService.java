package com.zenith.hrportal.service.document.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenith.hrportal.entities.document.HrDocumentType;
import com.zenith.hrportal.repository.HrDocumentTypeRepository;
import com.zenith.hrportal.service.document.HrDocumentTypeService;

/**
 * The type Default hr document type service.
 */
@Service
public class DefaultHrDocumentTypeService implements  HrDocumentTypeService {

	@Autowired
	private HrDocumentTypeRepository hrDocumentTypeRepository;
	
	@Override
	public List<HrDocumentType> getDocumentTypes() {
		return hrDocumentTypeRepository.findAll();
	}
	
	@Override
	public HrDocumentType getDocumentType(Long id) {
		Optional<HrDocumentType> docTypeOp =  hrDocumentTypeRepository.findById(id);
		return docTypeOp.isPresent() ? docTypeOp.get() : null;
	}

    /**
     * Sets hr document type repository.
     *
     * @param hrDocumentTypeRepository the hr document type repository
     */
    public void setHrDocumentTypeRepository(HrDocumentTypeRepository hrDocumentTypeRepository) {
		this.hrDocumentTypeRepository = hrDocumentTypeRepository;
	}
	
	
}
