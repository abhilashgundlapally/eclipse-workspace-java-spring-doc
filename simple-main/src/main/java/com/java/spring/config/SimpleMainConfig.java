package com.java.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.spring.component.BusinessComponent;
import com.java.spring.component.impl.BusinessComponentImpl;

@Configuration
public class SimpleMainConfig {

	@Bean
	public BusinessComponent getBusinessComponent() {
		return new BusinessComponentImpl("Aaron Swartz");
	}
}
