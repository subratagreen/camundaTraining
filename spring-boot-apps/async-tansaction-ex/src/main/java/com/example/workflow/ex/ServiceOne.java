package com.example.workflow.ex;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ServiceOne implements JavaDelegate {
	
	Logger logg = Logger.getLogger("ServiceOne");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logg.info("ServiceOne");
		
		//execution.createIncident("DATABASE_ERROR_INCIDENT", "database error occured");
		
	}

}
