package com.slokam;

public class Manager {
	private Tl tl = new Tl();
	public void doWork() {
		System.out.println("Manager Work Started");
		 
		tl.doWork();
		System.out.println("Manager Work End");
		
	}
	

}
