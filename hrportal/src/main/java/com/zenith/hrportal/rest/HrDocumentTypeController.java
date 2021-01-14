package com.zenith.hrportal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zenith.hrportal.entities.document.HrDocumentType;
import com.zenith.hrportal.service.document.HrDocumentTypeService;

/**
 * The type Hr document type controller.
 */
@Controller
@RequestMapping(value = "/api")
public class HrDocumentTypeController {
	
	@Autowired
	private HrDocumentTypeService hrDocumentTypeService;

	/**
	 * Get documents types list.
	 *
	 * @return the list
	 */
	@GetMapping(value = "/document-types")
	  @ResponseBody
	  public List<HrDocumentType> getDocumentsTypes(){
		 List<HrDocumentType>  types = hrDocumentTypeService.getDocumentTypes();
		  return types;
	  }


	/**
	 * Gets document type.
	 *
	 * @param id the id
	 * @return the document type
	 */
	@RequestMapping(value = "/document-types/{id}",method = RequestMethod.GET)
	  @ResponseBody
	  public ResponseEntity<HrDocumentType> getDocumentType(@PathVariable("id") long id) {
		  HrDocumentType documentType = hrDocumentTypeService.getDocumentType(id);
		  if(documentType != null) {
			  return new ResponseEntity<>(documentType, HttpStatus.OK);
		  }
		  return new ResponseEntity<HrDocumentType>(HttpStatus.NO_CONTENT);
	  }
	 

}
