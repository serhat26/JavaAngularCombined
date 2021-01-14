package com.zenith.hrportal.populators.impl;

import com.zenith.hrportal.constants.FKConstants;
import com.zenith.hrportal.dto.document.DocumentTypeWsDTO;
import com.zenith.hrportal.dto.document.HrDocumentRequestWsDTO;
import com.zenith.hrportal.entities.document.HrDocumentRequest;
import com.zenith.hrportal.entities.document.HrDocumentType;
import com.zenith.hrportal.populators.Populator;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("hrDocumentRrequestWsDTOPopulator")
public class HrDocumentRequestWsDtoPopulator implements Populator<HrDocumentRequest, HrDocumentRequestWsDTO> {
    @Override
    public void populate(HrDocumentRequest source, HrDocumentRequestWsDTO target) {
        target.setDocNo(source.getDocNo());
        target.setDocDate(new Date());
        target.setEmplPmlId(source.getEmplPmlId());
        target.setEmplId(source.getEmplId());
        target.setEmployee(source.getEmployee());
        target.setDocumentType(populateDocumentType(source.getDocumentType()));
        target.setCompCode(FKConstants.COMP_CODE);
        target.setCreateOn(new Date());
        target.setId(source.getId());
    }

    private DocumentTypeWsDTO populateDocumentType(HrDocumentType documentType) {
        DocumentTypeWsDTO documentTypeWsDTO = new DocumentTypeWsDTO();
        if(documentType != null){
            documentTypeWsDTO.setId(documentType.getId());
            documentTypeWsDTO.setCode(documentType.getCode());
            documentTypeWsDTO.setDescription(documentType.getDescription());
            return documentTypeWsDTO;
        }
        return null;
    }

}
