package com.quicksand.core;

public interface IBaseService<T,PK> {
	public int insert(T entity);
	public int update(T entity);
	public int delete(PK id);
	public T findById(PK id);
	public long findCount();
}
