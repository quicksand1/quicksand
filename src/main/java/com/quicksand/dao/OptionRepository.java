package com.quicksand.dao;

import org.springframework.stereotype.Repository;

import com.quicksand.entity.Option;

@Repository
public interface OptionRepository {
	public void save(Option entity);
}
