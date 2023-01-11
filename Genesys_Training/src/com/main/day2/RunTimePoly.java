package com.main.day2;

public class RunTimePoly extends CompilePoly {

	public RunTimePoly() {
		// TODO Auto-generated constructor stub
	}
	
	public void printMe() {
		System.out.println("Run time class");
	}
	
	public static void main(String[] args) {
		RunTimePoly rp = new RunTimePoly();
		//rp.printMe();
		
		CompilePoly cp = new CompilePoly();
		cp.printMe();
		
		CompilePoly cp1 = new RunTimePoly();
		cp1.printMe();
		
		//Agent a = new voiceagent();
		//Agent b = new chatagent();
	}
	
	public void cloneAgent(Agent ag) {
		
	}

}
