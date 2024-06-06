package com.example.workflow.usertask.listener;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component("assignedListener")
public class AssignedListener implements TaskListener {
	
	Logger loger = Logger.getLogger("AssignedListener");

	@Override
	public void notify(DelegateTask delegateTask) {
		//delegateTask.setAssignee("demo");
		loger.info("In Task Listener, event: Assigned ");
	}



}
