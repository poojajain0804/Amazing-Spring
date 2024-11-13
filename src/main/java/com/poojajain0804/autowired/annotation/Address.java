package com.poojajain0804.autowired.annotation;

public class Address {

	private String houseNo;
	private String city;
	private State stateValue;

	
	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getStateValue() {
		return stateValue;
	}

	public void setStateValue(State stateValue) {
		this.stateValue = stateValue;
	}

	public Address() {
		super();
	}

	public Address(String houseNo, String city, State stateValue) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.stateValue = stateValue;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", stateValue=" + stateValue + "]";
	}
	

	
	
}
