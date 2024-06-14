package com.example.workflow.service;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingService implements JavaDelegate {
	
	Logger logg = Logger.getLogger("OrderProcessingService");
			
			
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String orderId = (String)execution.getVariable("orderId");
		
		// save it to DB
		
		logg.info("orderId - "+orderId);
		
	}

}
