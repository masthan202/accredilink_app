package com.accredilink.dao.DaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.accredilink.dao.LoginDao;

/**
 * Dao class
 * 
 * @author Masthan
 *
 */
@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
	@PersistenceContext

	private EntityManager manager;

	@Override
	/**
	 * dao method for login
	 */
	public LoginDto login(LoginDto loginDto) throws BackgroundVerificationException {

		LoginDto dto = manager.find(LoginDto.class, loginDto.getEmpId());

		boolean flag = false;
		if (dto != null) {
			if (dto.getPassword().equals(loginDto.getPassword())) {
				flag = true;
			} else {
				throw new BackgroundVerificationException(ExceptionMessages.INVALID_PASSWORD);
			}

		} else {
			throw new BackgroundVerificationException(ExceptionMessages.INVALID_EMPID);
		}
		if (flag == true) {

			return dto;
		} else
			return null;
	}

}
