package com.zenith.hrportal.dto.city;

import com.zenith.hrportal.entities.cities.City;

import javax.persistence.Column;
import java.util.Date;

/**
 * The type City ws dto.
 */
public class CityWsDTO {

    private String code;

    private String stateCode;

    private String statePpctryCode;

    private String description;

    private String createdBy;

    private String updatedBy;

    private Date updatedOn;

    private Long firstClass;

    private Long secondClass;

    private Long economyClass;

    /**
     * Instantiates a new City ws dto.
     *
     * @param city the city
     */
    public CityWsDTO(City city){
        this.code = city.getCityIdentity().getCode();
        this.stateCode = city.getCityIdentity().getStateCode();
        this.statePpctryCode = city.getCityIdentity().getStatePpctryCode();
        this.description = city.getDescription();
        this.createdBy = city.getCreatedBy();
        this.updatedBy = city.getUpdatedBy();
        this.updatedOn = city.getUpdatedOn();
        this.firstClass = city.getFirstClass();
        this.secondClass = city.getSecondClass();
        this.economyClass = city.getEconomyClass();
    }

    /**
     * Instantiates a new City ws dto.
     */
    public CityWsDTO() {
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets state code.
     *
     * @return the state code
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets state code.
     *
     * @param stateCode the state code
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * Gets state ppctry code.
     *
     * @return the state ppctry code
     */
    public String getStatePpctryCode() {
        return statePpctryCode;
    }

    /**
     * Sets state ppctry code.
     *
     * @param statePpctryCode the state ppctry code
     */
    public void setStatePpctryCode(String statePpctryCode) {
        this.statePpctryCode = statePpctryCode;
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