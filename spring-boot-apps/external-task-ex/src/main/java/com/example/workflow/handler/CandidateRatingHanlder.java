package com.example.workflow.handler;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("candidateRating") 
public class CandidateRatingHanlder implements ExternalTaskHandler {

	Logger logger = Logger.getLogger("CandidateRatingHanlder");
	@Override
	public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
		
		logger.log(Level.INFO, "CandidateRatingHanlder is ready to handle ... ");
		
		 int candidateScore = externalTask.getVariable("candidateScore");

		  //Logic to process based on rating goes here
		 
		 externalTaskService.complete(externalTask);
		 
		 logger.log(Level.INFO, "Processing candidate Score received {0}", new Object[]{ candidateScore});

	}

}
