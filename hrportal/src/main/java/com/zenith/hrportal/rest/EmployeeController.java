package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.employee.EmployeeNationalityPercentageDTO;
import com.zenith.hrportal.dto.employee.EmployeeSearchParamsDTO;
import com.zenith.hrportal.dto.employee.SalaryIncrementHistoryHighchartDTO;
import com.zenith.hrportal.dto.employee.SalaryIncrementHistoryRequestDTO;
import com.zenith.hrportal.dto.mastergrade.EmployeeCategoryGradeWsDTO;
import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.employee.EmployeeType;
import com.zenith.hrportal.service.benefit.BenefitService;
import com.zenith.hrportal.service.employee.EmployeeService;
import com.zenith.hrportal.service.employee.EmployeeTypeService;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The type Employee controller.
 */
@Controller
@RequestMapping(value = "/api")
public class EmployeeController {

  private static Logger LOG = LogManager.getLogger();

  @Autowired()
  private EmployeeService employeeService;

  @Autowired
  private EmployeeTypeService employeeTypeService;

  @Autowired
  private BenefitService benefitService;


    @Resource
    private ModelMapper modelMapper;

    /**
     * Gets all.
     *
     * @return the all
     */
    @RequestMapping(value = "/employees/all")
    @ResponseBody
    public List< Employee > getAll() {
        return employeeService.getAll();
    }

    /**
     * List page.
     *
     * @param page the page
     * @param size the size
     * @return the page
     */
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @ResponseBody
    public Page< Employee > list(@RequestParam(name = "page", defaultValue = "0") int page,
                                 @RequestParam(name = "size", defaultValue = "10") int size) {
        LOG.debug("Getting employees");
        PageRequest pageRequest = PageRequest.of(page, size);
        return employeeService.getPage(pageRequest);
    }

    /**
     * Gets employee types.
     *
     * @return the employee types
     */
    @RequestMapping(value = "/employees/types", method = RequestMethod.GET)
    @ResponseBody
    public List< EmployeeType > getEmployeeTypes() {
        return employeeTypeService.getAll();
    }


    /**
     * Gets employee.
     *
     * @param id    the id
     * @param pmlId the pml id
     * @return the employee
     */
    @RequestMapping(value = "/employee/{id}/{pmlId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< Employee > getEmployee(@PathVariable("id") long id, @PathVariable("pmlId") long pmlId) {
        Employee employee = employeeService.get(id, pmlId);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
        return new ResponseEntity< Employee >(HttpStatus.NO_CONTENT);
    }

    /**
     * Gets employees by name.
     *
     * @param name the name
     * @return the employees by name
     */
    @RequestMapping(value = "/employees/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public List< Employee > getEmployeesByName(@PathVariable("name") String name) {
        List< Employee > employees = employeeService.getByName(name);
        return employees;
    }

    /**
     * Gets employees by name or emp no.
     *
     * @param name   the name
     * @param empNum the emp num
     * @return the employees by name or emp no
     */
    @RequestMapping(value = "/employees/nameornum/{name}/{number}", method = RequestMethod.GET)
    @ResponseBody
    public List< Employee > getEmployeesByNameOrEmpNo(@PathVariable("name") String name, @PathVariable("number") Long empNum) {
        List< Employee > employees = employeeService.getEmployeesByNumOrName(empNum, name);
        return employees;
    }

    /**
     * Gets employee by emp no.
     *
     * @param empNo the emp no
     * @return the employee by emp no
     */
    @RequestMapping(value = "/employee/empno/{empNo}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< Employee > getEmployeeByEmpNo(@PathVariable("empNo") long empNo) {
        Employee employee = employeeService.getByEmpNo(empNo);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
        return new ResponseEntity< Employee >(HttpStatus.NO_CONTENT);
    }

