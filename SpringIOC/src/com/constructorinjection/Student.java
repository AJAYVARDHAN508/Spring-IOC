package com.constructorinjection;

public class Student {
	
	private String name;
	private int id;
	
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	 public void dispalyStudentInfo() {
		   System.out.println("student Name is   "    + name);
		   System.out.println("Student id is " + id) ;
	   }

}
