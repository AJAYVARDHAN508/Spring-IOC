package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private Service service;
	public void test() {
		System.out.println("Controller Work");
		service.test();
		
	}

}
