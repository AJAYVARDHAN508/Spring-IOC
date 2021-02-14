package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cleint {
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("bean.xml file loaded..");
		Student student = applicationContext.getBean("stu",Student.class);
		student.Cheating();
		
		AnotherStudent anotherStudent = applicationContext.getBean("anotherstudent",AnotherStudent.class);
		anotherStudent.StartedCheat();
	}

}
