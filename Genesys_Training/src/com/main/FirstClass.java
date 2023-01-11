package com.main;

import java.util.HashMap;

import com.main2.SecondClass;

public class FirstClass {
	
	

	public FirstClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//pass by value
		//pass reference by value
		
		int n =5;
		FirstClass first = new FirstClass();
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(5, 5);
		
		first.manipulate(n, map);
		
		System.out.println(map);
	}
	
	
	public  void manipulate(int n, HashMap<Integer, Integer> map) {
		n = 10;
		
		map = new HashMap<>();
		
	}

}
