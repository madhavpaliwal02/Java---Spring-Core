package com.SpringCore;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Student stu1 = (Student) context.getBean("Student1");
		System.out.println(stu1);
		
		Student stu2 = (Student) context.getBean("Student2");
		System.out.println(stu2);

	}

}
