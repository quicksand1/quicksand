package com.quicksand.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicksand.dao.JswyCouponRepository;
import com.quicksand.entity.JswyCoupon;
import com.quicksand.service.JswyCouponService;

@Service
@Transactional
public class JswyCouponServiceImpl implements JswyCouponService {

	@Autowired
	private JswyCouponRepository jswyCouponRepository;
	
	public void save(JswyCoupon entity) {
		// TODO Auto-generated method stub
		jswyCouponRepository.save(entity);
	}	
}
