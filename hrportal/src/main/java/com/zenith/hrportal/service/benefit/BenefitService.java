package com.zenith.hrportal.service.benefit;

import com.zenith.hrportal.dto.employee.SalaryElementHistoryWsDTO;
import com.zenith.hrportal.dto.employee.SalaryIncrementHistoryHighchartDTO;
import com.zenith.hrportal.entities.benefit.Benefit;

import java.util.List;
import java.util.Map;

/**
 * The interface Benefit service.
 */
public interface BenefitService {

    /**
     * Gets number of employees per salary bracket.
     *
     * @return the number of employees per salary bracket
     */
    List< Object[] > getNumberOfEmployeesPerSalaryBracket();


    /**
     * Gets salary increment history.
     *
     * @param empNos the emp nos
     * @return the salary increment history
     */
    List< Object[]> getSalaryIncrementHistory(List<Long> empNos);


    /**
     * Gets salary increment history date.
     *
     * @param empNos the emp nos
     * @return the salary increment history date
     */
    SalaryIncrementHistoryHighchartDTO getSalaryIncrementHistoryData(List<Long> empNos);

    /**
     * Gets number of employees per salary total.
     *
     * @return the number of employees per salary bracket
     */
    List< Object[] > getNumberOfEmployeesPerSalaryTotal();
}


