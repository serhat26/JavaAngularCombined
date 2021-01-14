package com.zenith.hrportal.service.employee.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.zenith.hrportal.builders.EmployeeSearchCriteriaBuilder;
import com.zenith.hrportal.dto.employee.EmployeeNationalityPercentageDTO;
import com.zenith.hrportal.dto.employee.EmployeeSearchParamsDTO;
import com.zenith.hrportal.entities.nationnality.Nationality;
import com.zenith.hrportal.repository.specs.EmployeeSpecifications;
import com.zenith.hrportal.repository.specs.SearchCriteria;
import com.zenith.hrportal.repository.specs.SearchOperation;
import com.zenith.hrportal.service.nationnality.NationalityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.employee.EmployeeIdentity;
import com.zenith.hrportal.repository.EmployeeRepository;
import com.zenith.hrportal.service.employee.EmployeeService;

/**
 * The type Default employee service.
 */
@Service
public class DefaultEmployeeService implements EmployeeService {

private static Logger LOG = LoggerFactory.getLogger(DefaultEmployeeService.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private NationalityService nationalityService;

	@Autowired
	private EmployeeSearchCriteriaBuilder employeeSearchCriteriaBuilder;
	@Override
		public List<Employee> getAll() {
			return (List<Employee>) employeeRepository.findAll();
		}
	
	@Override
		public List<Employee> getByName(String name) {
			return employeeRepository.findByNameContaining(name);
		}

	@Override
	public List<Employee> getEmployeesByNumOrName(Long empNo, String name) {
		return employeeRepository.findByEmpNoOrNameContaining(empNo, name);
	}

	@Override
	public Page<Employee> getPage(PageRequest pageRequest) {
		return employeeRepository.findAll(pageRequest);
	}
	
	@Override
	public Employee get(Long id,Long pmlId) {
		Optional<Employee> EmployeeOp =  employeeRepository.findById(new EmployeeIdentity(id, pmlId));
		if(EmployeeOp.isPresent()) {
			return EmployeeOp.get();
		}
		LOG.warn("No Employeee found for id "+id);
		return null;
	}
	
	

	@Override
	public Employee add(Employee empl) {
		return employeeRepository.save(empl);
		
	}

	@Override
	public Employee update(Employee empl) {
		return employeeRepository.save(empl);
		
	}

	@Override
	public boolean delete(Long id,Long pmlId) {
		Optional<Employee> EmployeeOp =  employeeRepository.findById(new EmployeeIdentity(id, pmlId));
		if(EmployeeOp.isPresent()) {
			 employeeRepository.delete(EmployeeOp.get());
			 return true;
		} else {
			LOG.warn("No Employeee found for id "+id+" and PML_ID :"+pmlId);
			return false;
		}
	}
	
	
	@Override
	public Employee getByEmpNo(Long empNo) {
		List<Employee> employeesByEmpNo = employeeRepository.findByEmpNo(empNo);
		  return !CollectionUtils.isEmpty(employeesByEmpNo) ? employeesByEmpNo.get(0) : null;
	}

	@Override
	public Page<Employee> search(EmployeeSearchParamsDTO employeeSearchParamsDTO , Pageable pageable) {
		EmployeeSpecifications employeeSpecifications = employeeSearchCriteriaBuilder
				.withCompanies(employeeSearchParamsDTO.getCompanyCodeFrom(), employeeSearchParamsDTO.getCompanyCodeTo())
				.withEmpNos(employeeSearchParamsDTO.getEmpNoFrom(),employeeSearchParamsDTO.getEmpNoTo())
				.withBirthDate(employeeSearchParamsDTO.getBirthDateFrom(),employeeSearchParamsDTO.getBirthDateTo())
				.withJoiningDate(employeeSearchParamsDTO.getJoiningDateFrom(),employeeSearchParamsDTO.getJoiningDateTo())
				.withDepartments(employeeSearchParamsDTO.getDepartments())
				.withNationalities(employeeSearchParamsDTO.getNationalities())
				.withProfessions(employeeSearchParamsDTO.getProfessions())
				.withEmployeeTypes(employeeSearchParamsDTO.getEmployeeTypes())
				.withCostCenters(employeeSearchParamsDTO.getCostCenters())
				.withCities(employeeSearchParamsDTO.getCities())
				.build();
		Page<Employee> result = employeeRepository.findAll(employeeSpecifications , pageable);
		employeeSearchCriteriaBuilder.setEmployeeSpecifications(new EmployeeSpecifications());
		return result;
	}

	@Override
	public List< Employee > search(EmployeeSearchParamsDTO employeeSearchParamsDTO) {
		EmployeeSpecifications employeeSpecifications = employeeSearchCriteriaBuilder
				.withCompanies(employeeSearchParamsDTO.getCompanyCodeFrom(), employeeSearchParamsDTO.getCompanyCodeTo())
				.withEmpNos(employeeSearchParamsDTO.getEmpNoFrom(),employeeSearchParamsDTO.getEmpNoTo())
				.withBirthDate(employeeSearchParamsDTO.getBirthDateFrom(),employeeSearchParamsDTO.getBirthDateTo())
				.withJoiningDate(employeeSearchParamsDTO.getJoiningDateFrom(),employeeSearchParamsDTO.getJoiningDateTo())
				.withDepartments(employeeSearchParamsDTO.getDepartments())
				.withNationalities(employeeSearchParamsDTO.getNationalities())
				.withProfessions(employeeSearchParamsDTO.getProfessions())
				.withEmployeeTypes(employeeSearchParamsDTO.getEmployeeTypes())
				.withCostCenters(employeeSearchParamsDTO.getCostCenters())
				.withCities(employeeSearchParamsDTO.getCities())
				.build();
		List<Employee> result = employeeRepository.findAll(employeeSpecifications);
		employeeSearchCriteriaBuilder.setEmployeeSpecifications(new EmployeeSpecifications());
		return result;
	}

	@Override
	public List< EmployeeNationalityPercentageDTO > calculateEmployeeNationalitiesPercentage(String status) {
		List<EmployeeNationalityPercentageDTO> result = new ArrayList<>();
		List< Nationality > nationalities = nationalityService.getAll();
		double totalEmployees = employeeRepository.count();
		nationalities.stream().forEach(nationality -> {
			EmployeeSpecifications employeeSpecifications = new EmployeeSpecifications();
			employeeSpecifications.add(new SearchCriteria("nationality", Arrays.asList(nationality), SearchOperation.IN));
			employeeSpecifications.add(new SearchCriteria("status", status, SearchOperation.EQUAL));
			double employeesByNationality = employeeRepository.count(employeeSpecifications);
			double percentage = (employeesByNationality * 100) /totalEmployees;
			if(percentage>0){
				EmployeeNationalityPercentageDTO employeeNationalityPercentage = new EmployeeNationalityPercentageDTO(nationality.getDescription(),percentage);
				result.add(employeeNationalityPercentage);
			}
		});
		return result;
	}

	@Override
	public List< String > getStatuses() {
		return employeeRepository.findStatuses();
	}

	/**
     * Sets employeee repository.
     *
     * @param employeeRepository the employee repository
     */
    public void setEmployeeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
	
}
