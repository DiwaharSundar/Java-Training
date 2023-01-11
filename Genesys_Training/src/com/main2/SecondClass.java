package com.main2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class SecondClass {

	public static void main(String[] args) {
		try {
			findAgent();
		} catch (AgentNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		
		try (FileInputStream fin = new FileInputStream("C:\\tmp\\Sample.txt")) {
			int bytes = 0;
			while((bytes = fin.read()) > 0 ) {
				System.out.print((char) bytes);
			}
		} catch (IOException e) {
			System.out.println(e);
		} 
		
		/*
		 * try (FileInputStream fin = new FileInputStream("./Sample.txt.txt")) { byte
		 * bytes = 10; while((bytes = (byte) fin.read()) > 0) { System.out.print(bytes);
		 * } } catch(IOException ex) { ex.printStackTrace(); }
		 */
		
		
		Comparable<Integer> comp = null;
		
		Agent agent = new Agent();
		agent.setName("Diwahar");
		agent.setAge(70);

		Agent agent2 = new Agent();
		agent2.setName("Sathesh");
		agent2.setAge(25);
		
		Agent agent3 = new Agent();
		agent3.setName("Anantha");
		agent3.setAge(30);
		
		List<Agent> agents = new ArrayList<>();
		agents.add(agent);
		agents.add(agent2);
		agents.add(agent3);
		
		Collections.sort(agents);
		System.out.println(agents);
		
		//OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		
		/*
		 * SecondClass secondClass = new SecondClass(); SecondClass.AgeComparator
		 * ageComparator = secondClass.new AgeComparator(); Collections.sort(agents,
		 * ageComparator); System.out.println(agents);
		 */
		
		HashSet<Integer> set = new HashSet<>();
		
		Collections.sort(agents, new Comparator<Agent>() {
			
			@Override
			public int compare(Agent o1, Agent o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println(agents);
		
	}

	static void findAgent() throws AgentNotFoundException {
		throw new AgentNotFoundException("Could not find Agent!");
	}
	
	
	class AgeComparator implements Comparator<Agent> {
		
		@Override
		public int compare(Agent o1, Agent o2) {
			return o1.getAge() - o2.getAge();
		}
		
	}


}
