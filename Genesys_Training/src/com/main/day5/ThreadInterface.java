package com.main.day5;

public class ThreadInterface implements Runnable {

	public void run() {
		System.out.println("Inside run method of thread interface");
		synchronized (this) {
			printNo();
		}
	}

	public void printNo() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread name: " + Thread.currentThread().getName() + " i: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
