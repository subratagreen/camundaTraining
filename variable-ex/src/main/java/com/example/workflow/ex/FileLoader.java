package com.example.workflow.ex;

import java.io.File;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.FileValue;
import org.springframework.stereotype.Component;

@Component
public class FileLoader implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		FileValue typedFileValue = Variables.fileValue("customerData.txt")
									.file(new File("src/main/resources/customerData.txt"))
									.mimeType("text/plain")
									.encoding("UTF-8")
									.create();

		execution.setVariable("fileVariable", typedFileValue);

	}

}
