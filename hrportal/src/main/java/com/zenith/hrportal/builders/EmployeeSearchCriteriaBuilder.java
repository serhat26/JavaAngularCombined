package com.zenith.hrportal.builders;

import com.zenith.hrportal.dto.city.CityWsDTO;
import com.zenith.hrportal.dto.costcenter.CostCenterWsDTO;
import com.zenith.hrportal.dto.department.DepartmentWsDTO;
import com.zenith.hrportal.dto.nationnality.NationalityWsDTO;
import com.zenith.hrportal.dto.trade.TradeWsDTO;
import com.zenith.hrportal.entities.cities.City;
import com.zenith.hrportal.entities.cities.CityIdentity;
import com.zenith.hrportal.entities.costcenter.CostCenter;
import com.zenith.hrportal.entities.department.Departement;
import com.zenith.hrportal.entities.department.DepartementIdentity;
import com.zenith.hrportal.entities.employee.EmployeeType;
import com.zenith.hrportal.entities.nationnality.Nationality;
import com.zenith.hrportal.entities.nationnality.NationalityIdentity;
import com.zenith.hrportal.entities.trade.Trade;
import com.zenith.hrportal.entities.trade.TradeIdentity;
import com.zenith.hrportal.repository.*;
import com.zenith.hrportal.repository.specs.EmployeeSpecifications;
import com.zenith.hrportal.repository.specs.SearchCriteria;
import com.zenith.hrportal.repository.specs.SearchOperation;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Employee search criteria builder.
 */
@Service
public class EmployeeSearchCriteriaBuilder {

