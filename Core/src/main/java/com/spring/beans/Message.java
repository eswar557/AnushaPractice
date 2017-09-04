package com.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Singleton: Every time container will return the same instance and any modification on this object will reflect every where through out application
 * Prototype: For every 'getBean' request, application context will create new object and return that object
 */
@Component
@Scope("prototype")
public class Message {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}
