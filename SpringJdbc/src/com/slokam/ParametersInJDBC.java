package com.slokam;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ParametersInJDBC {
	public static void main(String[] args) {
		
	     Scanner sca = new Scanner(System.in);
	     System.out.println("Enter Course Name like");
	     String name = sca.nextLine();
	     
	     ApplicationContext context = new AnnotationConfigApplicationContext(OurSpringConfig.class);
	     JdbcTemplate template = context.getBean(JdbcTemplate.class);
	      
	     List<Course> courseList = template.query(" select * from course where name like  ?",new CourseBeanRowMapper(),name) ;
	     
	     for (Course course : courseList) {
	    	 System.out.println(course.getId());
		     System.out.println(course.getName());
		     System.out.println(course.getDuration());
		     System.out.println(course.getFee());
		}
	     
	     
	   
	   
}
	public static void main2(String[] args) {
		
	     Scanner sca = new Scanner(System.in);
	     System.out.println("Enter Course ID");
	     Integer id = Integer.parseInt(sca.nextLine());
	     
	     ApplicationContext context = new AnnotationConfigApplicationContext(OurSpringConfig.class);
	     JdbcTemplate template = context.getBean(JdbcTemplate.class);
	      
	      Course course = template.queryForObject(" select * from course where id=?",new CourseBeanRowMapper(), id ) ;
	     
	      System.out.println(course.getId());
	      System.out.println(course.getName());
	      System.out.println(course.getDuration());
	      System.out.println(course.getFee());
	     
	   
	   
}
  public static void main1(String[] args) {
	     Scanner sca = new Scanner(System.in);
	     System.out.println("Enter Name");
	     String name = sca.nextLine();
	     System.out.println("Enter Course Duration");
	     Integer duration = Integer.parseInt(sca.nextLine());
	     System.out.println("Enter Course fee");
	     Integer fee = Integer.parseInt(sca.nextLine());
	     
	     ApplicationContext context = new AnnotationConfigApplicationContext(OurSpringConfig.class);
	     JdbcTemplate template = context.getBean(JdbcTemplate.class);
	     template.update(" insert into course(name, duration, fee) values ( ? , ? ) ", name ,duration );
	    
	     
	   
	   
	}
}
