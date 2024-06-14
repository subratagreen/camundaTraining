package com.example.workflow.service;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class OrderPaymentService implements JavaDelegate{

	Logger logg = Logger.getLogger("OrderPaymentService");
	
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Boolean paymentSuccess = (Boolean)execution.getVariable("paymentSuccess");
		String orderId = (String)execution.getVariable("orderId");
		
		// do the payment for Order ID
		execution.setVariable("paymentRefId", "TRAN-1234");
		
		// if payment failed then - throw BPMNError();
		
		if(!paymentSuccess) {
			execution.setVariable("paymentStatus", "failed");
			throw new BpmnError("Order ID - "+ orderId +" | Payment failed.");
		}
		
		execution.setVariable("paymentStatus", "success");
		logg.info("Order ID - "+ orderId +" | Payment Success.");
		
	}

}
