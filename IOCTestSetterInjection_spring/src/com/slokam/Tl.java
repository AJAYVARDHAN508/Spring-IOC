package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tl {
	private Developer dev;
	
	@Autowired
	public void setDeveloper(Developer dev) {
		this.dev = dev;
	}
	
	public void doWork() {
		System.out.println("Start Tl Work");
	
		dev.doWork();
		
		System.out.println("End Tl Work");
	}

}
