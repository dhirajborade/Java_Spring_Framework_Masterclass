package com.dhirajborade.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorArgsApp {

	public static void main(String[] args) {
		
		// Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// Invoke the company slogan via the bean
		org.corporateSlogan();	
		
		// Print organization details
		System.out.println(org);
		
		// Close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
