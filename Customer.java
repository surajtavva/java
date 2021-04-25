package com.inventory;

import java.time.LocalDate;

public class Customer {
	
	private int id;
	private String name;
	private LocalDate dob;
	private  GenderType gender;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, LocalDate dob, GenderType gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	 
   

}
