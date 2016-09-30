package com.quicksand.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.quicksand.entity.Account;

@Repository
public interface AccountRepository {
	@Insert("insert into Account(loginName,loginPwd,state,isAffect,createTime,createUser) values(#{loginName},#{loginPwd},#{state},#{isAffect},#{createTime},#{createUser})")
	public void save(Account entity);
}
