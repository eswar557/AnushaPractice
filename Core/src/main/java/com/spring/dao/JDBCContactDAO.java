package com.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.beans.Contact;
@Component("jdbcDAO")
public class JDBCContactDAO implements ContactDAO {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
	}

	private void closeConnection(Connection connection) {
		if (connection == null)
			return;
		try {
			connection.close();
		} catch (SQLException ex) {
			// noop
		}
	}

	public List<Contact> findAll() {
		List<Contact> contactList = new ArrayList<Contact>();
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from contact");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Contact contact = new Contact();
				contact.setId(resultSet.getLong("id"));
				contact.setFirstName(resultSet.getString("first_name"));
				contact.setLastName(resultSet.getString("last_name"));
				contact.setDateOfBirth(resultSet.getDate("birth_date"));
				contactList.add(contact);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return contactList;
	}

	public List<Contact> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Contact contact) {
		// TODO Auto-generated method stub

	}

	public void update(Contact contact) {
		// TODO Auto-generated method stub

	}

	public void delete(Integer contactId) {
		// TODO Auto-generated method stub

	}

}
