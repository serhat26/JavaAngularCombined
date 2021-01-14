package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.nationnality.Nationality;
import com.zenith.hrportal.entities.nationnality.NationalityIdentity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Nationality repository.
 */
public interface NationalityRepository extends JpaRepository<Nationality, NationalityIdentity > {

    Page< Nationality > findAll(Pageable pageable);

    /**
     * Find by nationality identity nationality.
     *
     * @param nationalityIdentity the nationality identity
     * @return the nationality
     */
    Nationality findByNationalityIdentity(NationalityIdentity nationalityIdentity);
}
