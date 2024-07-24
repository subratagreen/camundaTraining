package com.example.workflow.processor;

import static org.camunda.spin.Spin.S;

import static org.camunda.spin.Spin.XML;

import org.camunda.spin.xml.SpinXmlElement;

public class MyXmlProcessor {

	public static void main(String[] args) {
		String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <h:order xmlns:h=\"http://www.w3.org/TR/html4/\"> <h:orderId>ord-001</h:orderId> <h:orderName>mobile</h:orderName> </h:order>";
		
		SpinXmlElement xml = S(xmlData);
		System.out.println(xml);
		
//		System.out.println(xml.namespace());
//		
//		System.out.println(xml.appendAfter(S("<orderName />"), S("<price />")));
		
		String xmlInput = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <Customer> 	<name>Kermit</name> </Customer>";
		Customer customer = XML(xmlInput).mapTo(Customer.class);
		System.out.println(customer.getName());
		
		Order order = new Order("ord-001","Mobile");
		String orderXML = XML(order).toString();
		System.out.println(orderXML);

	}

}
