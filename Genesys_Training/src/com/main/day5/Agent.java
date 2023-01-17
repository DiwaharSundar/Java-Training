package com.main.day5;

public class Agent {

	private int id;
	private String name;
	private int age;
	private String city;
	private String country;
	private String zipcode;

	private Agent(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.city = builder.city;
		this.country = builder.country;
		this.zipcode = builder.zipcode;
	}

	/*
	 * public Agent(int id, String name, int age) { this(id, name, age, null); }
	 * 
	 * public Agent(int id, String name, int age, String city) { this.id = id;
	 * this.name = name; this.age = age; this.city = city; }
	 */

	@Override
	public String toString() {
		return "[id: " + id + ", name: " + name + ", age: " + age + ", city: " + city + ", country: " + country + "]";
	}

	public static class Builder {
		private int id;
		private String name;
		private int age;
		private String city;
		private String country;
		private String zipcode;

		private Builder() {
		}

		public static Builder newInstance() {
			return new Builder();
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}

		public Builder withCity(String city) {
			this.city = city;
			return this;
		}

		public Builder withCountry(String country) {
			this.country = country;
			return this;
		}
		
		public Builder withZipcode(String zipcode) {
			this.zipcode = zipcode;
			return this;
		}

		public Agent build() {
			return new Agent(this);
		}

	}

}
