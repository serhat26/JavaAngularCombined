package com.zenith.hrportal.populators.impl;

import com.zenith.hrportal.constants.FKConstants;
import com.zenith.hrportal.dto.document.DocumentTypeWsDTO;
import com.zenith.hrportal.dto.employee.EmployeeWsDTO;
import com.zenith.hrportal.dto.document.HrDocumentRequestWsDTO;
import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.document.HrDocumentRequest;
import com.zenith.hrportal.entities.document.HrDocumentType;
import com.zenith.hrportal.populators.Populator;
import com.zenith.hrportal.service.employee.EmployeeService;
import com.zenith.hrportal.service.document.HrDocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("hrDocumentRequestModelPopulator")
public class HrDocumentRequestModelPopulator implements Populator<HrDocumentRequestWsDTO, HrDocumentRequest> {

    @Autowired
    private HrDocumentTypeService documentTypeService;

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void populate(HrDocumentRequestWsDTO source, HrDocumentRequest target) {
        target.setDocNo(source.getDocNo());
        target.setDocDate(new Date());
        target.setEmplPmlId(source.getEmplPmlId());
        target.setEmplId(source.getEmplId());
        target.setEmployee(source.getEmployee());
        target.setDocumentType(getDocumentType(source.getDocumentType()));
        target.setCompCode(FKConstants.COMP_CODE);
        target.setCreateOn(new Date());

    }

    private Employee getEmployee(EmployeeWsDTO employee) {
        if(employee != null){
            return employeeService.getByEmpNo(employee.getEmpNo());
        }
        return  null;
    }

    private HrDocumentType getDocumentType(DocumentTypeWsDTO documentType) {
        if(documentType != null){
            return this.documentTypeService.getDocumentType(documentType.getId());
        }
        return null;
    }

}
