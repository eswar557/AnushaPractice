package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.Config;
import com.spring.dao.ContactDAO;
import com.spring.dao.JDBCContactDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		ContactDAO contactDAO = context.getBean(JDBCContactDAO.class);
		
		contactDAO.delete(6L);
	}
}
