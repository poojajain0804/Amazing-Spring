package com.poojajain0804.autowired.annotation;

public class State {

	private String stateName;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public State(String stateName) {
		super();
		this.stateName = stateName;
	}

	public State() {
		super();
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + "]";
	}
	
	
}
