package com.cast.workflow.listeners;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component("cashbackCalculation")
public class CashbackCalculation implements ExecutionListener {

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		System.out.println("cashbackCalculation.....");
		
		execution.setVariable("thirdParty", true);
		
	}

}
