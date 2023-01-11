package com.main.day3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashSet;

public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		try {
			for(int num: set) {
				set.remove(Integer.valueOf(num));
			}
		} catch(ConcurrentModificationException ex) {
			System.out.println("Cannot Modify List");
		}
		
		
		readFile();
		
	}
	
	static void readFile() {
		
		
		try (FileInputStream fin = new FileInputStream("C:\\Java\\Sample.txt")) {
			int bytes = 0;
			while((bytes = fin.read()) > 0) {
				System.out.print((char) bytes);
			}
		} catch(IOException ex) {
			System.out.println("Cannot Read File");
		} 
		
	}
	
	

}
