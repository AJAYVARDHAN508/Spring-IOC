package com.springframework;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
	Sim sim = applicationContext.getBean("sim", Sim.class);
	sim.calling();
	sim.data();

	}

}
