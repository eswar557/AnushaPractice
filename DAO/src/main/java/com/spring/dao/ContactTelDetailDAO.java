package com.spring.dao;

import java.util.List;

import com.spring.beans.ContactTelDetail;

public interface ContactTelDetailDAO {
	public void create(ContactTelDetail contactTelDetail);

	public ContactTelDetail get(Long id);

	public List<ContactTelDetail> getAll();

	public void update(ContactTelDetail contactTelDetail);

	public void delete(Long id);
}
