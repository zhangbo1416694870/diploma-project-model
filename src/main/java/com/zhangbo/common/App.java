package com.zhangbo.common;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("Spring-beanTest1.xml");
	/*/	FileNameGenerator fileNameGenerator = (FileNameGenerator) context
				.getBean("FileNameGenerator");
		fileNameGenerator.printName();
	*/	
		Customer customer = (Customer)context.getBean("Customer");
		System.out.println(customer.toString());
	
	}

}
