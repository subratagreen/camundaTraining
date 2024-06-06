package com.example.workflow.serviceTask;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("myServiceTaskImpl")
public class MyServiceTaskImpl implements JavaDelegate {
	
	//${secondServiceTaskImpl.doSomething()}
	
	Logger logger = Logger.getLogger("MyServiceTaskImpl");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logger.info("MyServiceTaskImpl - "+execution.getProcessDefinitionId());
		
	}

}
