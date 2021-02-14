package com.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	private TL tl;
   @Autowired
	public void setTl(TL tl) {
		this.tl = tl;
	}
   public void doWork() {
	   System.out.println("doWork start in Manager");
	   System.out.println("doWork end in Manager");
	   tl.doWork();
   }
}
