package com.zenith.hrportal.entities.grademaster;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Grade master.
 */
@Entity
@Table(name = "PP_GRADE_MASTERS")
public class GradeMaster implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private GradeMasterIdentity gradeMasterIdentity;

}
