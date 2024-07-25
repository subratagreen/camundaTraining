package com.example.workflow.ex;

import org.camunda.bpm.engine.impl.incident.DefaultIncidentHandler;
import org.camunda.bpm.engine.impl.incident.IncidentContext;
import org.camunda.bpm.engine.impl.incident.IncidentHandler;
import org.camunda.bpm.engine.runtime.Incident;

public class FailedJobIncidentHandler extends DefaultIncidentHandler implements IncidentHandler {

	public FailedJobIncidentHandler(String type) {
		super(type);
		System.out.println("FailedJobIncidentHandler... created");
	}

	@Override
	public String getIncidentHandlerType() {

		return Incident.FAILED_JOB_HANDLER_TYPE;
	}

	@Override
	public Incident handleIncident(IncidentContext context, String message) {
		System.out.println("incident handled....handleIncident");
		return super.handleIncident(context, message);
	}

	@Override
	public void resolveIncident(IncidentContext context) {
		System.out.println("incident resolved....resolveIncident - ");
		
	//	deleteIncident(context);
	}

	@Override
	public void deleteIncident(IncidentContext context) {
		System.out.println("incident deleted....deleteIncident- ");
	//	super.deleteIncident(context);
		
	}

}
