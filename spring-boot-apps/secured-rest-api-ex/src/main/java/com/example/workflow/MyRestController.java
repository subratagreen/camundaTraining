package com.example.workflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	
	@GetMapping("/myApp/message")
	String getMessage() {
		return "hello";
	}

}
