package com.spring.core.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.CDPlayer;
import com.spring.dao.ContactDAO;
import com.spring.dao.SpringJDBCContactDAO;

public class XMLTest {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		ContactDAO contactDAO = new SpringJDBCContactDAO();
		System.out.println(contactDAO.findAll());
	}
}