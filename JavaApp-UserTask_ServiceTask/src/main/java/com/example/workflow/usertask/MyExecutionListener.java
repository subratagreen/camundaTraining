package com.example.workflow.usertask;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;


public class MyExecutionListener implements ExecutionListener  {
	
	Logger loger = Logger.getLogger("MyExecutionListener");

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		
		loger.info("Start Event of UserTask, BusinessKey: "+execution.getBusinessKey());
		
		// LDAP service 
		execution.setVariable("approver","demo");
		
	}
	
}