package com.main2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThirdClass {

	public static void main(String[] args) {
			
		/*
		 * List ls = new ArrayList<>();
		 * 
		 * ls.add("Diwahar Sundar"); ls.add(2); ls.add(10.0);
		 * 
		 * for(Object o: ls) { System.out.println(o); if(o instanceof String) { String[]
		 * fullName = ((String) o).split(" ");
		 * System.out.println(Arrays.toString(fullName)); } }
		 * 
		 * List<Integer> ls2 = new ArrayList<>();
		 * 
		 * 
		 * 
		 * HashMap<Integer, Integer> map = new HashMap<>(); //16 map.put(1, 2);
		 * map.put(3, 2); map.put(2, 2); map.put(4, 2);
		 * 
		 * map.get(1);
		 * 
		 * //TC: O(1)
		 */		
		
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		for(int num: set) {
			System.out.println(num);
			
			set.remove(Integer.valueOf(num));
			
		}
		
		
		// Set - [1, 2, 2]
		// Map - [1, 1], [2, 2]
		
		
		
	}
}
