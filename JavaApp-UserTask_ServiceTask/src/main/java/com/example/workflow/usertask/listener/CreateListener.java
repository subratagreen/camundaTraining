package com.example.workflow.usertask.listener;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component("createListener")
public class CreateListener implements TaskListener {
	
	Logger loger = Logger.getLogger("CreateListener");

	@Override
	public void notify(DelegateTask delegateTask) {
		
		//delegateTask.getExecution().getBusinessKey();
		//delegateTask.getDueDate();		
		//delegateTask.setAssignee("demo");
		loger.info("In Task Listener, event: create ");
	}

}
