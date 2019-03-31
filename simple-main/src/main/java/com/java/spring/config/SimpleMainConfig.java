package com.java.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.java.spring.component.BusinessComponent;
import com.java.spring.component.impl.BusinessComponentImpl;

@Configuration
public class SimpleMainConfig {

	@Value("${spring-boot.custom.property}")
	private String property;
	
	@Bean
	@Lazy
	public BusinessComponent getBusinessComponent() {
		return new BusinessComponentImpl(property);
	}
}
