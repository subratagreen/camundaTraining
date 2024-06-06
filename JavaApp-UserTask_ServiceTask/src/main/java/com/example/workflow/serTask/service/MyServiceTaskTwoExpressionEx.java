package com.example.workflow.serTask.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class MyServiceTaskTwoExpressionEx  {

	  private final static Logger LOGGER = Logger.getLogger("MyServiceTaskTwoExpressionEx");

	  public void doSomething() throws Exception {
		  
	    LOGGER.info("MyServiceTaskTwoExpressionEx...");
	    
	  }
}