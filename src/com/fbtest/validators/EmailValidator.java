package com.fbtest.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.fbtest.dao.AccountDaoImpl;
import com.fbtest.models.Account;


public class EmailValidator implements ConstraintValidator<UserEmail, Account>{	
	
	@Autowired
	AccountDaoImpl accountDaoImpl;
	
	@Override
	public boolean isValid(Account arg0, ConstraintValidatorContext arg1) {
		if(StringUtils.isEmpty(arg0.getUid())) {
			return true;
		}
		Account account = accountDaoImpl.findAccountByUid(arg0);
		
		System.out.println("tested uid:" + arg0.getUid());
		System.out.println("tested email:" + arg0.getEmail());
		System.out.println("DB uid:" + account.getUid());
		System.out.println("DB email:" + account.getEmail());
		
		boolean result = !(arg0.getEmail().equals(account.getEmail()));
		
		System.out.println("result:" + result);
		
		return result;
	}

}
