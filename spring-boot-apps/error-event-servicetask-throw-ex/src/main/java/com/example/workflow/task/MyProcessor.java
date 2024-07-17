package com.example.workflow.task;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("myProcessor")
public class MyProcessor implements JavaDelegate {
	
	Logger logg = Logger.getLogger("MyProcessor");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logg.info("service called...");
		//
		//business logic...
		//
		
		throw new BpmnError("E001","input is not valid");
		
	}

}
