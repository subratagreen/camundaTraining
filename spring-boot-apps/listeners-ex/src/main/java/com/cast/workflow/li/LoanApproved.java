package com.cast.workflow.li;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component("loanApproved")
public class LoanApproved implements ExecutionListener {
	
	Logger logg = Logger.getLogger("LoanApproved");

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		logg.info("LoanApproved..."+execution.getVariable("interest"));		
	}
	
}
