package com.example.workflow.ex;

import org.camunda.bpm.engine.runtime.Incident;

public interface MyBussIncidents extends Incident {
	
	static final String DATABASE_ERROR_INCIDENT = "DATABASE_ERROR_INCIDENT";
	
	

}
