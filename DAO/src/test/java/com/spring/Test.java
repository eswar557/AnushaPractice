package com.spring;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Contact;
import com.spring.config.Config;
import com.spring.dao.ContactDAO;
import com.spring.dao.JDBCContactDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Contact contact = context.getBean(Contact.class);
		contact.setId(6L);
		contact.setFirstName("Anusha");
		contact.setLastName("");
		contact.setDateOfBirth(new Date());
		
		ContactDAO contactDAO = context.getBean(JDBCContactDAO.class);
		
		// Create
		contactDAO.create(contact);
		
		// Get
		System.out.println(contactDAO.get(4L));
		
		// Get All
		System.out.println(contactDAO.getAll());
		
	}
}
