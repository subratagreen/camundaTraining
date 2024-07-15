package com.cast.workflow.jc;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class JavaClassAsServiceTask implements JavaDelegate {
	
	Logger logg = Logger.getLogger("JavaClassAsServiceTask");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		logg.info(" getBusinessKey -  "+execution.getBusinessKey());
		logg.info(" getProcessEngine -  "+execution.getProcessEngine().getName());
		logg.info(" getProcessDefinitionId-  "+execution.getProcessDefinitionId());
		
		
		execution.setVariable("name", "subrat");
		
		int intRate = Integer.parseInt((String) execution.getVariable("intRate"));
		int principleAmt = Integer.parseInt((String)  execution.getVariable("principleAmt"));
		
		int interest = principleAmt *(intRate/100);
		
		execution.setVariable("interest", interest);
		
		
		//https://api.restful-api.dev/objects
		
		execution.setVariable("url", "https://api.restful-api.dev/objects");
		
		
		
	}

}
