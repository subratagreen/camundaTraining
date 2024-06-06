package com.example.workflow.service;

import java.util.logging.Logger;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class CallerServiceImpl implements JavaDelegate{
	
	Logger logg = Logger.getLogger("CallerServiceImpl");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		RuntimeService runtimeService = execution.getProcessEngine().getRuntimeService();
		
		logg.info("ProcessDefinitionId - "+execution.getProcessDefinitionId());
		
		runtimeService.startProcessInstanceByKey("process-to-be-called");
		
		//runtimeService.startProcessInstanceById("process-to-be-called");
		
		// does this next line depends on - startProcessInstanceByKey
		
	}

}
