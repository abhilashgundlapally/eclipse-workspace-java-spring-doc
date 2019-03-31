package com.java.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;

import com.java.spring.component.BusinessComponent;
import com.java.spring.component.impl.BusinessComponentImpl;
import com.java.spring.listener.SimpleMainListener;
import com.java.spring.listener.event.CustomApplicationEvent;

@Configuration
public class SimpleMainConfig {

	@Value("${spring-boot.custom.property}")
	private String property;

	@Bean
	// @Lazy
	public BusinessComponent getBusinessComponent(ApplicationEventPublisher appEventPublisher) {
		appEventPublisher.publishEvent(new CustomApplicationEvent(this, "AaronSwartz is back"));
		return new BusinessComponentImpl(property);
	}

	@Bean
	public SimpleMainListener getSimpleMainListener() {
		return new SimpleMainListener();
	}
}
