package com.example.workflow.service;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("creditCardService")
public class CreditCardService implements JavaDelegate {
	
	Logger logg = Logger.getLogger("CreditCardService");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logg.info("service called...");
		throw new BpmnError("error occurred");
		
	}

}
