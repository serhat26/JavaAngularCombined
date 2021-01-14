package com.zenith.hrportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.hrportal.entities.document.HrDocumentType;

/**
 * The interface Hr document type repository.
 */
public interface HrDocumentTypeRepository extends JpaRepository<HrDocumentType	, Long> {

}
