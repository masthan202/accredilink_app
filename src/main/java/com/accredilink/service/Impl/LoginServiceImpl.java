package com.accredilink.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accredilink.dao.LoginDao;
import com.accredilink.dto.LoginDto;
import com.accredilink.exceptions.BackGroundVerificationException;
import com.accredilink.service.LoginService;

/**
 * service class
 * 
 * @author Masthan
 *
 */

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	/**
	 * service class method for login
	 */
    @Override
	public LoginDto login(LoginDto loginDto) throws BackGroundVerificationException {

		LoginDto dto = new LoginDto();
		dto = loginDao.login(loginDto);
		return dto;
	}

}
