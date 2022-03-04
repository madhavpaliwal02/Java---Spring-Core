package com.CI;

public class Shop {
	
	private int cal;
	private int paper;
	
	@Override
	public String toString() {
		return "Shop [cal=" + cal + ", paper=" + paper + "]";
	}

	public Shop(double cal, double paper) {
		System.out.println("Double, Double");
		this.cal = (int) cal;
		this.paper = (int) paper;
	}
	
	public Shop(int cal, int paper) {
		System.out.println("Int, Int");
		this.cal = cal;
		this.paper = paper;
	}
	
	/*
	 * public Shop(String cal, String paper) { System.out.println("String, String");
	 * this.cal = Integer.parseInt(cal); this.paper = Integer.parseInt(paper); }
	 */	
	
}
