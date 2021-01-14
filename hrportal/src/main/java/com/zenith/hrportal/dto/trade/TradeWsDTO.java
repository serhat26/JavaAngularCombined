package com.zenith.hrportal.dto.trade;


/**
 * The type Trade ws dto.
 */
public class TradeWsDTO {

    private Long code;
    private String compCode;
    private Long pmlId;
    private String description;

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
     * Gets comp code.
     *
     * @return the comp code
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * Sets comp code.
     *
     * @param compCode the comp code
     */
    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    /**
     * Gets pml id.
     *
     * @return the pml id
     */
    public Long getPmlId() {
        return pmlId;
    }

    /**
     * Sets pml id.
     *
     * @param pmlId the pml id
     */
    public void setPmlId(Long pmlId) {
        this.pmlId = pmlId;
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
}
