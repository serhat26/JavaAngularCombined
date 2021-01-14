package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.department.DepartmentWsDTO;
import com.zenith.hrportal.entities.department.Departement;
import com.zenith.hrportal.service.department.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Department controller.
 */
@RestController
@RequestMapping(value = "/api")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Gets all.
     *
     * @return the all
     */
    @RequestMapping(value = "/departments",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<DepartmentWsDTO>> getAll() {
        List< DepartmentWsDTO > departments  = departmentService.getAll().stream().map(department -> this.convertToDto(department)).collect(Collectors.toList());
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    private DepartmentWsDTO convertToDto(Departement department) {
        DepartmentWsDTO dto = modelMapper.map(department, DepartmentWsDTO.class);
        dto.setCode(department.getDepartementIdentity().getCode());
        dto.setCompany(department.getDepartementIdentity().getCompany());
        return dto;
    }
}
