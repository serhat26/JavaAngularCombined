package com.zenith.hrportal.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.document.HrDocumentRequest;

/**
 * The interface Hr document request repository.
 */
public interface HrDocumentRequestRepository extends PagingAndSortingRepository<HrDocumentRequest, Long> {

    /**
     * Find by approved false or approved is null page.
     *
     * @param pageRequest the page request
     * @return the page
     */
    public Page<HrDocumentRequest> findByApprovedFalseOrApprovedIsNull(Pageable pageRequest);

    /**
     * Find by approved true page.
     *
     * @param pageRequest the page request
     * @return the page
     */
    public Page<HrDocumentRequest> findByApprovedTrue(Pageable pageRequest);

    /**
     * Find by rejected true page.
     *
     * @param pageRequest the page request
     * @return the page
     */
    public Page<HrDocumentRequest> findByRejectedTrue(Pageable pageRequest);

    /**
     * Find by approved false and rejected false page.
     *
     * @param pageRequest the page request
     * @return the page
     */
    public Page<HrDocumentRequest> findByApprovedFalseAndRejectedFalse(Pageable pageRequest);

    /**
     * Find by employee list.
     *
     * @param employee the employee
     * @return the list
     */
    List<HrDocumentRequest> findByEmployee(Employee employee);

    /**
     * Find top by order by id desc hr document request.
     *
     * @return the hr document request
     */
    HrDocumentRequest findTopByOrderByIdDesc();
		
}
