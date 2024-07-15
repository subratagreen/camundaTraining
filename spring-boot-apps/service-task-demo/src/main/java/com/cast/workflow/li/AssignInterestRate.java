package com.cast.workflow.li;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class AssignInterestRate implements ExecutionListener {

	Logger logg = Logger.getLogger("AssignInterestRate");
	
	@Override
	public void notify(DelegateExecution execution) throws Exception {
		logg.info("AssignInterestRate is called.. ");
		
		
	}

}
