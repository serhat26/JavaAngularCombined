package com.zenith.hrportal.service.benefit.impl;

import com.zenith.hrportal.dto.employee.SalaryElementHistoryWsDTO;
import com.zenith.hrportal.dto.employee.SalaryIncrementHistoryHighchartDTO;
import com.zenith.hrportal.repository.BenefitRepository;
import com.zenith.hrportal.service.benefit.BenefitService;
import com.zenith.hrportal.service.categorygrademaster.trxtypes.TrxTypesService;
import com.zenith.hrportal.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Default benefit service.
 */
@Service
public class DefaultBenefitService implements BenefitService {

    @Autowired
    private BenefitRepository benefitRepository;

    @Autowired
    private TrxTypesService trxTypesService;

    @Override
    public List< Object[] > getSalaryIncrementHistory(List< Long > empNos) {
        return benefitRepository.findSalaryIncrementHistory(empNos);
    }

    @Override
    public List< Object[] > getNumberOfEmployeesPerSalaryBracket() {
        return benefitRepository.findNumberOfEmployeesPerSalaryBracket();
    }

    @Override
    public List< Object[] > getNumberOfEmployeesPerSalaryTotal() {
        return benefitRepository.findNumberOfEmployeesPerSalaryTotal();
    }

    @Override
    public SalaryIncrementHistoryHighchartDTO getSalaryIncrementHistoryData(List< Long > empNos) {
        List< Object[] > salaryIncrementHistory = this.getSalaryIncrementHistory(empNos);
        List< Integer > series = populateSeries(salaryIncrementHistory);
        Map< String, SalaryElementHistoryWsDTO > data = populateSalaryElementData(series, salaryIncrementHistory);
        return new SalaryIncrementHistoryHighchartDTO(series, data);
    }

    private List< Integer > populateSeries(List< Object[] > salaryIncrementHistory) {
        List< Integer > series = new ArrayList<>();
        for (Object[] field : salaryIncrementHistory) {
            int year = DateUtils.getYearFromDate((Date) field[2]);
            if (!series.contains(year)) {
                series.add(year);
            }
        }
        return series;
    }

    private Map< String, SalaryElementHistoryWsDTO > populateSalaryElementData(List< Integer > years, List< Object[] > salaryIncrementHistory) {
        Map< String, SalaryElementHistoryWsDTO > map = new HashMap<>();
        List< String > allTrxTypes = trxTypesService.getAll().stream().map(trxTypes -> trxTypes.getDescription()).collect(Collectors.toList());
        for (int year : years) {
            for (String element : allTrxTypes) {
                BigDecimal salaryTotalPerTrxTypeAndYear = salaryIncrementHistory
                        .stream().filter(objects -> {
                            int currentYear = DateUtils.getYearFromDate((Date) objects[2]);
                            String currentTrxType = (String) objects[0];
                            return currentYear == year && element.equals(currentTrxType);
                        }).map(objects -> (BigDecimal) objects[1])
                        .collect(Collectors.toList())
                        .stream()
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
                SalaryElementHistoryWsDTO salaryElement = map.get(element) != null ? map.get(element) :
                        new SalaryElementHistoryWsDTO(element, new ArrayList<>(), year);
                int index = years.indexOf(year);
                if (salaryTotalPerTrxTypeAndYear != BigDecimal.ZERO) {
                    salaryTotalPerTrxTypeAndYear = salaryTotalPerTrxTypeAndYear;
                } else if (index != 0) {
                    salaryTotalPerTrxTypeAndYear = salaryElement.getData().get(index - 1);
                } else {
                    salaryTotalPerTrxTypeAndYear = BigDecimal.ZERO;
                }
                salaryElement.getData().add((salaryTotalPerTrxTypeAndYear));
                map.put(element, salaryElement);
            }
        }
        return map;
    }

    /**
     * Has increment in all years boolean.
     *
     * @param elementName            the element name
     * @param salaryIncrementHistory the salary increment history
     * @param years                  the years
     * @return the boolean
     */
    boolean hasIncrementInAllYears(String elementName, List< Object[] > salaryIncrementHistory, List< Integer > years) {
        return salaryIncrementHistory.stream().
                filter(elt -> (elt[0]).equals(elementName))
                .count() == years.size();
    }
}
