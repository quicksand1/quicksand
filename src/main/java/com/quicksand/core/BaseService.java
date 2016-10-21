package com.quicksand.core;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T,PK> implements IBaseService<T,PK> {

	@Autowired
	protected IBaseRepository<T, PK> repository; 
	
	public int insert(T entity) {
		// TODO Auto-generated method stub
		return repository.insert(entity);
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
