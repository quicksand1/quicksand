package com.quicksand.dao;

import org.springframework.stereotype.Repository;

import com.quicksand.entity.SysOption;

@Repository
public interface OptionRepository {
	public void save(SysOption entity);
}
