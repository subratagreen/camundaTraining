package com.cast.workflow.st;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.springframework.stereotype.Component;

@Component("messageHandler")
public class MessageHandler implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		RuntimeService runtimeService = execution.getProcessEngine().getRuntimeService();
		
		MessageCorrelationResult result = runtimeService.createMessageCorrelation("online_order") 
				.processInstanceBusinessKey("ORD-123") 
				.setVariable("orderPlace", "online") 
				.setVariable("order", "shampoo")
				.correlateWithResult();
		
	}

}
