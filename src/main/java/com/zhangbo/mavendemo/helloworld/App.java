package com.zhangbo.mavendemo.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	
	public static void main (String[] args){
		
		context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		
		helloWorld.printHelloWorld();
	}
}
