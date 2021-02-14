package com.slokam;

public class Main {
	public static void main(String[] args) {
		
		//object creation
		Manager manager = new Manager();
		Tl tl = new Tl();
		Developer dev = new Developer();
		
		//object injection
		manager.setTl(tl);
		tl.setDeveloper(dev);
		
		manager.doWork();
	}

}
