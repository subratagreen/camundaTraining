package com.example.workflow.processor;

import static org.camunda.spin.Spin.JSON;

import org.camunda.spin.json.SpinJsonNode;

public class JsonProcessor {

	public static void main(String[] args) {

		SpinJsonNode json = JSON("{\"customer\": \"Kermit\"}");
		SpinJsonNode customerProperty = json.prop("customer");
		String customerName = customerProperty.stringValue();
		
		System.out.println(customerName);
		
		Order order = new Order("ord-001","Mobile");
		String orderJson = JSON(order).toString();
		System.out.println(orderJson);

	}

}
