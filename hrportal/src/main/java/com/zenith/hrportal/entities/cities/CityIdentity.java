package com.zenith.hrportal.entities.cities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The type City identity.
 */
@Embeddable
public class CityIdentity implements Serializable {

    @Column(name = "CODE")
    private String code;

    @Column(name = "PPSTA_CODE")
    private String stateCode;

    @Column(name = "PPSTA_PPCTRY_CODE")
    private String statePpctryCode;

    /**
     * Instantiates a new City identity.
     *
     * @param code            the code
     * @param stateCode       the state code
     * @param statePpctryCode the state ppctry code
     */
    public CityIdentity(String code, String stateCode, String statePpctryCode) {
        this.code = code;
        this.stateCode = stateCode;
        this.statePpctryCode = statePpctryCode;
    }

    /**
     * Instantiates a new City identity.
     */
    public CityIdentity() {
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
}
