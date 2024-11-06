package com.poojajain0804.lifecycle.annotationBased;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Order {

	private String orderProductName;
	private int orderId;

	public Order() {
		super();
	}

	public String getOrderProductName() {
		return orderProductName;
	}

	public void setOrderProductName(String orderProductName) {
		System.out.println("order product name set");
		this.orderProductName = orderProductName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Order [orderProductName=" + orderProductName + ", orderId=" + orderId + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("lets start things ");
		
	}

	@PreDestroy
	public void destroy() {
		System.out.println("lets destroy things ");
		
	}
}
