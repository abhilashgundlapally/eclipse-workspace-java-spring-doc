package com.java.spring.component.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.java.spring.component.BusinessComponent;

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
