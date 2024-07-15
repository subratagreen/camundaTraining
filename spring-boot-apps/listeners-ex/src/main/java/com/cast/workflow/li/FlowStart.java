package com.cast.workflow.li;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component("startFlow")
public class FlowStart implements ExecutionListener {
	
	Logger logg = Logger.getLogger("FS");

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		logg.info("FS Listener called...");
		
		execution.setVariable("principleAmt", 100000);
		execution.setVariable("intRate", 10);
		
	}

}
