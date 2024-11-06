package com.poojajain0804.lifecycle.xml;

public class Customer {

	private String customerName;
	private double orderAmount;
	private int orderId;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		System.out.println("set cust name");
		this.customerName = customerName;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		System.out.println("set order amount");
		this.orderAmount = orderAmount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", orderAmount=" + orderAmount + ", orderId=" + orderId + "]";
	}
	public Customer() {
		super();	
	}
	
	public void initPooja() {
		System.out.println("After bean initilization.");
	}
	
	public void destroyPooja() {
		System.out.println("Before bean destroy.");
	}
}
