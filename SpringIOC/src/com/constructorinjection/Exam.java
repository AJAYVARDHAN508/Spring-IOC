package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
		Student student1 = applicationContext.getBean("student", Student.class);
		student1.dispalyStudentInfo();
		student1.dispalyStudentInfo();

	}

}
