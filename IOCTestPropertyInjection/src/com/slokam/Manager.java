package com.slokam;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	@Autowired
private Tl tl ;
	

	
	
	public void doWork(){
		System.out.println("Manager work started.");
		
		tl.doWork();
		System.out.println("Manager work end.");
		
	}
	
}

	


