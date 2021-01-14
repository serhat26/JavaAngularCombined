package com.zenith.hrportal.entities.category;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The type Category grad identity.
 */
@Embeddable
public class CategoryGradIdentity implements Serializable {

    @NotNull
    @Column(name = "CODE")
    private String code;

    @NotNull
    @Column(name = "COMP_CODE")
    private String compCode;


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
}
