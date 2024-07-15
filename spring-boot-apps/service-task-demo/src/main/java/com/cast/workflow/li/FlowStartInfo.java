package com.cast.workflow.li;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class FlowStartInfo implements ExecutionListener {

	Logger logg = Logger.getLogger("FlowStartInfo");

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		logg.info("Loan Calculation has been started.. for customer id - " + execution.getBusinessKey());
		
		execution.setVariable("principleAmt", 100000);
		execution.setVariable("intRate", 10);
		
	}

}
