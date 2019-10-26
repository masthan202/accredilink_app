package com.accredilink.service;

import com.accredilink.dto.LoginDto;
import com.accredilink.exceptions.BackGroundVerificationException;

public interface LoginService {
	LoginDto login(LoginDto loginDto) throws BackGroundVerificationException;
}
