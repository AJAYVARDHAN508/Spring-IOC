package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	@Autowired
	private Dao dao;
	public void test() {
		
		System.out.println("Service Code");
		dao.test();
		
	}

}
