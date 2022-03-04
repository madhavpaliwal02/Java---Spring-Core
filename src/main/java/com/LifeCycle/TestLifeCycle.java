package com.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/LifeCycle/TapriConfig.xml");
		
		Tapri t = (Tapri) con.getBean("tap");
		
		System.out.println(t);
		
		
		System.out.println("==============================================");
		
		Pepsi p = (Pepsi) con.getBean("pep");
		
		System.out.println(p);

		System.out.println("==============================================");
		
		Pastre pas = (Pastre) con.getBean("pas");
		
		System.out.println(pas);
		
		con.registerShutdownHook();
	}
}
