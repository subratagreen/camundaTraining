package com.cast.workflow.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowController {
	
//http://localhost:9093/delivery/orderId/${orderId}/restaurantId/${restaurantId}/customerId/${customerId}	
	
	@GetMapping("/orderId/{orderId}/restaurantId/{restaurantId}/customerId/{customerId}")
	public String startProcess(@PathVariable String orderId, @PathVariable String restaurantId, @PathVariable String customerId ) {
		
		System.out.println("startProcess called - "+orderId+" | "+restaurantId+" | "+customerId);
		return "success";
	}

}
