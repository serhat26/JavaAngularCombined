package com.zenith.hrportal.service.city.impl;

import com.zenith.hrportal.entities.cities.City;
import com.zenith.hrportal.entities.cities.CityIdentity;
import com.zenith.hrportal.repository.CityRepository;
import com.zenith.hrportal.service.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Default city service.
 */
@Service
public class DefaultCityService implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public Page< City > getPage(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }

    @Override
    public City getCity(CityIdentity cityIdentity) {
        return cityRepository.getOne(cityIdentity);
    }

    @Override
    public List< City > getAll() {
        return cityRepository.findAll();
    }
}
