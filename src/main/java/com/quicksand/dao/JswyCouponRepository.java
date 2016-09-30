package com.quicksand.dao;


import org.springframework.stereotype.Repository;
import com.quicksand.entity.JswyCoupon;

@Repository
public interface JswyCouponRepository {
	public void save(JswyCoupon entity);
}
