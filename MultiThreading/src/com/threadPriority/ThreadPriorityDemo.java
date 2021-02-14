package com.threadPriority;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setPriority(8);
		t.start();
		for(int i=0;i<10;i++) {
			
			System.out.println("Parent Thread");
		}
	}

}
