package com.springframework;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
	
		System.out.println("using call by vodaphone");
	}

	@Override
	public void data() {
		System.out.println("using data by vodaphone");
		

}
}