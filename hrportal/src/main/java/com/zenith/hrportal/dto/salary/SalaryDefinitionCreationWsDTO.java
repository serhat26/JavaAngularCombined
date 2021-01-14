package com.zenith.hrportal.dto.salary;

/**
 * The type Salary definition creation ws dto.
 */
public class SalaryDefinitionCreationWsDTO {

    private String categoryGrade;
    private Long payPerc;
    private String createdBy;
    private SalaryDefinitionWsDTO salaryDefinition;

    /**
     * Gets category grade.
     *
     * @return the category grade
     */
    public String getCategoryGrade() {
        return categoryGrade;
    }

    /**
     * Sets category grade.
     *
     * @param categoryGrade the category grade
     */
    public void setCategoryGrade(String categoryGrade) {
        this.categoryGrade = categoryGrade;
    }

    /**
     * Gets pay perc.
     *
     * @return the pay perc
     */
    public Long getPayPerc() {
        return payPerc;
    }

    /**
     * Sets pay perc.
     *
     * @param payPerc the pay perc
     */
    public void setPayPerc(Long payPerc) {
        this.payPerc = payPerc;
    }

    /**
     * Gets salary definition.
     *
     * @return the salary definition
     */
    public SalaryDefinitionWsDTO getSalaryDefinition() {
        return salaryDefinition;
    }

    /**
     * Sets salary definition.
     *
     * @param salaryDefinition the salary definition
     */
    public void setSalaryDefinition(SalaryDefinitionWsDTO salaryDefinition) {
        this.salaryDefinition = salaryDefinition;
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
}
