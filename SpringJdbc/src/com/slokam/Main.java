package com.slokam;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
	public static void main(String[] args) {

		 ApplicationContext context = new AnnotationConfigApplicationContext(OurSpringConfig.class);
		 JdbcTemplate jt = context.getBean(JdbcTemplate.class);
		
		// jt.update("update person set name = 'Updated' where id=10 ");
	//	jt.update("delete from  person where id=10");
		 
	   /*  int count = jt.queryForInt("select count(*) from person");	
	     System.out.println(count);
		 System.out.println("Sucess");*/
		 
		 // select * from person where id = 13
		 //mapper--> result set data to pojo object
	/*Student std =  jt.queryForObject( "select * from person where id = 13", 
			new BeanPropertyRowMapper<Student>(Student.class) );
	
	//BeanPropertyRowMapper works based column name in table and property name in class matching
	System.out.println("Name::"+std.getName());
	System.out.println("Age::"+std.getAge());
	System.out.println("Phone::"+std.getPhone());
	System.out.println("ParentId::"+std.getParentid());
	System.out.println("Id::"+std.getId());*/
	
		 
	//	 select * from person
	/*	List<Student> list = jt.query("select * from person",new BeanPropertyRowMapper<Student>(Student.class));
		for(Student std:list) {
			System.out.println("Name::"+std.getName());
			System.out.println("Age::"+std.getAge());
			System.out.println("Phone::"+std.getPhone());
			System.out.println("ParentId::"+std.getParentid());
			System.out.println("Id::"+std.getId());
			System.out.println("================================");
		}*/
		 
	/*	Course course =  jt.queryForObject("select * from course where id=2", new CourseBeanRowMapper());
	 * 
		System.out.println(course.getId());
		System.out.println(course.getName());
		System.out.println(course.getDuration());
		System.out.println(course.getFee());*/
/*	List<Course> courselist =  jt.query("select * from course", new CourseBeanRowMapper());
	
	for(Course course: courselist) {
		System.out.println(course.getId());
		System.out.println(course.getName());
		System.out.println(course.getDuration());
		System.out.println(course.getFee());
	}*/
		 
		 
	}
		
 }
