package com.main.day5;

public class ThreadMain {

	public static void main(String[] args) {
		//ThreadClass tClass = new ThreadClass();
		//tClass.start();
		
		ThreadInterface tInterface = new ThreadInterface();
		
		Thread th1 = new Thread(tInterface);
		Thread th2 = new Thread(tInterface);
		th1.start();
		th2.start();
	}
	
	
}
