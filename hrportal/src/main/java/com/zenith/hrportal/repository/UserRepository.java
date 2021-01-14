package com.zenith.hrportal.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zenith.hrportal.entities.user.User;

/**
 * Spring Data JPA repository for the {@link User} entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find one by reset key optional.
     *
     * @param resetKey the reset key
     * @return the optional
     */
    Optional<User> findOneByResetKey(String resetKey);

    /**
     * Find one by email ignore case optional.
     *
     * @param email the email
     * @return the optional
     */
    Optional<User> findOneByEmailIgnoreCase(String email);

    /**
     * Find one by login optional.
     *
     * @param login the login
     * @return the optional
     */
    Optional<User> findOneByLogin(String login);

    /**
     * Find one with authorities by login optional.
     *
     * @param login the login
     * @return the optional
     */
    @EntityGraph(attributePaths = "authorities")
	Optional<User> findOneWithAuthoritiesByLogin(String login);

    /**
     * Find one with authorities by email ignore case optional.
     *
     * @param email the email
     * @return the optional
     */
    @EntityGraph(attributePaths = "authorities")
	Optional<User> findOneWithAuthoritiesByEmailIgnoreCase(String email);

    /**
     * Find all by login not page.
     *
     * @param pageable the pageable
     * @param login    the login
     * @return the page
     */
    Page<User> findAllByLoginNot(Pageable pageable, String login);

}
