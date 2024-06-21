package com.example.workflow.ex;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class VariableAccessor implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
	}
	

}
