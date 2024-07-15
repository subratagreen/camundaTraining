package com.example.workflow.task;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;

@Service("assignApprover")
public class AssignApprover implements TaskListener {
	
	Logger logg = Logger.getLogger("AssignApprover");

	@Override
	public void notify(DelegateTask delegateTask) {
		logg.info("notify called...");
		delegateTask.setVariable("approver", "demo");
	}

}
