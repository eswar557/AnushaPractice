package com.param.hib;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.param.hib.beans.Contact;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {
		Contact contact1 = new Contact();
		contact1.setDateOfBirth(new Date());
		contact1.setFirstName("Parameswar");
		contact1.setLastName("A");
		System.out.println(contact1);
		//Default names for config files
		// 1. hibernate.properties
		// 2. hibernate.cfg.xml
		Configuration configuration = new Configuration().configure("config.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session =  sessionFactory.openSession();
		//Optional
		Transaction transaction = session.beginTransaction();
		session.save(contact1);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
