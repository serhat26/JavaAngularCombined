package com.zenith.hrportal.service.document;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.document.HrDocumentRequest;

/**
 * The interface Hr document request service.
 */
public interface HrDocumentRequestService {


    /**
     * Save hr document request.
     *
     * @param hrDocumentRequest the hr document request
     * @return the hr document request
     */
    HrDocumentRequest save(HrDocumentRequest hrDocumentRequest);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<HrDocumentRequest> getAll();

    /**
     * Get hr document request.
     *
     * @param id the id
     * @return the hr document request
     */
    HrDocumentRequest get(long id);

    /**
     * Gets rejected document requests.
     *
     * @param pageable the pageable
     * @return the rejected document requests
     */
    Page<HrDocumentRequest> getRejectedDocumentRequests(Pageable pageable);

    /**
     * Approve hr document request.
     *
     * @param hrDocumentRequest the hr document request
     * @return the hr document request
     */
    HrDocumentRequest approve(HrDocumentRequest hrDocumentRequest);

    /**
     * Reject hr document request.
     *
     * @param hrDocumentRequest the hr document request
     * @return the hr document request
     */
    HrDocumentRequest reject(HrDocumentRequest hrDocumentRequest);

    /**
     * Gets by employee.
     *
     * @param employee the employee
     * @return the by employee
     */
    List<HrDocumentRequest> getByEmployee(Employee employee);

    /**
     * Gets pending document requests.
     *
     * @param pageRequest the page request
     * @return the pending document requests
     */
    Page<HrDocumentRequest> getPendingDocumentRequests(Pageable pageRequest);

    /**
     * Gets approved document requests.
     *
     * @param pageRequest the page request
     * @return the approved document requests
     */
    Page<HrDocumentRequest> getApprovedDocumentRequests(Pageable pageRequest);

    /**
     * Gets last created.
     *
     * @return the last created
     */
    HrDocumentRequest getLastCreated();

}
