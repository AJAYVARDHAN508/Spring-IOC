package com.slokam;

public class Tl {
	private Developer dev;
	public void setDeveloper(Developer dev) {
		this.dev = dev;
	}
	
	public void doWork() {
		System.out.println("Start Tl Work");
	
		dev.doWork();
		
		System.out.println("End Tl Work");
	}

}