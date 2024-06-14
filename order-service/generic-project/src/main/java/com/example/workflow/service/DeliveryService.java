package com.example.workflow.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service("deliveryService")
public class DeliveryService  {
	
	Logger logg = Logger.getLogger("DeliveryService");
	
	public void started(String orderId) {
		logg.info("Delivery Started for Order ID - "+orderId);		
	}
	
	public void completed(String orderId) {
		logg.info("Delivery Completed for Order ID - "+orderId);		
	}
	

}
