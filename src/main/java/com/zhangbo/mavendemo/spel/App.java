package com.zhangbo.mavendemo.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring-spel.xml");
		Customer customer = (Customer) context.getBean("Customer");
		System.out.println(customer.toString());
	}
}
