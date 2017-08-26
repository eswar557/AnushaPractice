package com.spring.dao;

import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args) throws SQLException {
		ContactDAO contactDAO = new SpringJDBCContactDAO();
		System.out.println(contactDAO.findAll());
	}
}
