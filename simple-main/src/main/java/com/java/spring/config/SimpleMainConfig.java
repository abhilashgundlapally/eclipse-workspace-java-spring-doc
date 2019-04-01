package com.java.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

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
	
	@Bean(name="applicationEventMulticaster")
	public ApplicationEventMulticaster getMulticaster() {
		SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
		eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
		return eventMulticaster;
	}
}
