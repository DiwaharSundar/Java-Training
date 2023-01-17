package com.main.day5;

public class ThreadClass extends Thread {

	public void run() {
		System.out.println("Inside run method of thread class");
		printNo();
	}
	
	public void printNo() {
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
	}

}
