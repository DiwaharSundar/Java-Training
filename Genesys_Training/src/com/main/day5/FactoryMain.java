package com.main.day5;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {

	public static void main(String[] args) {
		Notification notify = FactoryClass.getMethod("SMS");
		System.out.println(notify);
		
		List<String> strList = new ArrayList<>();
	}
}
