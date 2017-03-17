package com.zhangbo.mavendemo.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IAnimal animal = (IAnimal) context.getBean("cat");
		
		animal.makeSound();
	}

}
