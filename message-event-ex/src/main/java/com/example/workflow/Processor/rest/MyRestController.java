package com.example.workflow.Processor.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.Processor.MessageProcessor;

@RestController
public class MyRestController {
	
	@Autowired
	MessageProcessor messageProcessor;
	
	// http://localhost:9090/createNewProcessor/processKey/messageEventExProcess/businessKey/X123
	
	@GetMapping("/createNewProcessor/processKey/{processKey}/businessKey/{businessKey}")
	public String callProcessor(@PathVariable("processKey") String processKey, @PathVariable("businessKey") String businessKey) {
		return messageProcessor.createNewProcess(processKey, businessKey);
	}
	
	// message-event-ex-process
	// http://localhost:9090/triggerMessageEvent/messageName/Message_one/businessKey/ABCD123
	
	@GetMapping("/triggerMessageEvent/messageName/{messageName}/businessKey/{businessKey}")
	public void triggerMessageEvent(@PathVariable("messageName") String messageName, @PathVariable("businessKey") String businessKey) {
		 messageProcessor.triggerMessageEvent(messageName, businessKey);
	}

}
