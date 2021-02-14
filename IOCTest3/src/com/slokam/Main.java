package com.slokam;

public class Main {
	public static void main(String[] args) {
		//object creation and object injection
		Developer dev = new Developer();
		Tl tl = new Tl(dev);
		Manager manager = new Manager(tl);
		
		manager.doWork();
	}

}
