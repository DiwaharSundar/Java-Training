package com.main;

public class Agent extends Object {
	
	
	int id;
	String name;
	String city;
	
	public Agent() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void foo(String name) {
		System.out.println("foo");
	}
	
	private  void foo2(String name) {
		System.out.println("foo");
	}
	
	protected void foo3(String name) {
		System.out.println("foo");
	}
	
	
	
	
	
	class InnerClass{
		
		
	}

}
