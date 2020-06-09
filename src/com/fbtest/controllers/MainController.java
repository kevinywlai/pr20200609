package com.fbtest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fbtest.dao.AccountDaoImpl;
import com.fbtest.models.Account;

@Controller
public class MainController {
	
	@Autowired
	AccountDaoImpl accountDaoImpl;
	
	@RequestMapping("/")
	public String goMain(Model model) {
//		Account account = new Account();
//		account.setUid("test_uid_1");
//		account = accountDaoImpl.findAccountByUid(account);
//		System.out.println(account.toString());
		
		model.addAttribute("account", new Account());
		return "main1";
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String postMain( @ModelAttribute("account") @Valid Account account,BindingResult result,Model model) {
		//System.out.println(account.toString());
		if(result.hasErrors()) { 
			model.addAttribute("emailerror", "Same email using model.addAttribute");
	        return "main1"; 
	    }
		return "main2";
	}
}
