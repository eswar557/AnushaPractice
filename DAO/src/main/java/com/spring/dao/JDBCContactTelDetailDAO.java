package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.beans.ContactTelDetail;

@Repository("contactTelDetailDAO")
public class JDBCContactTelDetailDAO implements ContactTelDetailDAO {
	
	public void create(ContactTelDetail contactTelDetail) {
		// TODO Auto-generated method stub

	}

	public ContactTelDetail get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ContactTelDetail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(ContactTelDetail contactTelDetail) {
		// TODO Auto-generated method stub

	}

	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
