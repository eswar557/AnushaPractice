package com.spring.core.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Message;
import com.spring.core.CDPlayer;
import com.spring.core.Song;

public class JavaTest {
	public static Message singleTonMsg;
public static void main(String[] args) {
	ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
	Message message = context.getBean(Message.class); // obj created
	message.setMessage("Hello world"); // obj.message
	System.out.println("message: " + message);
	
	Message message1 = context.getBean(Message.class); // return obj;
	message1.setMessage("Hello");
	System.out.println("message1: " + message1);
	System.out.println("message: " + message);
}
}
