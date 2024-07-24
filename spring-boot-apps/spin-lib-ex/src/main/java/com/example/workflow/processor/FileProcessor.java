package com.example.workflow.processor;

import static org.camunda.spin.Spin.JSON;
import static org.camunda.spin.Spin.XML;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.xml.SpinXmlElement;
import org.springframework.stereotype.Component;

@Component("fileProcessor")
public class FileProcessor implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		ByteArrayInputStream fileData = (ByteArrayInputStream) execution.getVariable("fileData");
		InputStreamReader reader = new InputStreamReader(fileData, "utf-8"); 
		
		// converting reader(xml content) to xml
		SpinXmlElement xml = XML(reader);
		System.out.println(xml);
		
		// mapping xml to Java object
		Order order = XML(xml).mapTo(Order.class);
		System.out.println(order);
		
		// converting object to Json
		String jsonData = JSON(order).toString();
		execution.setVariable("jsonData", jsonData);
		System.out.println(jsonData);
	}

}
