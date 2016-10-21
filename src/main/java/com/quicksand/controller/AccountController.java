package com.quicksand.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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
		List<SysAccount> list=new ArrayList<SysAccount>();
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 10000; j++) {
				account.setLoginName(i+"-"+"-YG"+j);
				list.add(account);
			}
			accountService.insertBatch(list);
			list.clear();
		}
		accountService.findById(new Long(3));
		SysPerson person=new SysPerson();
		person.setName("hehe1");
		person.setSex(false);
		person.setAddress("北京");
		person= personService.findById(new Long(1112));
		return person.getName();
	}
}
