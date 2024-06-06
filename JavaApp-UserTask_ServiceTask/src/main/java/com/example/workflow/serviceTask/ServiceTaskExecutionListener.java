package com.example.workflow.serviceTask;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.Expression;
import org.springframework.stereotype.Service;

@Service("stExecutionListener")
public class ServiceTaskExecutionListener implements ExecutionListener {

	Logger logger = Logger.getLogger("ServiceTaskExecutionListener");
	
	private Expression text1;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		String name = (String) text1.getValue(execution);
		logger.info("ServiceTaskExecutionListener called.. "+name);
		
		execution.setVariable("name", name);
		
	}

}
