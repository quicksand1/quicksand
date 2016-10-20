package com.quicksand.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.Update;

public interface BaseRepository<T, PK> {
//	@Insert("MapperGD.find.entityById")
//	public int save(T entity);
//
//	@Insert("MapperGD.insert.entity")
//	public int insert(T t);
//
//	@Update("MapperGD.update.entity")
//	public int update(T entity);
//
//	@Delete("MapperGD.delete.id")
//	public int delete(PK id);
//	
//	@Select("MapperGD.find.findById")
//	public T findById(PK id);
//	
//	@Select("MapperGD.find.findById")
//	public long findCount();
//
//	@Select("MapperGD.find.entitys")
//	public List<T> findEntity(Object... obj);
//
//	@Select("MapperGD.find.ListByLike")
//	public List<T> findLikeEntity(Object... obj);
//
//	@Delete("MapperGD.delete.condition")
//	public void deleteByCondition(Object param);

	// @Select("MapperGD.find.entity.queryByVo")
	// public PageMyBatis<T> queryByVo(int i,int c,Object... obj);

	// @Select("MapperGD.find.entity.queryByVoLike")
	// public PageMyBatis<T> LikequeryByVo(int i,int c,Object... obj);
	public int insert(T entity);
	public int insertSelective(T entity);
	public int update(T entity);
	public int updateSelective(T entity);
	public int delete(PK pk);
	public T findById(PK pk);
	public long findCount();
}
