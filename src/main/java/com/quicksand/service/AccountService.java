package com.quicksand.service;

import java.util.List;

import com.quicksand.core.IBaseService;
import com.quicksand.entity.SysAccount;

public interface AccountService extends IBaseService<SysAccount, Long> {
//	public int insert(SysAccount entity);
	public int insertBatch(List<SysAccount> list);
}
