package com.java.spring.component.impl;

import com.java.spring.component.BusinessComponent;

public class BusinessComponentImpl implements BusinessComponent {

	private String name;

	public BusinessComponentImpl() { }

	public BusinessComponentImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
