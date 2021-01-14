package com.zenith.hrportal.dto.employee;

/**
 * The type Employee nationality percentage dto.
 */
public class EmployeeNationalityPercentageDTO {

    private String nationality;
    private double percentage;

    /**
     * Instantiates a new Employee nationality percentage dto.
     */
    public EmployeeNationalityPercentageDTO() {
    }

    /**
     * Instantiates a new Employee nationality percentage dto.
     *
     * @param nationality the nationality
     * @param percentage  the percentage
     */
    public EmployeeNationalityPercentageDTO(String nationality, double percentage) {
        this.nationality = nationality;
        this.percentage = percentage;
    }

    /**
     * Gets nationality.
     *
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets nationality.
     *
     * @param nationality the nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Gets percentage.
     *
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * Sets percentage.
     *
     * @param percentage the percentage
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
