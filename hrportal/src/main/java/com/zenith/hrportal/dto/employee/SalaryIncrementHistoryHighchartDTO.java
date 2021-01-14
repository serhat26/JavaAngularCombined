package com.zenith.hrportal.dto.employee;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * The type Salary increment history highchart dto.
 */
public class SalaryIncrementHistoryHighchartDTO implements Serializable {

    private List<Integer> series;
    private Map<String,SalaryElementHistoryWsDTO> data;

    /**
     * Instantiates a new Salary increment history highchart dto.
     */
    public SalaryIncrementHistoryHighchartDTO() {
    }

    /**
     * Instantiates a new Salary increment history highchart dto.
     *
     * @param series the series
     * @param data   the data
     */
    public SalaryIncrementHistoryHighchartDTO(List< Integer > series, Map< String, SalaryElementHistoryWsDTO > data) {
        this.series = series;
        this.data = data;
    }

    /**
     * Gets series.
     *
     * @return the series
     */
    public List< Integer > getSeries() {
        return series;
    }

    /**
     * Sets series.
     *
     * @param series the series
     */
    public void setSeries(List< Integer > series) {
        this.series = series;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public Map< String, SalaryElementHistoryWsDTO > getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(Map< String, SalaryElementHistoryWsDTO > data) {
        this.data = data;
    }
}
