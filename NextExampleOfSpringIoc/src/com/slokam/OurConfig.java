package com.slokam;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
//@ComponentScan("com.slokam")
public class OurConfig {
	
	@Bean
	public JdbcTemplate jdbctemplate() {
		JdbcTemplate template = new JdbcTemplate();
		
		template.setDataSource(basicdatasource());
		return template;
	}
	
	@Bean
     public BasicDataSource basicdatasource() {
	BasicDataSource bds = new BasicDataSource();
	bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	bds.setUsername("root");
	bds.setPassword("root");
	bds.setUrl("jdbc:mysql://localhost:3306/relationship");
	
	return bds;
     }
	@Bean
	public Controller controller() {
		Controller controller = new Controller();
		return  controller;
	}
	
	@Bean
	public Service service() {
		return new Service();
	}
	
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
