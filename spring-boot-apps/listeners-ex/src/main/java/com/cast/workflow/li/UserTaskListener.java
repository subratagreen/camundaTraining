package com.cast.workflow.li;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component("userTaskListener")
public class UserTaskListener implements ExecutionListener {
	
	Logger logg = Logger.getLogger("UTL");

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		logg.info("UT Listener called...");
		
		Double intRate = Double.parseDouble(execution.getVariable("intRate").toString());
		Double principleAmt = Double.parseDouble(execution.getVariable("principleAmt").toString());
		
		Double interest = principleAmt *(intRate/100);
		
		execution.setVariable("interest", interest);
		
	}

}
