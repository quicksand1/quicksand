package com.quicksand.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quicksand.core.BaseService;
import com.quicksand.dao.AccountRepository;
import com.quicksand.entity.SysAccount;
import com.quicksand.service.AccountService;

@Service
public class AccountServiceImpl extends BaseService<SysAccount, Long> implements AccountService {

	public int insertBatch(List<SysAccount> list) {
		// TODO Auto-generated method stub
		return ((AccountRepository)repository).insertBatch(list);
	}
//	@Autowired
//	private AccountRepository accountRepository;
//
//	public int insert(SysAccount entity) {
//		// TODO Auto-generated method stub
//		return accountRepository.insert(entity);
//	}
	
}
