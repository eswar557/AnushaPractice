package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Component;

import com.spring.beans.ContactTelDetail;
@Component
public class SelectAllContactTelDeatils extends MappingSqlQuery<ContactTelDetail>{
	private static final String QUERY = "select * from contact_tel_detail";
	@Autowired
	public SelectAllContactTelDeatils(DataSource dataSource) {
		super(dataSource, QUERY);
	}
	@Override
	protected ContactTelDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
		ContactTelDetail contactTelDetail =  new ContactTelDetail();
		contactTelDetail.setContactId(rs.getLong("CONTACT_ID"));
		contactTelDetail.setId(rs.getLong("ID"));
		contactTelDetail.setTelType(rs.getString("TEL_TYPE"));
		contactTelDetail.setTelNumber(rs.getString("TEL_NUMBER"));
		return contactTelDetail;
	}

}
