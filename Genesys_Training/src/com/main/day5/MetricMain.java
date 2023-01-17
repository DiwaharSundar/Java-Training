package com.main.day5;

public class MetricMain {
	
	public static void main(String[] args) {
		MetricClass mClass = MetricClass.getInstance();
		
		mClass.printCounter();
		mClass.increaseCounter();
		mClass.printCounter();
		
		mClass = MetricClass.getInstance();
		
		mClass.printCounter();
		mClass.increaseCounter();
		mClass.printCounter();
		
		MetricClass mClass1 = MetricClass.getInstance();
		
		mClass1.printCounter();
		mClass1.increaseCounter();
		mClass1.printCounter();
	}

}
