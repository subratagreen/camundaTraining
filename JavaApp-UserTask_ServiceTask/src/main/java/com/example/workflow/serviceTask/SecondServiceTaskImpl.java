package com.example.workflow.serviceTask;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service("secondServiceTaskImpl")
public class SecondServiceTaskImpl {

	Logger logger = Logger.getLogger("SecondServiceTaskImpl");
	
	public void doSomething() {
		logger.info("SecondServiceTaskImpl called.. ");
	}

}
