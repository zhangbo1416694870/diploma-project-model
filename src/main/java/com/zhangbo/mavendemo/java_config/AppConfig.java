package com.zhangbo.mavendemo.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "dog")
	public IAnimal getDog(){
		return new Dog();
	}
	@Bean(name = "cat")
	public IAnimal getCat(){
		return new Cat();
	}
}
