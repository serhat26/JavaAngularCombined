package com.zenith.hrportal.dto.salary;

/**
 * The type Salary definition ws dto.
 */
public class SalaryDefinitionWsDTO {

    private Long code;

    private Long trxTypeCode;

    private String description;

    private Long percentage;

    private String createdby;

    /**
     * Gets code.
     *
     * @return the code
     */
    public Long getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(Long code) {
        this.code = code;
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
     * Gets percentage.
     *
     * @return the percentage
     */
    public Long getPercentage() {
        return percentage;
    }

    /**
     * Sets percentage.
     *
     * @param percentage the percentage
     */
    public void setPercentage(Long percentage) {
        this.percentage = percentage;
    }

    /**
     * Gets trx type code.
     *
     * @return the trx type code
     */
    public Long getTrxTypeCode() {
        return trxTypeCode;
    }

    /**
     * Sets trx type code.
     *
     * @param trxTypeCode the trx type code
     */
    public void setTrxTypeCode(Long trxTypeCode) {
        this.trxTypeCode = trxTypeCode;
    }

    /**
     * Gets createdby.
     *
     * @return the createdby
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * Sets createdby.
     *
     * @param createdby the createdby
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
}
