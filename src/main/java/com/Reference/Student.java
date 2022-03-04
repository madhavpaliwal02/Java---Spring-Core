package com.Reference;

public class Student {
	private String name;
	private int age;
	private Address add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

	/*
	 * public Student(String name, int age, Address add) { super(); this.name =
	 * name; this.age = age; this.add = add; }
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", add=" + add + "]";
	}
	
}
