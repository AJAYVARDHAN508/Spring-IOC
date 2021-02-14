package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	private Tl tl ;
	
	@Autowired
	public void setTl(Tl tl) {
		this.tl=tl;
	}
	public void doWork() {
		System.out.println("Manager Work Started");
		 
		tl.doWork();
		System.out.println("Manager Work End");
		
	}
	

}
