package com.example.workflow.processor;

public class Order {

	private String orderId;
	private String orderName;

	public Order(String orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
