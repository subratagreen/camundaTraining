package com.example.workflow.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.service.ProcessFlowService;

@RestController
public class OrderControler {
	
	@Autowired
	ProcessFlowService processFlowService;
	
	@GetMapping("/startOrderProcess")
	public String startOrderProcess() {
		return "Business Key: "+processFlowService.startOrderProcessFlow();
	}

}
