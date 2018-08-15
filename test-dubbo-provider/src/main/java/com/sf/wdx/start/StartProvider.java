package com.sf.wdx.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProvider {

	public static void main(String[] args) throws Exception {
		// 加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
		// 不停止线程，当键盘输入时停止
		System.in.read();
	}
	
}
