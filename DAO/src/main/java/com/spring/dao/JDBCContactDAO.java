package com.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Component;

import com.spring.beans.Contact;
import com.spring.exception.translators.MyExceptionTranslator;
import com.spring.mappers.ContactRowMapper;

@Component("jdbcContactDAO")
public class JDBCContactDAO implements ContactDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	// <bean class="com.spring.dao.JDBCContactDAO" id="jdbcContactDAO">
	//		<property name="dataSource" ref="dataSource"></property>
	//</bean>
	public void setDataSource(DataSource dataSource) {
		// This will help us to connect to database
		this.dataSource = dataSource;
		// This will handle all types of repetitive work like create connection,
		// close connection etc
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		MyExceptionTranslator exceptionTranslator = new MyExceptionTranslator();
		this.jdbcTemplate.setExceptionTranslator(exceptionTranslator);
	}

	public void create(Contact contact) {
		this.jdbcTemplate.update("INSERT INTO CONTACT (ID, FIRST_NAME, LAST_NAME, BIRTH_DATE) VALUES(?, ?, ?, ?)",
				contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getDateOfBirth());

	}

	public Contact get(Long id) {
		/*
		 * Class[] name = new Class[size];
		 * name[0] = 'name';
		 * 
		 * Class[] name = new Class[]{1,2,3};
		 * 
		 * Class[] name = {1,2,3};
		 */
		Object[] args = {id};
		return this.jdbcTemplate.queryForObject("select * from contact where id = ?", args, new ContactRowMapper());

		/*
		 * return
		 * this.jdbcTemplate.queryForObject("select * from contact where id = ?"
		 * , args, new RowMapper<Contact>() {
		 * 
		 * public Contact mapRow(ResultSet rs, int arg1) throws SQLException {
		 * Contact contact = new Contact(); contact.setId(rs.getLong("ID"));
		 * contact.setFirstName(rs.getString("FIRST_NAME"));
		 * contact.setLastName(rs.getString("LAST_NAME"));
		 * contact.setDateOfBirth(rs.getDate("BIRTH_DATE")); return contact; }
		 * });
		 */
	}

	public List<Contact> getAll() {
		return this.jdbcTemplate.query(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				return con.prepareStatement("select * from contact");
			}
		}, new ContactRowMapper());
	}

	public void update(Contact contact) {
		this.jdbcTemplate.update("UPDATE CONTACT SET LAST_NAME = ?, FIRST_NAME = ? WHERE ID = ?", contact.getLastName(), contact.getFirstName(), contact.getId());

	}

	public void delete(Long id) {
		this.jdbcTemplate.update("DELETE FROM CONTACT WHERE ID = ?", id);
	}

}
