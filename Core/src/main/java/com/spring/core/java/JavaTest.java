package com.spring.core.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.CDPlayer;
import com.spring.dao.ContactDAO;

public class JavaTest {
public static void main(String[] args) {
	ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
	ContactDAO dao = (ContactDAO) context.getBean("jdbcDAO");
	System.out.println(dao.findAll());
}
}
