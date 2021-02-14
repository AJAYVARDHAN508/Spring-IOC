package com.Inheritance;

public class ClassB extends ClassA{
	public void m2() {
		System.out.println("bye");
		
		
	}
    public static void main(String[] args) {
		ClassB b = new ClassB();
		b.m1();
		b.m2();
		
		
		ClassA a = new ClassA();
		a.m1();
		//a.m2(); compile error
	}
}
