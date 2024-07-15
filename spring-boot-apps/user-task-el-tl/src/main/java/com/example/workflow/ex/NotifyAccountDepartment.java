package com.example.workflow.ex;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Service;


@Service
public class NotifyAccountDepartment implements ExecutionListener {

	Logger logg = Logger.getLogger("NotifyAccountDepartment");

	@Override
	public void notify(DelegateExecution execution) throws Exception {

		logg.info("NotifyAccountDepartment, currently assigned to - " + execution.getVariable("approver"));
		
		// add logic to notify

	}

}
