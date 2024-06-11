package com.example.workflow.Processor;

import java.util.Map;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessor {

	public String createNewProcess(String processKey, String businessKey) {

		Map<String, Object> variables = new java.util.HashMap<>();
		variables.put("name", "subrat");

		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		RuntimeService runtimeService = processEngine.getRuntimeService();

		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processKey, businessKey, variables);

		return processInstance.getBusinessKey();
	}
	

	public MessageCorrelationResult triggerMessageEvent(String messageName, String businessKey) {
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		RuntimeService runtimeService = processEngine.getRuntimeService();
		
		MessageCorrelationResult result = runtimeService.createMessageCorrelation(messageName)
				.processInstanceBusinessKey(businessKey)
				.correlateWithResult();
		
		return result;
	}

}
