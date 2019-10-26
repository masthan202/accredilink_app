package com.accredilink.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.accredilink.dto.EmployeeDocumentDTO;
import com.accredilink.exceptions.BackGroundVerificationException;

public interface EmployeeService {

	void storeDocument(MultipartFile file) throws BackGroundVerificationException;

	String storeFileDetails(EmployeeDocumentDTO employeeDocumentDTO) throws BackGroundVerificationException;

	List<String> viewStatus(int empId);

}
