package com.main.day3;

public class Agent implements Comparable<Agent>{

	private int age;
	private String id;
	private String name;
	private String city;

	public Agent() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//ABC123
	//XYZ123
	
	//Anantha
	//Diwahar
	//Satesh

	@Override
	public int compareTo(Agent o) {
		return this.id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "Agent [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	

	

}
