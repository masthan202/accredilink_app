package com.accredilink.service.Impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.accredilink.dao.EmployeeDocumentDao;
import com.accredilink.dto.EmployeeDocumentDTO;
import com.accredilink.exceptions.BackGroundVerificationException;
import com.accredilink.service.EmployeeService;

/**
 * service class to perform employee method
 * 
 * @author Masthan
 *
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDocumentDao employeeDocumentDao;
	EmployeeDocumentDTO employeeDocumentDTO = new EmployeeDocumentDTO();

	/**
	 * storing file
	 */

	public void storeDocument(MultipartFile file) throws BackGroundVerificationException {

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {

			employeeDocumentDTO.setData(file.getBytes());

		} catch (IOException ex) {
			throw new BackGroundVerificationException("Could not store file " + fileName + ". Please try again!");
		}
	}

	/**
	 * storing file info
	 */

	@Override
	public String storeFileDetails(EmployeeDocumentDTO employeeDocument) throws BackGroundVerificationException {

		employeeDocument.setData(employeeDocumentDTO.getData());
		return employeeDocumentDao.uploadDocument(employeeDocument);

	}

	/**
	 * view status
	 */

	@Override
	public List<String> viewStatus(int empId) {

		return employeeDocumentDao.viewStatus(empId);
	}

}