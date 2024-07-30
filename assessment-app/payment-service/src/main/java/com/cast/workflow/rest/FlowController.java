package com.cast.workflow.rest;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowController {
	
//http://localhost:9093/delivery/orderId/${orderId}/restaurantId/${restaurantId}/customerId/${customerId}	
	
	@GetMapping("/customerId/{customerId}/price/{price}")
	public String startProcess( @PathVariable("customerId") String customerId, @PathVariable("price") String price ) {
		
		System.out.println("startProcess called - "+customerId+" | "+price);
		
		Map<String,Object> orderMap = new HashMap<>();
		
		orderMap.put("customerId", customerId);
		orderMap.put("price", price);
		
		// implement below code in service class
		RuntimeService runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		runtimeService.startProcessInstanceByKey("payment-process","Payment-"+customerId,orderMap);
		
		System.out.println("startProcess Started for - "+"Payment-"+customerId);
		return "success";
	}

}
