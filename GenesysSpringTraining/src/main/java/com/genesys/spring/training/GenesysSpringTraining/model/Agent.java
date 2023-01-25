package com.genesys.spring.training.GenesysSpringTraining.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Agent implements Comparable<Agent> {

	private int age;
	
	@Id
	private String id;
	private String name;
	private String city;
	private double salary;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "dn")
	private DN dn;

	

	public DN getDn() {
		return dn;
	}

	public void setDn(DN dn) {
		this.dn = dn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

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


	@Override
	public int compareTo(Agent o) {
		return this.id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "Agent [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
}
