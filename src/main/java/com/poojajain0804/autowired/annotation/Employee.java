package com.poojajain0804.autowired.annotation;

public class Employee {

	private String name;
	private Address address;
	private State statePooja;
	
	 
	
	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", stvalue=" + statePooja + "]";
	}

	public State getStatePooja() {
		return statePooja;
	}

	public void setStatePooja(State statePooja) {
		this.statePooja = statePooja;
	}

	}

