package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.cities.City;
import com.zenith.hrportal.entities.cities.CityIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface City repository.
 */
public interface CityRepository extends JpaRepository< City, CityIdentity > {

    /**
     * Find by city identity city.
     *
     * @param cityIdentity the city identity
     * @return the city
     */
    City findByCityIdentity(CityIdentity cityIdentity);
}
