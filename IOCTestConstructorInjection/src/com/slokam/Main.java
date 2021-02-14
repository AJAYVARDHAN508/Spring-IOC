package com.slokam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//object creation and object injection
		/*Developer dev = new Developer();
		Tl tl = new Tl(dev);
		Manager manager = new Manager(tl);
		
		manager.doWork();*/
		
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Manager manager = context.getBean(Manager.class);
		manager.doWork();
		
	}

}
