package com.example.workflow.handler;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("ratingProvider") 
public class GenerateRatingHandler implements ExternalTaskHandler {

	Logger logger = Logger.getLogger("GenerateRatingHandler");
	@Override
	public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		
		logger.log(Level.INFO, "GenerateRatingHandler is ready to handle ... ");
		
		String candidateId = "IN-" + (Math.random() * 100);
		int candidateScore = (int) (Math.random() * 11);

		VariableMap variables = Variables.createVariables();
		variables.put("candidateId", candidateId);
		variables.put("candidateScore", candidateScore);

		externalTaskService.complete(externalTask, variables); 

		logger.log(Level.INFO, "NOPE Rating Genrator External task is completed for Candidate {0} with rating {1}", new Object[]{candidateId, candidateScore});

	}

}