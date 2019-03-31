package com.java.spring.listener.event;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent extends ApplicationEvent {
	private static final long serialVersionUID = -3456898926059477168L;

	private String name;
	
	public CustomApplicationEvent(String source) {
		super(source);
		this.setName(source);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
