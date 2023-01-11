package com.main.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain {

	public static void main(String[] args) {
	
		Agent agent2 = new Agent();
		agent2.setId("XYZ123");
		agent2.setName("Sathesh");
		
		Agent agent3 = new Agent();
		agent3.setId("MNO123");
		agent3.setName("Anantha");
		
		Agent agent1 = new Agent();
		agent1.setId("Abc123");
		agent1.setName("Diwahar");
		
		
		List<Agent> agentList = new ArrayList<>();
		agentList.add(agent1);
		agentList.add(agent2);
		agentList.add(agent3);
		
		Collections.sort(agentList);
		System.out.println(agentList);
		
		compareAge();
		
	}
	
	
	static void compareAge() {
		
		Agent agent1 = new Agent();
		agent1.setId("Abc123");
		agent1.setName("Diwahar");
		agent1.setAge(70);
		
		Agent agent2 = new Agent();
		agent2.setId("XYZ123");
		agent2.setName("Sathesh");
		agent2.setAge(25);
		
		Agent agent3 = new Agent();
		agent3.setId("MNO123");
		agent3.setName("Anantha");
		agent3.setAge(30);
		
		
		List<Agent> agentList = new ArrayList<>();
		agentList.add(agent2);
		agentList.add(agent3);
		agentList.add(agent1);
		
		
		SortMain sortMain = new SortMain();
		SortMain.AgeComparator agentComparator = sortMain.new AgeComparator();
		
		Collections.sort(agentList, new Comparator<Agent>() {
		
			@Override
			public int compare(Agent o1, Agent o2) {
				return o1.getAge() - o2.getAge();
			}
		
		});
		System.out.println(agentList);
		
		
	}

	
	public class AgeComparator implements Comparator<Agent>{
		
		
		@Override
		public int compare(Agent o1, Agent o2) {
			return o1.getAge() - o2.getAge();
		}


	}
	
	
}
