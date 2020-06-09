package com.fbtest.validators;

import org.springframework.beans.factory.annotation.Autowired;

import com.fbtest.dao.AccountDaoImpl;
import com.fbtest.models.Account;

public class AccountValidator {

	@Autowired
	AccountDaoImpl accountDaoImpl;
	
	public boolean isValidEmail(String email) {
//		Account account = new Account();
//		account.set
//		return email == 
		return false;
	}
}
