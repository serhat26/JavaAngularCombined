package com.zenith.hrportal.service.document.impl;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itextpdf.io.source.ByteArrayOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.document.HrDocumentRequest;
import com.zenith.hrportal.service.document.HrPDFGenerator;
import com.zenith.hrportal.utils.DateUtils;

/**
 * The type Salary certification pdf generator.
 */
@Service
public class SalaryCertificationPDFGenerator implements HrPDFGenerator {

	private static Logger LOG = LoggerFactory.getLogger(SalaryCertificationPDFGenerator.class);
	@Override
	public ByteArrayInputStream generate(HrDocumentRequest documentRequest) {
		Employee employee = documentRequest.getEmployee();
		Document document = new Document();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
			PdfWriter.getInstance(document,bos);
				document.open();
		        generateContent(employee, document);
		        document.close();
		} catch (DocumentException e) {
			LOG.error("error generating salary ceritification pdf"+e.getMessage());
		}
       
        return new ByteArrayInputStream(bos.toByteArray());
	}
	
	private void generateContent(Employee employee,Document document) throws DocumentException {
        Font bold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

        Chunk glue = new Chunk(new VerticalPositionMark());
        Paragraph header = new Paragraph("Ref. CHV/HRD/000847");
        header.add(new Chunk(glue));
        header.add(getCurrentDate());
        document.add(header);


        document.add( Chunk.NEWLINE);
        document.add( Chunk.NEWLINE);
        document.add( Chunk.NEWLINE);

        Paragraph to = new Paragraph("To :");
        to.add( Chunk.NEWLINE);
        to.add( new Chunk("EMIRATES NBD",bold));
        to.add( Chunk.NEWLINE);
        to.add( new Chunk("Dubai - UAE",bold));
        document.add(to);

        Paragraph title = new Paragraph("Subject : Salary Account with EMIRATES NBD",bold);
        title.setAlignment(Element.ALIGN_CENTER);
        title.add( Chunk.NEWLINE);
        title.add( Chunk.NEWLINE);
        title.add( Chunk.NEWLINE);
        title.add( Chunk.NEWLINE);

        document.add(title);

        Paragraph body1 = new Paragraph();
        body1.add(new Chunk("This is to certify that "));
        body1.add(new Chunk(employee.getGender()+" "+employee.getName(),bold));
        body1.add(new Chunk(", holder of"));
        body1.add(new Chunk(" INDIA Passport No. R2421606",bold));
        body1.add(new Chunk(", has been employed by this Company in Dubai since "));
        body1.add(new Chunk(DateUtils.format(employee.getDoj()),bold));
        body1.add(new Chunk("  and his current position is "));
        String position = employee.getProfession() != null ? employee.getProfession().getDescription().toUpperCase() : " ";
        body1.add(new Chunk("“"+position+"”. ",bold));
        body1.add(new Chunk("He is drawing a consolidated Gross Salary of "));
        body1.add(new Chunk("AED ",bold));
        body1.add(new Chunk("1100.00 "));
        body1.add(new Chunk("DIRHAMS ONE THOUSAND ONE HUNDRED ONLY ",bold));
        body1.add(new Chunk("per month and his monthly salary is currently being credited to his account "));
        body1.add(new Chunk("with "+employee.getBankName()+" IBAN ",bold));
        body1.add(new Chunk("No. "+employee.getBankAcno(),bold));
        body1.add(Chunk.NEWLINE);
        body1.add(Chunk.NEWLINE);
        document.add(body1);

        Paragraph body2 = new Paragraph();
        body2.add(new Chunk("This certificate is being issued to him at his request without any legal obligation on our part. By issuing this certificate, the Company is not providing any guarantee of any kind whatsoever."));
        body2.add(Chunk.NEWLINE);
        body2.add(Chunk.NEWLINE);
        document.add(body2);

        Paragraph footer = new Paragraph();
        footer.add(new Chunk("AHMED QABBANI",bold));
        footer.add(Chunk.NEWLINE);
        footer.add(new Chunk("Deputy Group HR Manager"));
        document.add(footer);


    }


    private String getCurrentDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        return  strDate;
    }
}
