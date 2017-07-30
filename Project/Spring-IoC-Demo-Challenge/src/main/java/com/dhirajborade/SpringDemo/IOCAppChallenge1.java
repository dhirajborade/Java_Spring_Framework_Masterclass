package com.dhirajborade.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		
		// Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		// Create the bean
		City city = (City) ctx.getBean("mycity");
		
		// Invoke the city name method via the bean
		city.cityName();
		
		// Close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
