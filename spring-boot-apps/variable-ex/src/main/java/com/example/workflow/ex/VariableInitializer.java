package com.example.workflow.ex;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HexFormat;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class VariableInitializer implements JavaDelegate {
	
	boolean booleanVar; // Instances of java.lang.Boolean
	byte[] bytesVar; //: Instances of byte[]
	short shortVar; //: Instances of java.lang.Short
	int intVar; //: Instances of java.lang.Integer
	long longVar; // : Instances of java.lang.Long
	double doubleVar; //: Instances of java.lang.Double
	Date dateVar; // : Instances of java.util.Date
	String stringVar; // Instances of java.lang.String

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		booleanVar = true;
		
		bytesVar = HexFormat.of().parseHex("e04fd020ea3a6910a2d808002b30309d");
		
		shortVar = 1;
		
		intVar = 100;
		
		longVar = 12;

		doubleVar = 12.12;
		
		dateVar = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		stringVar = "Subrat";
		
		execution.setVariable("booleanVar", booleanVar);
		execution.setVariable("bytesVar", bytesVar);
		execution.setVariable("shortVar", shortVar);
		execution.setVariable("intVar", intVar);
		execution.setVariable("longVar", longVar);
		execution.setVariable("doubleVar", doubleVar);
		execution.setVariable("dateVar", dateVar);
		execution.setVariable("stringVar", stringVar);
		
		
		Customer customer = new Customer("subrat", "C001", 35);
		
		execution.setVariable("customer", customer);
		
	}
	
	

}
