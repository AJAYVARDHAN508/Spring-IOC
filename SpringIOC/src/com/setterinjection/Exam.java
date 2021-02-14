package com.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student ajay = applicationContext.getBean("student", Student.class);
	   ajay.dispalyStudentInfo();
		
		Student suresh = applicationContext.getBean("suresh",Student.class);
		suresh.dispalyStudentInfo();

	}

}
