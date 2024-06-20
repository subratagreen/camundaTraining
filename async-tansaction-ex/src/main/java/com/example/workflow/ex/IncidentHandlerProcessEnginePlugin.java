package com.example.workflow.ex;

import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.runtime.Incident;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IncidentHandlerProcessEnginePlugin extends AbstractProcessEnginePlugin {

	@Override
	public void preInit(ProcessEngineConfigurationImpl engineConfig) {
		System.out.println("IncidentHandlerProcessEnginePlugin...added");
		
		engineConfig.setCustomIncidentHandlers(List.of(
				// existing standard incident types
				new FailedJobIncidentHandler(Incident.FAILED_JOB_HANDLER_TYPE),
				
				new DataBaseErrorIncidentHandler(MyBussIncidents.DATABASE_ERROR_INCIDENT)
				
				)
				);
		
	}
}