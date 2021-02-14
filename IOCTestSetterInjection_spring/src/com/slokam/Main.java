package com.slokam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
	/*	//object creation
		Manager manager = new Manager();
		Tl tl = new Tl();
		Developer dev = new Developer();
		
		//object injection
		manager.setTl(tl);
		tl.setDeveloper(dev);
		
		manager.doWork();*/
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		// 1. It will go to the package specified in the SpringConfig and creates objects for classes  which are annotated
		// with @component.
		// 2. It will will inject one object into another based on @autowired annotation.
		// Note: Context object acts as Factory , containing all created objects.
		
		
		Manager manger = context.getBean(Manager.class);
		manger.doWork();
		
	}

}
