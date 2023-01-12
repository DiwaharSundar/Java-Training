package com.main.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.main.day3.Agent;

public class LambdaMain {
	
	
	public static void main(String[] args) {
		
		Agent agent2 = new Agent();
		agent2.setId("XYZ123");
		agent2.setName("Sathesh");
		agent2.setAge(30);
		
		Agent agent3 = new Agent();
		agent3.setId("MNO123");
		agent3.setName("Anantha");
		agent3.setAge(30);
		
		Agent agent1 = new Agent();
		agent1.setId("Abc123");
		agent1.setName("Diwahar");
		agent1.setAge(70);
		
		
		List<Agent> agentList = new ArrayList<>();
		agentList.add(agent1);
		agentList.add(agent2);
		agentList.add(agent3);
		
		
		Collections.sort(agentList, LambdaMain::compare);
		Collections.sort(agentList, (a1, a2) -> {
			if(a1.getAge() == a2.getAge()) {
				return a1.getName().compareTo(a2.getName());
			} 
			return a1.getAge() - a2.getAge();
		});
		
		System.out.println(agentList);
	}
	
	static int compare(Agent a1, Agent a2) {
		if(a1.getAge() == a2.getAge()) {
			return a1.getName().compareTo(a2.getName());
		} 
		return a1.getAge() - a2.getAge();
	}
	

}
