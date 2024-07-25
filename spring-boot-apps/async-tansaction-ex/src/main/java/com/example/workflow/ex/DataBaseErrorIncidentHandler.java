package com.example.workflow.ex;

import org.camunda.bpm.engine.impl.incident.DefaultIncidentHandler;
import org.camunda.bpm.engine.impl.incident.IncidentContext;
import org.camunda.bpm.engine.impl.incident.IncidentHandler;
import org.camunda.bpm.engine.runtime.Incident;

public class DataBaseErrorIncidentHandler extends DefaultIncidentHandler implements IncidentHandler {

	public DataBaseErrorIncidentHandler(String type) {
		super(type);
		System.out.println("DataBaseErrorIncidentHandler... created");
	}

	@Override
	public String getIncidentHandlerType() {

		return MyBussIncidents.DATABASE_ERROR_INCIDENT;
	}

	@Override
	public Incident handleIncident(IncidentContext context, String message) {
		System.out.println("DataBaseErrorIncidentHandler incident handled....handleIncident");
		return super.handleIncident(context, message);
	}

	@Override
	public void resolveIncident(IncidentContext context) {
		System.out.println("DataBaseErrorIncidentHandler incident resolved....resolveIncident - ");
		
	//	deleteIncident(context);
	}

	@Override
	public void deleteIncident(IncidentContext context) {
		System.out.println("DataBaseErrorIncidentHandler incident deleted....deleteIncident- ");
	//	super.deleteIncident(context);
		
	}

}