    private static Logger LOG = Logger.getLogger(EmployeeSearchCriteriaBuilder.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private NationalityRepository nationalityRepository;

    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    @Autowired
    private CostCenterRepository costCenterRepository;

    @Autowired
    private CityRepository cityRepository;

    /**
     * The Employee specifications.
     */
    EmployeeSpecifications employeeSpecifications = new EmployeeSpecifications();


    /**
     * With companies employee search criteria builder.
     *
     * @param categoryFrom the category from
     * @param categoryTo   the category to
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withCompanies(String categoryFrom, String categoryTo) {
        if (StringUtils.isNotBlank(categoryFrom) && StringUtils.isNotBlank(categoryTo)) {
            List< String > companies = new ArrayList<>();
            int from = Integer.valueOf(categoryFrom);
            int to = Integer.valueOf(categoryTo);
            for (int i = from; i <= to; i++) {
                companies.add(String.format("%02d", i));
            }
            if (CollectionUtils.isNotEmpty(companies)) {
                employeeSpecifications.add(new SearchCriteria("compCode", companies, SearchOperation.IN));
            }
        }
        return this;
    }

    /**
     * With cost centers employee search criteria builder.
     *
     * @param costCenters the cost centers
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withCostCenters(List< CostCenterWsDTO> costCenters) {
        List< CostCenter > costCenterModels = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(costCenters)) {
            costCenters.stream().forEach(centerWsDTO -> {
                try {
                    costCenterModels.addAll(Arrays.asList(costCenterRepository.findByCode(centerWsDTO.getCode()).get()));
                } catch (Exception ex) {
                    LOG.warn("Error  retrieving cost center");
                }
            });
        }
        if (CollectionUtils.isNotEmpty(costCenters)) {
            employeeSpecifications.add(new SearchCriteria("costCenter", costCenterModels, SearchOperation.IN));
        }
        return  this;
    }

    /**
     * With emp nos employee search criteria builder.
     *
     * @param empNoFrom the emp no from
     * @param empNoTO   the emp no to
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withEmpNos(Long empNoFrom, Long empNoTO) {
        if (empNoFrom != null && empNoTO != null) {
            List< Long > empNos = Stream.iterate(empNoFrom, n -> n + 1)
                    .limit(empNoTO)
                    .collect(Collectors.toList());
            if (CollectionUtils.isNotEmpty(empNos)) {
                employeeSpecifications.add(new SearchCriteria("empNo", empNos, SearchOperation.IN));
            }
        }
        return this;
    }

    /**
     * With departments employee search criteria builder.
     *
     * @param departments the departments
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withDepartments(List< DepartmentWsDTO > departments) {
        List< Departement > departmentModels = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(departments)) {
            departments.stream().forEach(department -> {
                try {
                    DepartementIdentity departementIdentity = new DepartementIdentity(department.getCode(), department.getCompany());
                    departmentModels.addAll(departmentRepository.findByDepartementIdentity(departementIdentity));
                } catch (Exception ex) {
                    LOG.warn("Error  retrieving departments");
                }
            });
            employeeSpecifications.add(new SearchCriteria("departement", departmentModels, SearchOperation.IN));
        }
        return this;
    }

    /**
     * With nationalities employee search criteria builder.
     *
     * @param nationalities the nationalities
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withNationalities(List< NationalityWsDTO > nationalities) {
        List< Nationality > nationalityModels = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(nationalities)) {
            nationalities.stream().forEach(nationality -> {
                try {
                    NationalityIdentity nationalityIdentity = new NationalityIdentity(nationality.getId(), nationality.getPmlId());
                    nationalityModels.add(nationalityRepository.findByNationalityIdentity(nationalityIdentity));
                } catch (Exception ex) {
                    LOG.warn("Error  retrieving Nationality");
                }
            });
            employeeSpecifications.add(new SearchCriteria("nationality", nationalityModels, SearchOperation.IN));
        }
        return this;
    }

    /**
     * With cities employee search criteria builder.
     *
     * @param cities the cities
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withCities(List< CityWsDTO > cities) {
        List< City > citiesModels = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(cities)){
            cities.stream().forEach(cityWsDTO -> {
                try {
                    CityIdentity cityIdentity = new CityIdentity(cityWsDTO.getCode(), cityWsDTO.getStateCode(), cityWsDTO.getStatePpctryCode());
                    citiesModels.add(cityRepository.findByCityIdentity(cityIdentity));
                } catch (Exception ex) {
                    LOG.warn("Error  retrieving City");
                }
            });
            employeeSpecifications.add(new SearchCriteria("city", citiesModels, SearchOperation.IN));
        }
        return this;
    }


    /**
     * With professions employee search criteria builder.
     *
     * @param tradesWsDTOs the trades ws dt os
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withProfessions(List< TradeWsDTO > tradesWsDTOs) {
        List< Trade > tradeModels = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(tradesWsDTOs)) {
            tradesWsDTOs.stream().forEach(tradeWsDTO -> {
                try {
                    TradeIdentity tradeIdentity = new TradeIdentity(tradeWsDTO.getCode(), tradeWsDTO.getCompCode(), tradeWsDTO.getPmlId());
                    tradeModels.add(tradeRepository.findByTraddeIdentity(tradeIdentity));
                } catch (Exception ex) {
                    LOG.warn("Error  retrieving Trade");
                }
            });
            employeeSpecifications.add(new SearchCriteria("profession", tradeModels, SearchOperation.IN));
        }
        return this;
    }

    /**
     * With employee types employee search criteria builder.
     *
     * @param employeeTypes the employee types
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withEmployeeTypes(List< EmployeeType > employeeTypes) {
       List<EmployeeType> employeeTypesModels = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(employeeTypes)) {
            employeeTypes.stream().forEach(employeeType -> {
                employeeTypesModels.add(employeeTypeRepository.findById(employeeType.getId()).get());
            });
            employeeSpecifications.add(new SearchCriteria("employeeType", employeeTypesModels, SearchOperation.IN));
        }
        return this;
    }

    /**
     * With birth date employee search criteria builder.
     *
     * @param fromDate the from date
     * @param toDate   the to date
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withBirthDate(Date fromDate, Date toDate) {
        if (fromDate != null && toDate != null) {
            List< Date > dateParams = new ArrayList<>();
            dateParams.addAll(Arrays.asList(fromDate, toDate));
            employeeSpecifications.add(new SearchCriteria("dob", dateParams, SearchOperation.BETWEEN));
        }

        return this;
    }

    /**
     * With joining date employee search criteria builder.
     *
     * @param fromDate the from date
     * @param toDate   the to date
     * @return the employee search criteria builder
     */
    public EmployeeSearchCriteriaBuilder withJoiningDate(Date fromDate, Date toDate) {
        if (fromDate != null && toDate != null) {
            List< Date > dateParams = new ArrayList<>();
            dateParams.addAll(Arrays.asList(fromDate, toDate));
            employeeSpecifications.add(new SearchCriteria("doj", dateParams, SearchOperation.BETWEEN));
        }

        return this;
    }

    /**
     * Build employee specifications.
     *
     * @return the employee specifications
     */
    public EmployeeSpecifications build() {
        return employeeSpecifications;
    }

    /**
     * Gets employee specifications.
     *
     * @return the employee specifications
     */
    public EmployeeSpecifications getEmployeeSpecifications() {
        return employeeSpecifications;
    }

    /**
     * Sets employee specifications.
     *
     * @param employeeSpecifications the employee specifications
     */
    public void setEmployeeSpecifications(EmployeeSpecifications employeeSpecifications) {
        this.employeeSpecifications = employeeSpecifications;
    }
}
