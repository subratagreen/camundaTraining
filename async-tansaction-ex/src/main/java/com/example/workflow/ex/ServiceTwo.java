package com.example.workflow.ex;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ServiceTwo implements JavaDelegate {
	
	Logger logg = Logger.getLogger("ServiceTwo");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logg.info("ServiceTwo");
		
	}

}