package com.quicksand.dao;

import java.io.Serializable;

import org.apache.ibatis.annotations.SelectProvider;

import com.quicksand.sqlprovider.BaseSqlProvider;

public interface BaseRepository<T,pk extends Serializable> {
	@SelectProvider(type=BaseSqlProvider.class,method="save")
	public void save(T entity);
}
