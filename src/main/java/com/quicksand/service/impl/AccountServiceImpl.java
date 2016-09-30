package com.quicksand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicksand.dao.AccountRepository;
import com.quicksand.entity.Account;
import com.quicksand.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;

	public int save(Account entity) {
		// TODO Auto-generated method stub
		accountRepository.save(entity);
		return 1;
	}
}
