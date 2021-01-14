package com.zenith.hrportal.service.document.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zenith.hrportal.entities.employee.Employee;
import com.zenith.hrportal.entities.document.HrDocumentRequest;
import com.zenith.hrportal.repository.HrDocumentRequestRepository;
import com.zenith.hrportal.service.document.HrDocumentRequestService;

/**
 * The type Default hr document request service.
 */
@Service
public class DefaultHrDocumentRequestService implements HrDocumentRequestService{

	@Autowired
	private HrDocumentRequestRepository hrDocumentRequestRepository;
	
	
	@Override
	public HrDocumentRequest save(HrDocumentRequest hrDocumentRequest) {
		return hrDocumentRequestRepository.save(hrDocumentRequest);	
	}
	
	@Override
	public List<HrDocumentRequest> getAll() {
		return (List<HrDocumentRequest>) hrDocumentRequestRepository.findAll();
	}


	@Override
	public HrDocumentRequest get(long id) {
		Optional<HrDocumentRequest> docReqOp = hrDocumentRequestRepository.findById(id);
		return docReqOp.isPresent() ? docReqOp.get() : null;
	}
	
	@Override
	public Page<HrDocumentRequest> getRejectedDocumentRequests(Pageable pageable) {
		return hrDocumentRequestRepository.findByRejectedTrue(pageable);
	}

	@Override
	public Page<HrDocumentRequest> getApprovedDocumentRequests(Pageable pageRequest) {
		return hrDocumentRequestRepository.findByApprovedTrue(pageRequest);
	}

	@Override
	public Page<HrDocumentRequest> getPendingDocumentRequests(Pageable pageRequest) {
		return hrDocumentRequestRepository.findByApprovedFalseAndRejectedFalse(pageRequest);
	}

    /**
     * Sets hr document request repository.
     *
     * @param hrDocumentRequestRepository the hr document request repository
     */
    public void setHrDocumentRequestRepository(HrDocumentRequestRepository hrDocumentRequestRepository) {
		this.hrDocumentRequestRepository = hrDocumentRequestRepository;
	}
	
	@Override
	public HrDocumentRequest approve(HrDocumentRequest hrDocumentRequest) {
		hrDocumentRequest.setApproved(Boolean.TRUE);
		return hrDocumentRequestRepository.save(hrDocumentRequest);
	}
	
	@Override
	public List<HrDocumentRequest> getByEmployee(Employee employee) {
		List<HrDocumentRequest>  documentRequests = new ArrayList<HrDocumentRequest>();
		documentRequests.addAll(hrDocumentRequestRepository.findByEmployee(employee));
		return documentRequests.stream().filter(documentReq -> BooleanUtils.isTrue(documentReq.getApproved())).collect(Collectors.toList());
	}
	
	@Override
	public HrDocumentRequest reject(HrDocumentRequest hrDocumentRequest) {
		hrDocumentRequest.setRejected(Boolean.TRUE);
		return hrDocumentRequestRepository.save(hrDocumentRequest);
	}

	@Override
	public HrDocumentRequest getLastCreated() {
		return hrDocumentRequestRepository.findTopByOrderByIdDesc();
	}
}
