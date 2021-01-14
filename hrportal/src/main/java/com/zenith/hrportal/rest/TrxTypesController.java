package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.mastergrade.TrxTypesWsDTO;
import com.zenith.hrportal.entities.grademaster.TrxTypes;
import com.zenith.hrportal.service.categorygrademaster.trxtypes.TrxTypesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Trx types controller.
 */
@RestController
@RequestMapping("/api/trx-types")
public class TrxTypesController {

    @Autowired
    private TrxTypesService trxTypesService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Get all list.
     *
     * @return the list
     */
    @GetMapping("/all")
    @ResponseBody
    public List<TrxTypesWsDTO> getAll(){
        return trxTypesService.getAll().stream().map(trxTypes -> this.convertToDto(trxTypes))
                .collect(Collectors.toList());
    }

    private TrxTypesWsDTO convertToDto(TrxTypes trxTypes) {
        TrxTypesWsDTO dto = modelMapper.map(trxTypes, TrxTypesWsDTO.class);
        return dto;
    }
}
