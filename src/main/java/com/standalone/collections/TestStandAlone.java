package com.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandAlone {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/standalone/collections/Aloneconfig.xml");
		
		Person per = con.getBean("per", Person.class);
		
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
		System.out.println("=====================================================");
		
		System.out.println(per.getFeeStruc());
		System.out.println(per.getFeeStruc().getClass().getName());
		System.out.println("=====================================================");
		
		System.out.println(per.getProp());
	}
}
