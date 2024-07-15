package com.cast.workflow.jc;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class CallerService implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		execution.getProcessEngine().getRuntimeService().startProcessInstanceByKey("comcast-demo-callee");
		
	}

}
