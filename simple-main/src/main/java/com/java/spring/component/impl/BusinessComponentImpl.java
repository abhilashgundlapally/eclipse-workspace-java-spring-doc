package com.java.spring.component.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;

import com.java.spring.component.BusinessComponent;
import com.java.spring.listener.event.CustomApplicationEvent;

public class BusinessComponentImpl implements BusinessComponent {

	private static final Logger logger = LoggerFactory.getLogger(BusinessComponentImpl.class);
	
	private String name;

	public BusinessComponentImpl() { }

	public BusinessComponentImpl(String name) {
		logger.info(name);
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	
}
