package com.zenith.hrportal.service.nationnality;

import com.zenith.hrportal.entities.nationnality.Nationality;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * The interface Nationality service.
 */
public interface NationalityService {

    /**
     * Gets all.
     *
     * @param pageable the pageable
     * @return the all
     */
    Page< Nationality > getAll(Pageable pageable);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<Nationality> getAll();
}
