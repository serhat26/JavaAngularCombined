package com.zenith.hrportal.factories;

import com.zenith.hrportal.enums.DocumentType;
import com.zenith.hrportal.service.document.HrPDFGenerator;
import com.zenith.hrportal.service.document.impl.SalaryCertificationPDFGenerator;

public class PDFGeneratorFactory {
	
	private PDFGeneratorFactory() {
		
	}

	
	public static HrPDFGenerator getGenerator(DocumentType documentType) {
		switch (documentType) {
		case SALARY_CERTIFICATE:
			return new SalaryCertificationPDFGenerator();

		default:
			return null;
		}
	}

}
