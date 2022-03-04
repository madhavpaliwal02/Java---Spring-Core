package com.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pastre {

	private String name;
	private int rate;
	
	public Pastre(String name, int rate) {
		super();
		System.out.println("Parameterized constructor");
		
		this.name = name;
		this.rate = rate;
	}

	public Pastre() {
		super();
		System.out.println("Parameterized constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pastre [name=" + name + ", rate=" + rate + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This is init pastre method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This is destroy pastre method");
	}
	
}
