package com.zenith.hrportal.entities.grademaster;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The type Grade master identity.
 */
@Embeddable
public class GradeMasterIdentity implements Serializable {

    @Column(name = "CODE")
    private String code;

    @Column(name = "PPCS_COMP_CODE")
    private String compCode;

    @Column(name = "PPCS_CODE")
    private String ppcsCode;

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

    /**
     * Gets ppcs code.
     *
     * @return the ppcs code
     */
    public String getPpcsCode() {
        return ppcsCode;
    }

    /**
     * Sets ppcs code.
     *
     * @param ppcsCode the ppcs code
     */
    public void setPpcsCode(String ppcsCode) {
        this.ppcsCode = ppcsCode;
    }
}
