package com.java.spring.listener.anno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

//import com.java.spring.listener.event.CustomApplicationEvent;
import com.java.spring.listener.event.GenericSpringEvent;

public class SimpleMainListenerAnnotation {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleMainListenerAnnotation.class);
	
	@EventListener
	//@Async 
	//Need to add EnableAsync Application Level
	public void eventListenerAnnotation(ContextStartedEvent event) {
		logger.info("Inside SimpleMainListenerAnnotation  {} ", event.getTimestamp() );
	}
	
	@EventListener(condition = "#event.success")
	//@Async
	public void eventListenerAnnotationGeneric(GenericSpringEvent<String> event) {
		logger.info("Inside SimpleMainListenerAnnotation "+ event.getWhat() );
	}
}
