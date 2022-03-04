package com.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/Reference/refConfig.xml");
		
		Student stu = (Student) con.getBean("stu");
		System.out.println(stu);
		Student stu1 = (Student) con.getBean("stu1");
		System.out.println(stu1);
		
		System.out.println(stu.getAdd().getCountry());
	}

}
