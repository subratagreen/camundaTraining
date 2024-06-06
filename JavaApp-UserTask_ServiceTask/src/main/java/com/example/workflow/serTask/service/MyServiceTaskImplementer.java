package com.example.workflow.serTask.service;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MyServiceTaskImplementer implements JavaDelegate {

	  private final static Logger LOGGER = Logger.getLogger("MyServiceTaskImplementer");

	  public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("customerId","123");
	    LOGGER.info("Business Key: '" + execution.getBusinessKey() + "'...");
	  }
}