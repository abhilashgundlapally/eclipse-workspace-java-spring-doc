package com.java.spring.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

import com.java.spring.listener.event.CustomApplicationEvent;

public class SimpleMainListener implements ApplicationListener<CustomApplicationEvent> {

	private static final Logger logger = LoggerFactory.getLogger(SimpleMainListener.class);

	@Override
	public void onApplicationEvent(CustomApplicationEvent event) {
		logger.info("Inside SimpleMainListener : " + event.getName());
	}

}
