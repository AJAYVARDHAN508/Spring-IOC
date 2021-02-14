package com.setterinjection;

public class Student {
	
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
   public void dispalyStudentInfo() {
	   System.out.println("student Name is   "    + name);
	   System.out.println("Student id is " + id) ;
   }
   
}
