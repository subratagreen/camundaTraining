package com.example.workflow.service;

import java.util.UUID;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.springframework.stereotype.Service;

@Service
public class ProcessFlowService {
	
	private static final String ORDER_PROCESS_WF = "Order_Process_WF";

	public String startOrderProcessFlow() {
		String businessKey = "Order-"+UUID.randomUUID();
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		processEngine.getRuntimeService().startProcessInstanceById(ORDER_PROCESS_WF,businessKey);
		
		return businessKey;
	}

}
