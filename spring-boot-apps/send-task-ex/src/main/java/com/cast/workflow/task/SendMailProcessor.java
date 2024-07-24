package com.cast.workflow.task;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("sendMailProcessor")
public class SendMailProcessor implements JavaDelegate {
	
	Logger logg = Logger.getLogger("SendMailProcessor");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String emailTO = (String) execution.getVariable("emailTO");
		String emailCC = (String) execution.getVariable("emailCC");

		
		logg.info("email sending ... TO - "+emailTO+" emailCC - "+emailCC);
		
	}

}
