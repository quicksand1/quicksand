package com.quicksand.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Configuration
@EnableWebMvc //这个标注可以不加，如果有加，要extends WebMvcConfigurerAdapter
@EnableWebSocket
public class SpringWebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addHandler(webSocketHandler(), "/websocket/socketServer.do").addInterceptors(new SpringWebSocketHanderInterceptor());
		registry.addHandler(webSocketHandler(),"/sockjs/socketServer.do").addInterceptors(new SpringWebSocketHanderInterceptor()).withSockJS();
	}
	
	public TextWebSocketHandler webSocketHandler() {
		return new SpringWebSocketHandler();
	}
}
