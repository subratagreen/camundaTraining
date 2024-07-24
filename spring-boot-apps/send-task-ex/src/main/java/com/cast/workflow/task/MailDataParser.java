package com.cast.workflow.task;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("mailDataParser")
public class MailDataParser implements JavaDelegate {
	
	Logger logg = Logger.getLogger("MailDataParser");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String emailTO = (String) execution.getVariable("emailTO");
		logg.info("email data parsing ... TO - "+emailTO);
		
		execution.setVariable("emailCC", "subrat@abc.com");
		
	}

}
