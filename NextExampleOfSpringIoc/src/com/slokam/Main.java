package com.slokam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
	public static void main(String[] args) {
		
		
		/*
		 * Object Creation Can be done in spring using 1.Sterio type()
		 * 2.our own methods with @bean to create objects with out using @componentscan and @component
		 * when we are create bean for the predefined classes we have only one option 
		 *  i.e using @bean with our own method 
		 * 
		 * 
		 * 
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(OurConfig.class);
		
	/*Controller controller =	context.getBean(Controller.class);
		controller.test();*/
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		
		template.update("insert into course values(4,'devops',4,250)");
		System.out.println("successfully genarated");
	}

}
