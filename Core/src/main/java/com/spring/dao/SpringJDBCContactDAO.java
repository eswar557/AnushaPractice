package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.beans.Contact;

@Component("springDAO")
public class SpringJDBCContactDAO implements ContactDAO {

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Contact> findAll() {
		return this.jdbcTemplate.query("select * from contact", new RowMapper<Contact>() {
			public Contact mapRow(ResultSet resultSet, int arg1) throws SQLException {
				Contact contact = new Contact();
				contact.setId(resultSet.getLong("id"));
				contact.setFirstName(resultSet.getString("first_name"));
				contact.setLastName(resultSet.getString("last_name"));
				contact.setDateOfBirth(resultSet.getDate("birth_date"));
				return contact;
			}
		});
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
