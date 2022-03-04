package com.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private int price;

	public int getPrice() {
		System.out.println("Getting price");
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init
		System.out.println("This is init Method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy
		System.out.println("This is destroy method");
	}
	
	
}
