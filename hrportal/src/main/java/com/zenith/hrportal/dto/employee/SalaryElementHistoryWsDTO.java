package com.zenith.hrportal.dto.employee;

import java.math.BigDecimal;
import java.util.List;

/**
 * The type Salary element history ws dto.
 */
public class SalaryElementHistoryWsDTO {

    private String type = "undefined";
    private String name;
    private  List<BigDecimal> data;
    private int stack;

    /**
     * Instantiates a new Salary element history ws dto.
     */
    public SalaryElementHistoryWsDTO() {
    }

    /**
     * Instantiates a new Salary element history ws dto.
     *
     * @param name  the name
     * @param data  the data
     * @param stack the stack
     */
    public SalaryElementHistoryWsDTO(String name, List<BigDecimal> data, int stack) {
        this.name = name;
        this.data = data;
        this.stack = stack;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public List< BigDecimal > getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List< BigDecimal > data) {
        this.data = data;
    }

    /**
     * Gets stack.
     *
     * @return the stack
     */
    public int getStack() {
        return stack;
    }

    /**
     * Sets stack.
     *
     * @param stack the stack
     */
    public void setStack(int stack) {
        this.stack = stack;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }
}
