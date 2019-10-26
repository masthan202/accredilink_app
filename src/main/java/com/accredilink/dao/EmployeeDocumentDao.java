package com.accredilink.dao;

import java.util.List;

import com.accredilink.dto.EmployeeDocumentDTO;
import com.accredilink.exceptions.BackGroundVerificationException;

public interface EmployeeDocumentDao {

	String uploadDocument(EmployeeDocumentDTO employeeDocumentDTO) throws BackGroundVerificationException;

	List<String> viewStatus(int empId);

}
