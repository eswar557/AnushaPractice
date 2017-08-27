package com.spring.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.beans.Contact;

public class ContactRowMapper implements RowMapper<Contact> {

	public Contact mapRow(ResultSet rs, int arg1) throws SQLException {
		Contact contact = new Contact();
		contact.setId(rs.getLong("ID"));
		contact.setFirstName(rs.getString("FIRST_NAME"));
		contact.setLastName(rs.getString("LAST_NAME"));
		contact.setDateOfBirth(rs.getDate("BIRTH_DATE"));
		return contact;
	}

}
