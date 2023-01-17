package com.main.day5;

public class MetricClass {

	private static MetricClass mClass;

	private int counter = 0;

	private MetricClass() {
	}

	public static MetricClass getInstance() {
		if (null == mClass) {
			// t1, t2
			synchronized (MetricClass.class) {
				//t1, t2
				if (null == mClass) {
					mClass = new MetricClass();
				}
			}
		}
		return mClass;
	}

	public void increaseCounter() {
		this.counter++;
	}

	public void printCounter() {
		System.out.println(this.counter);
	}

}
