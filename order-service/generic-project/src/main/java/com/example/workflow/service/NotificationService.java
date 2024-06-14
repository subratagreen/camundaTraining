package com.example.workflow.service;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements JavaDelegate {

	Logger logg = Logger.getLogger("OrderPaymentService");

	@Override
	public void execute(DelegateExecution execution) {
		String paymentRefId = (String) execution.getVariable("paymentRefId");

		String orderId = (String) execution.getVariable("orderId");

		logg.info("Order ID - " + orderId + " | paymentRefId - " + paymentRefId + " | Payment Failed.");

	}

}