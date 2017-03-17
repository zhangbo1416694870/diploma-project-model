package com.zhangbo.mavendemo.loosely_coupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context ;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring-common.xml");
		
		OutputHelper outputHelper = (OutputHelper) context.getBean("OutputHelper");
		
		outputHelper.generateOutput();
	}
}
