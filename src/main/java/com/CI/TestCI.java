package com.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/CI/CIConfig.xml");
		
		Person p = (Person) con.getBean("per");
		
		System.out.println(p);
		
		Shop s  = (Shop) con.getBean("shop");
		System.out.println(s);
		
	}

}
