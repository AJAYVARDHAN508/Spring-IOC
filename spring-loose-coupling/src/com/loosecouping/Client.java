package com.loosecouping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		  
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(" bean.xml file loaded");
		
		Airtel airtel = applicationContext.getBean("air",Airtel.class);
		airtel.activateService();

	}

}
