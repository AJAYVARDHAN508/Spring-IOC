package com.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TL {
	private Dev dev;
   @Autowired
	public void setDev(Dev dev) {
		this.dev = dev;
	}
	public void doWork() {
	 System.out.println("doWork start in TL");
	 dev.doWork();
	   System.out.println("doWork end in TL");
	  
	}
}
