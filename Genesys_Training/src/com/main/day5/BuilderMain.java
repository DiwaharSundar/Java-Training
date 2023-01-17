package com.main.day5;

public class BuilderMain {
	public static void main(String[] args) {
		//Agent agent1 = new Agent(1, "Jothi", 16);
		//Agent agent2 = new Agent(1, "Simhan", 61);
		
		Agent agent1 = Agent.Builder.newInstance()
							.withId(1)
							.withName("Jothi")
							.withAge(16)
							.build();
		
		Agent agent2 = Agent.Builder.newInstance()
							.withId(2)
							.withName("Simhan")
							.withCity("Chennai")
							.build();

		System.out.println(agent1);
		System.out.println(agent2);
	}
}
