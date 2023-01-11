package com.main.day3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Agent>{
	
	
	@Override
	public int compare(Agent o1, Agent o2) {
		return o1.getAge() - o2.getAge();
	}


}
