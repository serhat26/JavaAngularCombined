package com.zenith.hrportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenith.hrportal.entities.user.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
