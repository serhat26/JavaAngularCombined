package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.city.CityWsDTO;
import com.zenith.hrportal.entities.cities.City;
import com.zenith.hrportal.entities.costcenter.CostCenter;
import com.zenith.hrportal.service.city.CityService;
import com.zenith.hrportal.utils.PaginationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * Get all cost centre response entity.
     *
     * @param pageable the pageable
     * @return the response entity
     */
    @GetMapping("/cities")
    public ResponseEntity< List< CityWsDTO > > getAllCostCentre(Pageable pageable){
        final List<CityWsDTO> cities = cityService.getAll().stream().map(city -> new CityWsDTO(city)).collect(Collectors.toList());
        return new ResponseEntity< List< CityWsDTO >  >(cities, HttpStatus.OK);
    }

}
