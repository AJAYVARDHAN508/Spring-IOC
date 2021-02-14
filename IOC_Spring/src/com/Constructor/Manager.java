package com.Constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	private TL tl;
	@Autowired
	public Manager(TL tl) {
		this.tl=tl;
	}
	
	public void doWork() {
		System.out.println("doWork start in Manager");
		tl.doWork();
		System.out.println("doWork end in Manager");
	}

}
