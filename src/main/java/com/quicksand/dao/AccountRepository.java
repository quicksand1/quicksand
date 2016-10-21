package com.quicksand.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.quicksand.core.IBaseRepository;
import com.quicksand.entity.SysAccount;


@Repository
public interface AccountRepository extends IBaseRepository<SysAccount, Long> {
	public int insertBatch(List<SysAccount> list);
}
