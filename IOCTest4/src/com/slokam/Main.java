package com.slokam;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) {
		
		// object creation and object injection 
		
				Manager manager = new Manager();
				Tl tl = new Tl();
				Developer dev = new Developer();
				
				
				
				/*Class managerCls = Manager.class;
				
				Field [] fields =  managerCls.getDeclaredFields();
				
				for(Field field:fields) {
					System.out.println(field.getName());
				}
				
				
				Method[]  methods =managerCls.getDeclaredMethods();
				
				for (Method method : methods) {
					System.out.println(method.getName());
				}*/
				
				Class managerCls = Manager.class;
				Class tlCls = Tl.class;
				
				   try {
					  Field field1 =  managerCls.getDeclaredField("tl");
					  field1.setAccessible(true);
					  field1.set(manager, tl);
					  
					  Field field2= tlCls.getDeclaredField("dev");
					  field2.setAccessible(true);
					  field2.set(tl,dev);
					  
				    } catch (Exception e) {
					  e.printStackTrace();
				   }
				   
				   manager.doWork();
				
			}
		}
