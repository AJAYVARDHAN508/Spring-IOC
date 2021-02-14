package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Manager manager = context.getBean(Manager.class);
	manager.doWork();
	}

}
