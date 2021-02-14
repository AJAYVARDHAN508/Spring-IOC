package com.slokam;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class OurSpringConfig {


	@Bean
	public  BasicDataSource basicDataSource() {
		
		BasicDataSource bds = new BasicDataSource();
		bds.setUrl("jdbc:mysql://localhost:3306/relationship");
		bds.setUsername("root");
		bds.setPassword("root");
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return bds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTempate = new JdbcTemplate();
		jdbcTempate.setDataSource(basicDataSource());
		return jdbcTempate;
	}
	
}


	
