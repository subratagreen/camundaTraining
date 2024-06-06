package com.example.workflow.serTask.listener;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.Expression;
import org.springframework.stereotype.Component;

@Component("serviceTaskExecutionListener")
public class ServiceTaskExecutionListener implements ExecutionListener {
	
	private final static Logger LOGGER = Logger.getLogger("ServiceTaskExecutionListener");
	
	private Expression text1;


	@Override
	public void notify(DelegateExecution execution) throws Exception {
		String textVal = (String) text1.getValue(execution);
		LOGGER.info("ServiceTaskExecutionListener - End, text1:  "+ textVal);	
		
		execution.setVariable("name", textVal);
	}
	
	

}
