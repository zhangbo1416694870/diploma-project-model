package com.zhangbo.customer.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("Spring-customer.xml");
		CustomerService customerService = (CustomerService) context
				.getBean("CustomerService");
		customerService.setMessage("this is a");
		System.out.println(customerService.getMessage());
		
		CustomerService customerServiceb = (CustomerService) context
				.getBean("CustomerService");
		//customerServiceb.setMessage("this is b");
		System.out.println(customerServiceb.getMessage());
		
	}

}
