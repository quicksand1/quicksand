package com.quicksand.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quicksand.entity.JswyCoupon;
import com.quicksand.service.JswyCouponService;

@Controller
@RequestMapping("/couponController")
public class JswyCouponController {

	@Autowired
	private JswyCouponService jswyCouponService;
	

	
	@RequestMapping(params="coupon")
	public ModelAndView index(HttpServletRequest request) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-mvc-task.xml");
		System.out.println("任务已启动...");
		String redhat= request.getParameter("redhat");
		System.out.println("进来了 参数："+redhat);
		JswyCoupon coupon=new JswyCoupon();
		coupon.setCouponTemplateId(1);
		coupon.setBigType("1");
		coupon.setBusType("1");
		coupon.setCode("code112");
		coupon.setStationId("111");
		coupon.setStationId("33333");
		coupon.setTheTerm(1);
		coupon.setMoney(20);
		coupon.setMinMoney(60);
		coupon.setStartDate(new Date());
		coupon.setEndDate(new Date());
		coupon.setReceiveTime(new Date());
		coupon.setReceiveUserId("account");
		jswyCouponService.save(coupon);
		request.setAttribute("success", "success");
		return new ModelAndView("coupon");
	}
}
