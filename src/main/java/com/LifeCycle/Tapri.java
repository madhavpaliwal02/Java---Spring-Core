package com.LifeCycle;

public class Tapri {
	private int num1;
	private int num2;
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		System.out.println("Setting num1");
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		System.out.println("Setting num2");
		this.num2 = num2;
	}
	
	@Override
	public String toString() {
		return "Tapri [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	public void init() {
		System.out.println("Init");
	}
	public void destroy() {
		System.out.println("Destroy");
	}
	
}
