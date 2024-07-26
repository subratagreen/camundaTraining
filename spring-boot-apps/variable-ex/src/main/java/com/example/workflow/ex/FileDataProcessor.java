package com.example.workflow.ex;

import static org.camunda.spin.Spin.JSON;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;
import org.springframework.stereotype.Component;

@Component
public class FileDataProcessor implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		ByteArrayInputStream bis =  (ByteArrayInputStream) execution.getVariable("fileVariable");

		InputStreamReader reader = new InputStreamReader(bis);

		SpinJsonNode json = JSON(reader);
		String name = json.prop("name").stringValue();
		String id = json.prop("id").stringValue();
		int age = json.prop("age").numberValue().intValue();

		Customer customer = new Customer(name, id, age);

		execution.setVariable("customer", customer);
		
		reader.close();
		bis.close();
		
		// save in database 

	}

}
