package com.accredilink.dao;

public interface LoginDao {
	LoginDto login(LoginDto loginDto) throws BackgroundVerificationException;
}
