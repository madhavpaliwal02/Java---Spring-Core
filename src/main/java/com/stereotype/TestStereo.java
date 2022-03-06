package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import java.util.Ha

public class TestStereo {

	public static void main(String args[]) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/stereotype/stereoConfig.xml");

		Driver dri = con.getBean("don", Driver.class);		// don - because explicitly name is assigned

//		System.out.println(dri);
		System.out.println(dri.hashCode());
		
		// Collections used in Driver
//		System.out.println(dri.getRate());
//		System.out.println(dri.getRate().getClass());
//		System.out.println(dri.getRate().getClass().getName());
		
		Driver dri2 = con.getBean("don", Driver.class);
		System.out.println(dri2.hashCode());
	}
}