    /**
     * Gets employee transfers.
     *
     * @param empNo the emp no
     * @return the employee transfers
     */
    @GetMapping(value = "/employee/transfers/{empNo}")
  @ResponseBody
  public ResponseEntity<List<EmployeeCategoryGradeWsDTO>> getEmployeeTransfers(
      @PathVariable("empNo") long empNo) {
    Employee employee = employeeService.getByEmpNo(empNo);
    if (Objects.nonNull(employee) && CollectionUtils.isNotEmpty(employee.getGrades())) {
      final List<EmployeeCategoryGradeWsDTO> grades = employee.getGrades().stream()
          .map(grade -> {
            final EmployeeCategoryGradeWsDTO gradeWsDTO = modelMapper
                .map(grade, EmployeeCategoryGradeWsDTO.class);
            gradeWsDTO.setCode(grade.getCategoryGradIdentity().getCode());
            return gradeWsDTO;
          })
          .collect(Collectors.toList());
      return new ResponseEntity<>(grades, HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }


    /**
     * Save employee response entity.
     *
     * @param employee the employee
     * @return the response entity
     */
    @RequestMapping(value = "/employee/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity< Object > saveEmployee(@RequestBody Employee employee) {
        try {
            Employee result = employeeService.add(employee);
            return new ResponseEntity< Object >(result, HttpStatus.OK);
        } catch (Exception ex) {
            LOG.error("Error while saving  employee" + ex.getMessage());
            return new ResponseEntity< Object >(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

  }

    /**
     * Update employee response entity.
     *
     * @param employee the employee
     * @return the response entity
     */
    @RequestMapping(value = "/employee/update", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity< Object > updateEmployee(@RequestBody Employee employee) {
        try {
            Employee result = employeeService.add(employee);
            return new ResponseEntity< Object >(result, HttpStatus.OK);
        } catch (Exception ex) {
            LOG.error("Error while updating  employee" + ex.getMessage());
            return new ResponseEntity< Object >(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

  }


    /**
     * Delete employee response entity.
     *
     * @param id    the id
     * @param pmlId the pml id
     * @return the response entity
     */
    @RequestMapping(value = "/employee/remove/{id}/{pmlId}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity< Object > deleteEmployee(@PathVariable("id") long id, @PathVariable("pmlId") long pmlId) {
        try {
            return new ResponseEntity<>(employeeService.delete(id, pmlId), HttpStatus.OK);
        } catch (Exception ex) {
            LOG.error("Error while removing  employee" + ex.getMessage());
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * Search response entity.
     *
     * @param employeeSearchParamsDTO the employee search params dto
     * @param pageable                the pageable
     * @return the response entity
     */
    @RequestMapping(value = "/employees/search", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Page< Employee >> search(@RequestBody EmployeeSearchParamsDTO employeeSearchParamsDTO, Pageable pageable) {
        Page< Employee > searchResult = employeeService.search(employeeSearchParamsDTO, pageable);
        return new ResponseEntity<>(searchResult, HttpStatus.OK);
    }

    
    /**
     * Gets employee statuses.
     *
     * @return the employee statuses
     */
    @RequestMapping(value = "/employees/statuses", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< List< String > > getEmployeeStatuses() {
        List< String > statuses = employeeService.getStatuses();
        return new ResponseEntity<>(statuses, HttpStatus.OK);
    }

    /**
     * Gets nationality percentages.
     *
     * @return the nationality percentages
     */
    @RequestMapping(value = "/employees/nationality/percentages/{status}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< List< EmployeeNationalityPercentageDTO > > getNationalityPercentages(@PathVariable String status) {
        List< EmployeeNationalityPercentageDTO > employeeNationalityPercentages = employeeService.calculateEmployeeNationalitiesPercentage(status);
        return new ResponseEntity<>(employeeNationalityPercentages, HttpStatus.OK);
    }

    /**
     * Gets by salary bracket.
     *
     * @return the by salary bracket
     */
    @RequestMapping(value = "/employees/by-salary-bracket", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< List< Object[] > > getBySalaryBracket() {
        List< Object[] > employeesBySalaryBracket = benefitService.getNumberOfEmployeesPerSalaryBracket();
        return new ResponseEntity<>(employeesBySalaryBracket, HttpStatus.OK);
    }


    /**
     * Gets by salary increment history.
     *
     * @param salaryIncrementHistoryRequest the salary increment history request
     * @return the by salary increment history
     */
    @RequestMapping(value = "/employees/salary-increment/history", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity< Object > getBySalaryIncrementHistory(@RequestBody SalaryIncrementHistoryRequestDTO salaryIncrementHistoryRequest) {
        try {
            EmployeeSearchParamsDTO searchParams = populateSearchParams(salaryIncrementHistoryRequest);
            List< Employee > searchResult = employeeService.search(searchParams);
            SalaryIncrementHistoryHighchartDTO result = benefitService.getSalaryIncrementHistoryData(searchResult.stream()
                    .map(employee -> employee.getEmployeeIdentity().getId())
                    .collect(Collectors.toList()));
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            LOG.warn("Error occurred while calculating salary element history");
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NO_CONTENT);
        }
    }

    private EmployeeSearchParamsDTO populateSearchParams(@RequestBody SalaryIncrementHistoryRequestDTO salaryIncrementHistoryRequest) {
        EmployeeSearchParamsDTO searchParams = new EmployeeSearchParamsDTO();
        if(salaryIncrementHistoryRequest.getEmpNo() != null){
            searchParams.setEmpNoFrom(salaryIncrementHistoryRequest.getEmpNo());
            searchParams.setEmpNoTo(salaryIncrementHistoryRequest.getEmpNo());
        }
        if(salaryIncrementHistoryRequest.getProfession() != null){
            searchParams.setProfessions(Arrays.asList(salaryIncrementHistoryRequest.getProfession()));
        }
        if(salaryIncrementHistoryRequest.getPosition() != null){
            searchParams.setEmployeeTypes(Arrays.asList(salaryIncrementHistoryRequest.getPosition()));
        }
        return searchParams;
    }

    /**
     * Gets by salary bracket total.
     *
     * @return the by salary bracket
     */
    @RequestMapping(value = "/employees/by-salary-total", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< List< Object[] > > getBySalaryTotal() {
        List< Object[] > employeesBySalaryTotal = benefitService.getNumberOfEmployeesPerSalaryTotal();
        return new ResponseEntity<>(employeesBySalaryTotal, HttpStatus.OK);
    }

}
	
	
