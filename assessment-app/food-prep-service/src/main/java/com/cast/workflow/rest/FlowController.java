package com.cast.workflow.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowController {
	
//http://localhost:9093/delivery/orderId/${orderId}/restaurantId/${restaurantId}/customerId/${customerId}	
	
	@GetMapping("/food/{food}/instruction/{instruction}")
	public String startProcess( @PathVariable String food, @PathVariable String instruction ) {
		
		System.out.println("startProcess called - "+food+" | "+instruction);
		return "success";
	}

}
