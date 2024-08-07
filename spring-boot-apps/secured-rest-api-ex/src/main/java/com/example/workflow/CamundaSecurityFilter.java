package com.example.workflow;


import org.camunda.bpm.engine.rest.security.auth.ProcessEngineAuthenticationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.servlet.Filter;

@Configuration
public class CamundaSecurityFilter {

	@Bean
	FilterRegistrationBean<Filter> processEngineAuthenticationFilter() {
		FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
		registration.setName("camunda-auth");
		registration.setFilter(getProcessEngineAuthenticationFilter());
		registration.addInitParameter("authentication-provider",
				"org.camunda.bpm.engine.rest.security.auth.impl.HttpBasicAuthenticationProvider");
		registration.addUrlPatterns("/engine-rest/*");
		registration.setOrder(1);
		return registration;
	}

	@Bean
	Filter getProcessEngineAuthenticationFilter() {
		return new ProcessEngineAuthenticationFilter();
	}
}