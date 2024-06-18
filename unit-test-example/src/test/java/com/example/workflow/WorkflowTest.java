package com.example.workflow;

import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.assertThat;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.test.mock.Mocks;
import org.camunda.bpm.spring.boot.starter.test.helper.AbstractProcessEngineRuleTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.workflow.service.ServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WorkflowTest extends AbstractProcessEngineRuleTest {

	@Autowired
	public RuntimeService runtimeService;

	@Autowired
	ProcessEngine engine;

	@Test
	public void shouldExecuteHappyPath() {
		// given
		String processDefinitionKey = "my-project-process";
		
		
		Mocks.register("serviceImpl", new ServiceImpl());

		// when
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(processDefinitionKey);

		// then
		assertThat(processInstance).isStarted()
				.task()
				.hasDefinitionKey("say-hello-1")
				.hasCandidateUser("demo")
				.isNotAssigned();

		String processInstanceId = processInstance.getId();

		TaskService taskService = engine.getTaskService();
		Task task = taskService.createTaskQuery()
						.processInstanceId(processInstanceId)
						.taskDefinitionKey("say-hello-1")
						.singleResult();
		engine.getTaskService().complete(task.getId());

		System.out.println("first user task completed, for processInstanceId- "+processInstanceId);
		
		
		assertThat(processInstance)
			.hasVariables("value")
			.toString()
			.equals("10");

		// then
		assertThat(processInstance).isStarted()
				.task()
				.hasDefinitionKey("Activity_1okwl0w")
				.isAssignedTo("demo");
		
		task = taskService.createTaskQuery()
				.processInstanceId(processInstanceId)
				.taskDefinitionKey("Activity_1okwl0w")
				.singleResult();
		
		engine.getTaskService().complete(task.getId());
		
		System.out.println("second user task completed, for processInstanceId- "+processInstanceId);

	}

}
