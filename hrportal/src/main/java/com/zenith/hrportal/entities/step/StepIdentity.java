package com.zenith.hrportal.entities.step;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * The type Step identity.
 */
@Embeddable
public class StepIdentity implements Serializable {

    @Column(name = "SNO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sno;

    @Column(name = "COMP_CODE")
    private String compCode;
}
