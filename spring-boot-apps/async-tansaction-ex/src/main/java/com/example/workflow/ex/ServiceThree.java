package com.example.workflow.ex;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ServiceThree implements JavaDelegate {
	
	Logger logg = Logger.getLogger("ServiceThree");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logg.info("ServiceThree");
		
		throw new BpmnError("S3");
		
	}

}