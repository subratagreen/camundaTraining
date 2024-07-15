package com.cast.workflow.jc;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Service;

@Service
public class VariableAssignment implements ExecutionListener{

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		String respCode = (String) execution.getVariable("statusCode");
		
		execution.setVariable("respCode", respCode);
		
	}

}
