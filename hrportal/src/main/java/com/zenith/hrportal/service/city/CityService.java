package com.zenith.hrportal.service.city;

import com.zenith.hrportal.dto.city.CityWsDTO;
import com.zenith.hrportal.entities.cities.City;
import com.zenith.hrportal.entities.cities.CityIdentity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * The interface City service.
 */
public interface CityService {

    /**
     * Gets page.
     *
     * @param pageable the pageable
     * @return the page
     */
    Page< City > getPage(Pageable pageable);

    /**
     * Gets city.
     *
     * @param cityIdentity the city identity
     * @return the city
     */
    City getCity(CityIdentity cityIdentity);

    /**
     * Gets all.
     *
     * @return the all
     */
    List< City> getAll();
}
