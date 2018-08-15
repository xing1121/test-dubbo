package com.sf.wdx.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sf.wdx.service.TestGetDate;

public class StartConsumer {

	public static void main(String[] args){
		// 加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
		// 调用dubbo服务端注册实例
		TestGetDate biz = (TestGetDate) context.getBean("testGetDate");
		// 调用方法
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("-------------------------调用服务端方法获取到的结果：" + biz.getDate());
		}
	}
	
}
