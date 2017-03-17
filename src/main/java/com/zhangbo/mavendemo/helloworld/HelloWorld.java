package com.zhangbo.mavendemo.helloworld;

public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHelloWorld(){
		System.out.println("the first spring3 mvc"+name);
	} 
}
