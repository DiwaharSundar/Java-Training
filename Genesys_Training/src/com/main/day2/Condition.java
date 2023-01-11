package com.main.day2;

public class Condition {

	public Condition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		Condition con1 = new Condition();
		con1.conditionalOperator();
	}

	public void ifCondition() {
		boolean check = true;
		int n = 5;

		if (n >= 10) {
			System.out.println("Inside If");
		}
	}

	public void ifElseCondition() {
		boolean check = true;
		int n = 5;

		if (n >= 10) {
			System.out.println("ifElseCondition() | Inside If");
		} else {
			System.out.println("ifElseCondition() | Inside Else");
		}
	}

	public void ifElseIfCondition() {
		boolean check = true;
		int n = 15;

		if (n >= 10) {
			System.out.println("ifElseIfCondition() | Inside If");
			if (n >= 15) {
				System.out.println("ifElseIfCondition() | Inside nested if");
			}
		} else {
			System.out.println("ifElseIfCondition() | Inside Else");
		}
	}

	public void ifElseIfNestedCondition() {
		int n = 15;

		if (n >= 10) {
			System.out.println("ifElseIfCondition() | Inside If");
			if (n >= 15) {
				System.out.println("ifElseIfCondition() | Inside nested if");
			} else if (n >= 20) {
				System.out.println("ifElseIfCondition() | Inside nested else if");
			}
		} else {
			System.out.println("ifElseIfCondition() | Inside Else");
		}
	}

	public void switchCase() {
		int n = 15;

		switch (n) {
		case 10:
			System.out.println("N is 10");
			break;
			
		case 11:
			System.out.println("N=11");
			break;
		default:
			System.out.println("Default");
			break;
		}

	}
	
	public void conditionalOperator() {
		int n =9;
		String s = (n>=10) ? "Greater" : "Lesser";
		System.out.println(s);
	}

}
