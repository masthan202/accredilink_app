package com.accredilink.dao;

import java.util.List;

public interface BgvDao {
	List<EmployeeDocumentDTO> getById(int id) throws BackgroundVerificationException;

	List<EmployeeDocumentDTO> getByName(String name) throws BackgroundVerificationException;

	EmployeeDocumentDTO findById(int id) throws BackgroundVerificationException;

	void approveStatus(int id) throws BackgroundVerificationException;

	void rejectStatus(int id) throws BackgroundVerificationException;
}
