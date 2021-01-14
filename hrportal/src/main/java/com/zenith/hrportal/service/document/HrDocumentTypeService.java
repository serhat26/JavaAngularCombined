package com.zenith.hrportal.service.document;

import java.util.List;

import com.zenith.hrportal.entities.document.HrDocumentType;

/**
 * The interface Hr document type service.
 */
public interface HrDocumentTypeService {

    /**
     * Gets document types.
     *
     * @return the document types
     */
    List<HrDocumentType> getDocumentTypes();

    /**
     * Gets document type.
     *
     * @param id the id
     * @return the document type
     */
    HrDocumentType getDocumentType(Long id);

}
