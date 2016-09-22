<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>Java API for WebSocket (JSR-356)</title>  
</head>
<body>
<script type="text/javascript" src="http://localhost:8080/quicksand/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="http://localhost:8080/quicksand/js/sockjs-1.0.3.js"></script>
<script type="text/javascript">
	var websocket = null;
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/quicksand/websocket/socketServer.do");
	} 
	else if ('MozWebSocket' in window) {
		websocket = new MozWebSocket("ws://localhost:8080/quicksand/websocket/socketServer.do");
	} 
	else {
		websocket = new SockJS("http://localhost:8080/quicksand/sockjs/socketServer.do");
	}
	websocket.onopen = onOpen;
	websocket.onmessage = onMessage;
	websocket.onerror = onError;
	websocket.onclose = onClose;
	      	
	function onOpen(openEvt) {
		//alert(openEvt.Data);
	}
	
	function onMessage(evt) {
		alert(evt.data);
	}
	function onError() {}
	function onClose() {}
	
	function doSend() {
		if (websocket.readyState == websocket.OPEN) {  		
            var msg = document.getElementById("inputMsg").value;  
            websocket.send(msg);//调用后台handleTextMessage方法
            alert("发送成功!");  
        } else {  
        	alert("连接失败!");  
        }  
	}
	
	window.close=function () {
		websocket.onclose();
		alert("关闭页面");
	}
</script>
请输入：<textarea rows="5" cols="10" id="inputMsg" name="inputMsg"></textarea>
<button onclick="doSend();">发送</button>
</body>
</html>