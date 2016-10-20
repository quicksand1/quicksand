package com.quicksand.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quicksand.entity.SysAccount;
import com.quicksand.entity.SysPerson;
import com.quicksand.service.AccountService;
import com.quicksand.service.SysPersonService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private SysPersonService personService;
	
	@RequestMapping("/account/{id}/add")
	@ResponseBody
	public String add(Integer id)
	{
		System.out.println("/account/add "+id);
		SysAccount account=new SysAccount();
		account.setLoginName("20161020");
		account.setLoginPwd("123456");
		account.setCreateTime(new Date());
		account.setCreateUser("system");
		account.setIsAffect(true);
		account.setState(0);
		accountService.insert(account);
		accountService.findById(new Long(3));
		
		SysPerson person=new SysPerson();
		
		person.setName("hehe1");
		person.setSex(false);
		person.setAddress("北京");
		person= personService.findById(new Long(1112));
		return person.getName();
	}
}
