package com.zhangbo.common;

public class Person {
	private String name;
	private String address;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Person["+"address=" + address + ", age= " + age + ",name=" + name+"]";
	}
}
