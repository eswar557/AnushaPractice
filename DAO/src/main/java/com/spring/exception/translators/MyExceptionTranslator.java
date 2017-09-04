package com.spring.exception.translators;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.SQLExceptionTranslator;

public class MyExceptionTranslator implements SQLExceptionTranslator{

	public DataAccessException translate(String task, String sql, SQLException ex) {
		// TODO Auto-generated method stub
		return null;
	}

}
