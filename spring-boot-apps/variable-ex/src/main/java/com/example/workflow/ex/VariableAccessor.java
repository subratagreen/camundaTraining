package com.example.workflow.ex;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class VariableAccessor implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println(execution.getVariable("booleanVar"));
		System.out.println(execution.getVariable("bytesVar"));
		System.out.println(execution.getVariable("shortVar"));
		System.out.println(execution.getVariable("intVar"));
		System.out.println(execution.getVariable("longVar"));
		System.out.println(execution.getVariable("doubleVar"));
		System.out.println(execution.getVariable("dateVar"));
		System.out.println(execution.getVariable("stringVar"));
		
		System.out.println(execution.getVariable("customer"));
		
	}
	

}
