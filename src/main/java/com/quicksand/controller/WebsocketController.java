package com.quicksand.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;

import com.quicksand.websocket.SpringWebSocketHandler;

@Controller
public class WebsocketController {
	@Bean//这个注解会从Spring容器拿出Bean
	public SpringWebSocketHandler infoHandler() {
		return new SpringWebSocketHandler();
	}
	
	@RequestMapping("/websocket/login")
	public void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		System.out.println(username+"登录");
		HttpSession session = request.getSession(false);
		session.setAttribute("SESSION_USERNAME", username);
		response.sendRedirect("/quicksand/admin/socket.jsp");
	}

	@RequestMapping("/websocket/send")
	@ResponseBody
	public String send(HttpServletRequest request) {
		
		String username = request.getParameter("username");
		System.out.println(username);
		infoHandler().sendMessageToUser(username, new TextMessage("你好，测试！！！！"));
		System.out.println("已发送");
		return null;
	}
}
