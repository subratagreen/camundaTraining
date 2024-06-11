package com.example.workflow;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
    
	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	
	System.out.println("processEngine ------ "+processEngine);

    
  }

}