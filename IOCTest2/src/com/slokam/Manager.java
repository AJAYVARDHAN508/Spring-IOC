package com.slokam;

public class Manager {
	private Tl tl ;
	
	public void setTl(Tl tl) {
		this.tl=tl;
	}
	public void doWork() {
		System.out.println("Manager Work Started");
		 
		tl.doWork();
		System.out.println("Manager Work End");
		
	}
	

}