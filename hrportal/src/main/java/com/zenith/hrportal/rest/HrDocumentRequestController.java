package com.zenith.hrportal.rest;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.zenith.hrportal.dto.document.HrDocumentRequestWsDTO;
import com.zenith.hrportal.populators.impl.HrDocumentRequestModelPopulator;
import com.zenith.hrportal.populators.impl.HrDocumentRequestWsDtoPopulator;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.document.HrDocumentRequest;
import com.zenith.hrportal.enums.DocumentType;
import com.zenith.hrportal.factories.PDFGeneratorFactory;
import com.zenith.hrportal.service.employee.EmployeeService;
import com.zenith.hrportal.service.document.HrDocumentRequestService;

/**
 * The type Hr document request controller.
 */
@Controller
@RequestMapping(value = "/api")
public class HrDocumentRequestController {

	private Logger LOG = LoggerFactory.getLogger(HrDocumentRequestController.class);
	
	@Autowired
	private HrDocumentRequestService hrDocumentRequestService;
	
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private HrDocumentRequestModelPopulator hrDocumentRequestModelPopulator;

	@Autowired
	private HrDocumentRequestWsDtoPopulator hrDocumentRequestWsDTOPopulator;

	/**
	 * Save document request response entity.
	 *
	 * @param hrDocumentRequestWsDto the hr document request ws dto
	 * @return the response entity
	 */
	@RequestMapping(value = "/document-request/add",method = RequestMethod.POST)
	  @ResponseBody
	  public ResponseEntity<Object> saveDocumentRequest(@RequestBody HrDocumentRequestWsDTO hrDocumentRequestWsDto) {
		  try {
			  HrDocumentRequest documentRequestModel = new HrDocumentRequest();
			  this.hrDocumentRequestModelPopulator.populate(hrDocumentRequestWsDto,documentRequestModel);
			  HrDocumentRequest result =  hrDocumentRequestService.save(documentRequestModel);
			  return new ResponseEntity<Object>(result, HttpStatus.CREATED);
		  }catch(Exception ex) {
			  LOG.error("Error while saving  Document request"+ex.getMessage());
			  return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	  }

	/**
	 * Approve document response entity.
	 *
	 * @param hrDocumentRequest the hr document request
	 * @return the response entity
	 */
	@RequestMapping(value = "/document-request/approve",method = RequestMethod.POST)
	  @ResponseBody
	  public ResponseEntity<HrDocumentRequest> approveDocument(@RequestBody HrDocumentRequestWsDTO hrDocumentRequest) {
		 HrDocumentRequest docRequest = hrDocumentRequestService.get(hrDocumentRequest.getId());
		 HrDocumentRequest approvedDoc = hrDocumentRequestService.approve(docRequest);
		 return new ResponseEntity<HrDocumentRequest>(approvedDoc, HttpStatus.OK);
	  }

	/**
	 * Reject document response entity.
	 *
	 * @param hrDocumentRequest the hr document request
	 * @return the response entity
	 */
	@RequestMapping(value = "/document-request/reject",method = RequestMethod.POST)
	  @ResponseBody
	  public ResponseEntity<HrDocumentRequest> rejectDocument(@RequestBody HrDocumentRequest hrDocumentRequest) {
		 HrDocumentRequest rejectedDocument = hrDocumentRequestService.reject(hrDocumentRequest);
		 return new ResponseEntity<HrDocumentRequest>(rejectedDocument, HttpStatus.OK);
	  }


	/**
	 * Gets all document requests.
	 *
	 * @return the all document requests
	 */
	@RequestMapping(value = "/document-request/all",method = RequestMethod.GET)
	  @ResponseBody
	  public List<HrDocumentRequest> getAllDocumentRequests() {
			 List<HrDocumentRequest> documentRequests = hrDocumentRequestService.getAll();
			 return documentRequests;  
	  }

	/**
	 * Gets unapproved document requests.
	 *
	 * @param page the page
	 * @param size the size
	 * @return the unapproved document requests
	 */
	@RequestMapping(value = "/document-request/rejected",method = RequestMethod.GET)
	  @ResponseBody
	  public Page<HrDocumentRequestWsDTO> getUnapprovedDocumentRequests(@RequestParam(name = "page", defaultValue = "0") int page,
	            @RequestParam(name = "size", defaultValue = "4") int size) {
	 	  Pageable pageRequest = PageRequest.of(page, size);
		  Page<HrDocumentRequest> documentRequests = hrDocumentRequestService.getRejectedDocumentRequests(pageRequest);
		  Page<HrDocumentRequestWsDTO> dtos  = documentRequests.map(this::convertToObjectDto);
		  return dtos;

	  }

	/**
	 * Gets approved document requests.
	 *
	 * @param page the page
	 * @param size the size
	 * @return the approved document requests
	 */
	@RequestMapping(value = "/document-request/approved",method = RequestMethod.GET)
	@ResponseBody
	public Page<HrDocumentRequestWsDTO> getApprovedDocumentRequests(@RequestParam(name = "page", defaultValue = "0") int page,
																	  @RequestParam(name = "size", defaultValue = "4") int size) {
		Pageable pageRequest = PageRequest.of(page, size);
		Page<HrDocumentRequest> documentRequests = hrDocumentRequestService.getApprovedDocumentRequests(pageRequest);
		Page<HrDocumentRequestWsDTO> dtos  = documentRequests.map(this::convertToObjectDto);
		return dtos;

	}

	/**
	 * Gets pending document requests.
	 *
	 * @param page the page
	 * @param size the size
	 * @return the pending document requests
	 */
	@RequestMapping(value = "/document-request/pending",method = RequestMethod.GET)
	@ResponseBody
	public Page<HrDocumentRequestWsDTO> getPendingDocumentRequests(@RequestParam(name = "page", defaultValue = "0") int page,
																	  @RequestParam(name = "size", defaultValue = "4") int size) {
		Pageable pageRequest = PageRequest.of(page, size);
		Page<HrDocumentRequest> documentRequests = hrDocumentRequestService.getPendingDocumentRequests(pageRequest);
		Page<HrDocumentRequestWsDTO> dtos  = documentRequests.map(this::convertToObjectDto);
		return dtos;

	}

	private HrDocumentRequestWsDTO convertToObjectDto(HrDocumentRequest hrDocumentRequest) {
		HrDocumentRequestWsDTO dto = new HrDocumentRequestWsDTO();
		hrDocumentRequestWsDTOPopulator.populate(hrDocumentRequest,dto);
		return dto;
	}

	/**
	 * Gets by emp no.
	 *
	 * @param empNo the emp no
	 * @return the by emp no
	 */
	@RequestMapping(value = "/document-request/employee/{empNo}",method = RequestMethod.GET)
	  @ResponseBody
	  public List<HrDocumentRequestWsDTO> getByEmpNo(@PathVariable("empNo") long empNo) {
		  Employee employee = employeeService.getByEmpNo(empNo);
		  List<HrDocumentRequestWsDTO> result = new ArrayList<>();
		  if(employee != null) {
			  List<HrDocumentRequest> documents = hrDocumentRequestService.getByEmployee(employee);
			  documents.stream().forEach(hrDocumentRequest -> {
				  HrDocumentRequestWsDTO hrDocumentRequestWsDTO = new HrDocumentRequestWsDTO();
				  hrDocumentRequestWsDTOPopulator.populate(hrDocumentRequest,hrDocumentRequestWsDTO);
				  result.add(hrDocumentRequestWsDTO);
			  });
			  return result;
		  }
		  LOG.warn("No employee found with empno :"+empNo);
		  return Collections.emptyList();
	  }

	/**
	 * Gets salary account.
	 *
	 * @param docID    the doc id
	 * @param response the response
	 * @return the salary account
	 * @throws Docx4JException the docx 4 j exception
	 * @throws IOException     the io exception
	 */
	@RequestMapping(value = "/document-request/download/{docId}" ,method = RequestMethod.GET)
	 @ResponseStatus(HttpStatus.OK)
	 public  ResponseEntity<InputStreamResource>  getSalaryAccount(@PathVariable("docId") long docID,HttpServletResponse response) throws Docx4JException, java.io.IOException {
		 Employee employee = employeeService.getByEmpNo(docID);
		 HrDocumentRequest document = hrDocumentRequestService.get(docID);
		 if(document != null) {
			 ByteArrayInputStream bis = null;
			 bis = PDFGeneratorFactory.getGenerator(DocumentType.SALARY_CERTIFICATE).generate(document);
			 HttpHeaders httpHeaders = new HttpHeaders();
		     httpHeaders.add("Content-Disposition", "inline; filename=SALARY_CERT"+employee.getEmpNo()+"pdf");
		     return ResponseEntity.ok().headers(httpHeaders).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));

		 }
		 return new ResponseEntity<InputStreamResource>(HttpStatus.NO_CONTENT);
	 }

	/**
	 * Generate document number long.
	 *
	 * @return the long
	 */
	@RequestMapping(value = "/document-request/generate-document-number",method = RequestMethod.GET)
	@ResponseBody
	public Long generateDocumentNumber() {
		HrDocumentRequest docRequest = hrDocumentRequestService.getLastCreated();
		return docRequest.getId() + 1;
	}
}
