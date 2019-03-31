package com.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.java.spring.config.CustomPropertySource;
import com.java.spring.config.SimpleMainConfig;

@Configuration
@EnableAutoConfiguration
@Import({ SimpleMainConfig.class,CustomPropertySource.class })
public class SimpleMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMainApplication.class, args);
	}

}
