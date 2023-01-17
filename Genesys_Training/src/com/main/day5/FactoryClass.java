package com.main.day5;

public class FactoryClass {

	public static Notification getMethod(String methodType) {
		switch (methodType) {
		case "SMS":
			return new SMSNotification();
		case "PUSH":
			return new PushNotification();
		default:
			System.out.println("Invalid Notify");
			return null;
		}
	}

}
