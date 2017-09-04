package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Contact;
import com.spring.config.Config;
import com.spring.dao.ContactDAO;
import com.spring.dao.JDBCContactDAO;
import com.spring.dao.SelectAllContactTelDeatils;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		ContactDAO contactDAO = context.getBean(ContactDAO.class);
		Contact contact = contactDAO.get(1L);
		contact.getContactTelDetails().get(1).getTelNumber();
		
	}
}
