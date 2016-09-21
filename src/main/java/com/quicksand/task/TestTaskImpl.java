package com.quicksand.task;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service("testTaskImpl")
public class TestTaskImpl implements TestTask {

	public void mothed1() {
		// TODO Auto-generated method stub
		System.out.println("定时执行 当前时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}

}
