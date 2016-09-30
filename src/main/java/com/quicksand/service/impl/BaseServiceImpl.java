package com.quicksand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.quicksand.dao.BaseRepository;
import com.quicksand.service.BaseService;

public class BaseServiceImpl<T,PK> implements BaseService<T,PK> {

	@Autowired
	protected BaseRepository<T, PK> repository; 
	
	public int save(T entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	public int update(T entity) {
		// TODO Auto-generated method stub
		return repository.update(entity);
	}

	public int delete(PK id) {
		// TODO Auto-generated method stub
		return repository.delete(id);
	}

	public T findById(PK id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public long findCount() {
		// TODO Auto-generated method stub
		return repository.findCount();
	}

}
