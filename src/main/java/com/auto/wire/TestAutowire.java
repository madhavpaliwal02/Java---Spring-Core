package com.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/auto/wire/AutowireConfig.xml");
		
		Employee emp = con.getBean("emp", Employee.class);		
		
		System.out.println(emp);
	}

}
