package com.main.day2;

public abstract class ParentClass {

	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void printMe(String print) {
		System.out.println("Parent Class: " + print);
	}
	
	public abstract void printInt();
	public abstract void printFloat();

}
