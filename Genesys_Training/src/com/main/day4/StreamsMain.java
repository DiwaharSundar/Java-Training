package com.main.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.main.day3.Agent;

public class StreamsMain {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		for(int num: list) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		System.out.println("Declaraitive");
		list.stream()
			.filter(num -> num%2 == 0)
			.forEach(num -> System.out.println(num+" "));
	
		System.out.println("Double the odd numbers");
		list.stream()
			.filter(num -> num%3 == 0)
			.map(num -> num*2)
			.forEach(num -> System.out.println(num));
		
		toMap();
	}
	
	static void toMap() {
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
		
		List.of(agent1, agent2, agent3).stream()
		 								.collect(Collectors.toMap(Agent::getName, agent -> agent));
		
		Stream.of(agent1, agent2, agent3)
			.collect(Collectors.toMap(Agent::getName, agent -> agent));
		
		
		
		Map<String, Agent> agentMap =   agentList.stream()
				 								 .collect(Collectors.toMap(Agent::getName, agent -> agent));
		
		System.out.println(agentMap);
		
		
		//agentMap.keySet().stream()
		//agentMap.values()
		//agentMap.entrySet()
		
		
		
	}
	

}
