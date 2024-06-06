package com.example.workflow.ut.service;

import org.springframework.stereotype.Service;

@Service
public class LdapService {
	
	public String getApprover() {
		System.out.println("getting approver....");
		// conclude approver		
		return "demo";
	}

}
