package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tl {
	
	@Autowired
private Developer dev ;
	
	
	public void doWork() {
		System.out.println("Started TL work");
		dev.doWork();
		System.out.println("End TL work");
	}
}

