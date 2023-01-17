package com.main.day5;

import java.util.List;

public class ParallelStreams {
	
	public static void main(String[] args) {
		List<Integer> listOfNos = List.of(1,2,3,4,5,6,7,8,9,10);
		
		listOfNos.stream().filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));
		
		System.out.println("\nParallel Streams");
		listOfNos.parallelStream().filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));
	}

}
