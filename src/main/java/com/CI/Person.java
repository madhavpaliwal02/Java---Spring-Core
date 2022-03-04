package com.CI;

public class Person {

	private String name;
	private int age;
	private Certi certi;
	
	public Person(String name, int age, Certi certi) {
		this.name = name;
		this.age = age;
		this.certi = certi;
		
	}

	@Override
	public String toString() {
		return name + " : " + age + " { " + certi + " }";
	}
	
}
