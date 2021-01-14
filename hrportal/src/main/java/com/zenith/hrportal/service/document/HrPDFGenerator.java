package com.zenith.hrportal.service.document;

import java.io.ByteArrayInputStream;

import com.zenith.hrportal.entities.document.HrDocumentRequest;

/**
 * The interface Hr pdf generator.
 */
public interface HrPDFGenerator {

    /**
     * Generate byte array input stream.
     *
     * @param document the document
     * @return the byte array input stream
     */
    ByteArrayInputStream generate(HrDocumentRequest document);

}
