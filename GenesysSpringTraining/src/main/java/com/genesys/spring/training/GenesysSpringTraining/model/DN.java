package com.genesys.spring.training.GenesysSpringTraining.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DN {

	@Id
	private int number;
	private String city;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
