package com.zenith.hrportal.dto.nationnality;

/**
 * The type Nationality ws dto.
 */
public class NationalityWsDTO {

    private Long id;
    private Long pmlId;
    private String description;

    /**
     * Instantiates a new Nationality ws dto.
     *
     * @param id          the id
     * @param pmlId       the pml id
     * @param description the description
     */
    public NationalityWsDTO(Long id, Long pmlId, String description) {
        this.id = id;
        this.pmlId = pmlId;
        this.description = description;
    }

    /**
     * Instantiates a new Nationality ws dto.
     */
    public NationalityWsDTO() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
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
