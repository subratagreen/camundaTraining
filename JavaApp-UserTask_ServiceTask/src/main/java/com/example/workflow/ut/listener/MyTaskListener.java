package com.example.workflow.ut.listener;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;

@Service
public class MyTaskListener implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
				
		System.out.println("listener to user task 111 ..");
		
		 delegateTask.setAssignee("demo");
		 delegateTask.addCandidateUser("john");
		 delegateTask.addCandidateGroup("business");
		
	}

}
