package com.springframework;

public class Airtel implements Sim{

	@Override
	public void calling() {
	
		System.out.println("using call by airtel");
	}

	@Override
	public void data() {
		System.out.println("using data by airtel");
		
		
	}
	
	
	
	

}
