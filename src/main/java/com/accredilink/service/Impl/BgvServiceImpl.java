package com.accredilink.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accredilink.dao.BgvDao;
import com.accredilink.dto.EmployeeDocumentDTO;
import com.accredilink.exceptions.BackGroundVerificationException;
import com.accredilink.service.BgvService;



/**
 * service Class for bgv team service
 * 
 * @author Masthan
 *
 */
@Service
public class BgvServiceImpl implements BgvService {

	@Autowired
	private BgvDao bgvDao;

	/**
	 * view emp by Id
	 */
	@Override
	public List<EmployeeDocumentDTO> getById(int id) throws BackGroundVerificationException {
		return bgvDao.getById(id);

	}

	/**
	 * view emp by name
	 */
	@Override
	public List<EmployeeDocumentDTO> getByName(String name) throws BackGroundVerificationException {
		// TODO Auto-generated method stub
		return bgvDao.getByName(name);
	}

	/**
	 * getting document details
	 */
	public EmployeeDocumentDTO getDocument(int id) throws BackGroundVerificationException {
		return bgvDao.findById(id);
		// .orElseThrow(() -> new MyFileNotFoundException("File not found with id " +
		// fileId));
	}

	/**
	 * setting status to appprove
	 */
	@Override
	public void approveStatus(int id) throws BackGroundVerificationException {
		bgvDao.approveStatus(id);

	}

	/**
	 * setting status to reject
	 */

	@Override
	public void rejectStatus(int id) throws BackGroundVerificationException {
		bgvDao.rejectStatus(id);

	}

}
