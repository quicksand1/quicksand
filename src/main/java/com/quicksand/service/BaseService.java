package com.quicksand.service;

public interface BaseService<T,PK> {
	public int save(T entity);
	public int update(T entity);
	public int delete(PK id);
	public T findById(PK id);
	public long findCount();
}
