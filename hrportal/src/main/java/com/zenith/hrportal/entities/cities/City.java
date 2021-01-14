package com.zenith.hrportal.entities.cities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * The type City.
 */
@Entity
@Table(name = "PP_TOWN_CITIES")
public class City implements Serializable {

    @EmbeddedId
    private CityIdentity cityIdentity;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATE_BY")
    private String createdBy;

    @Column(name = "UPDATE_BY")
    private String updatedBy;

    @Column(name = "UPDATE_ON")
    private Date updatedOn;

    @Column(name = "FIRST_CLASS")
    private Long firstClass;

    @Column(name = "SECOND_CLASS")
    private Long secondClass;

    @Column(name = "ECONOMY_CLASS")
    private Long economyClass;

    /**
     * Gets city identity.
     *
     * @return the city identity
     */
    public CityIdentity getCityIdentity() {
        return cityIdentity;
    }

    /**
     * Sets city identity.
     *
     * @param cityIdentity the city identity
     */
    public void setCityIdentity(CityIdentity cityIdentity) {
        this.cityIdentity = cityIdentity;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets created by.
     *
     * @return the created by
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets created by.
     *
     * @param createdBy the created by
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets updated by.
     *
     * @return the updated by
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets updated by.
     *
     * @param updatedBy the updated by
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * Gets updated on.
     *
     * @return the updated on
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Sets updated on.
     *
     * @param updatedOn the updated on
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * Gets first class.
     *
     * @return the first class
     */
    public Long getFirstClass() {
        return firstClass;
    }

    /**
     * Sets first class.
     *
     * @param firstClass the first class
     */
    public void setFirstClass(Long firstClass) {
        this.firstClass = firstClass;
    }

    /**
     * Gets second class.
     *
     * @return the second class
     */
    public Long getSecondClass() {
        return secondClass;
    }

    /**
     * Sets second class.
     *
     * @param secondClass the second class
     */
    public void setSecondClass(Long secondClass) {
        this.secondClass = secondClass;
    }

    /**
     * Gets economy class.
     *
     * @return the economy class
     */
    public Long getEconomyClass() {
        return economyClass;
    }

    /**
     * Sets economy class.
     *
     * @param economyClass the economy class
     */
    public void setEconomyClass(Long economyClass) {
        this.economyClass = economyClass;
    }
}
