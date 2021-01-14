package com.zenith.hrportal.entities;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * The type Abstract entity.
 */
public class AbstractEntity implements Serializable {


    @Column(name = "UPDATE_BY")
    private String updatedBy;

    @Column(name = "UPDATE_ON")
    private Date updatedOn;

    @Column(name = "CREATE_BY")
    private String createdBy;

    @Column(name = "CREATE_ON")
    private Date createdOn;

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
     * Gets created on.
     *
     * @return the created on
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets created on.
     *
     * @param createdOn the created on
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
