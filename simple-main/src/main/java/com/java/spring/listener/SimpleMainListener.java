package com.java.spring.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SimpleMainListener implements ApplicationListener<ApplicationEvent>{

	private static final Logger logger = LoggerFactory.getLogger(SimpleMainListener.class);
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		logger.info("Inside SimpleMainListener");
	}

}
