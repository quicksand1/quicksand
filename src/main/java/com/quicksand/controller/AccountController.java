package com.quicksand.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quicksand.entity.Account;
import com.quicksand.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/account/{id}/add")
	@ResponseBody
	public int add(Integer id)
	{
		System.out.println("/account/add");
		Account account=new Account();
		account.setLoginName("001");
		account.setLoginPwd("123456");
		account.setCreateTime(new Date());
		account.setCreateUser("system");
		return accountService.save(account);
	}
}
