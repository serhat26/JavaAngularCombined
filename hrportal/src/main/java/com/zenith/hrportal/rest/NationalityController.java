package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.nationnality.NationalityWsDTO;
import com.zenith.hrportal.entities.nationnality.Nationality;
import com.zenith.hrportal.service.nationnality.NationalityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Nationality controller.
 */
@RestController
@RequestMapping(value = "/api")
public class NationalityController {

    @Autowired
    private NationalityService nationalityService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Gets all.
     *
     * @return the all
     */
    @RequestMapping(value = "/nationalities",method = RequestMethod.GET)
    @ResponseBody
    public List< NationalityWsDTO > getAll() {
        List< Nationality > nationalities = nationalityService.getAll();
        return nationalities.stream().map(nationality -> this.convertToDto(nationality)).collect(Collectors.toList());
    }

    private NationalityWsDTO convertToDto(Nationality nationality) {
        NationalityWsDTO dto = modelMapper.map(nationality, NationalityWsDTO.class);
        dto.setId(nationality.getNationalityIdentity().getId());
        dto.setPmlId(nationality.getNationalityIdentity().getPmlId());
        return dto;
    }

}
