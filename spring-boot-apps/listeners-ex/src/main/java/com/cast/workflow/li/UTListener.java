package com.cast.workflow.li;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component("utListener")
public class UTListener implements TaskListener {

	Logger logg = Logger.getLogger("UTListener");

	@Override
	public void notify(DelegateTask delegateTask) {
		logg.info("UTListener..." + delegateTask.getVariable("interest"));
		

	}

}
