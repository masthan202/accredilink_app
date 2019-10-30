package com.accredilink.service;

import java.util.List;

import com.accredilink.dto.EmployeeDocumentDTO;
import com.accredilink.exceptions.BackGroundVerificationException;

public interface BgvService {
	List<EmployeeDocumentDTO> getById(int id) throws BackGroundVerificationException;

	List<EmployeeDocumentDTO> getByName(String name) throws BackGroundVerificationException;

	EmployeeDocumentDTO getDocument(int id) throws BackGroundVerificationException;

	void approveStatus(int id) throws BackGroundVerificationException;

	void rejectStatus(int id) throws BackGroundVerificationException;

}
