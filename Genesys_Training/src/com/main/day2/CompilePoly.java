package com.main.day2;

public class CompilePoly {

	public CompilePoly() {
		// TODO Auto-generated constructor stub
	}
	
	public void printMe() {
		System.out.println("Print Me with no param");
	}
	
	public void printMe(String str) {
		System.out.println(str);
	}
	
	public void printMe(int i) {
		System.out.println(i);
	}
	
	public void printMe(int i, String str) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		CompilePoly cp = new CompilePoly();
		cp.printMe();
		cp.printMe("Print from main");
	}

}
