package com.quicksand.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/redhatController")
public class HedhatController {
	/**
	 * 小红帽列表
	 * @param request
	 * @return
	 */
	@RequestMapping(params="redhatList")
	public ModelAndView redhatList(HttpServletRequest request) {
		System.out.println("redhatList");
		return new ModelAndView("socket");
	}
	
	@RequestMapping(params="login")
	public ModelAndView login(HttpServletRequest request) {
		System.out.println("login");
		return new ModelAndView("login");
	}
}
