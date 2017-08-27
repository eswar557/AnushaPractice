package com.spring.dao;

import java.util.List;

import com.spring.beans.Contact;
public interface ContactDAO {
	// C - create or insert
	// R - Read or get, getAll or findAll
	// U - Update
	// D - delete, deleteAll
	public void create(Contact contact);
	
	public Contact get(Long id);
	
	public List<Contact> getAll();
	
	public void update(Contact contact);
	
	public void delete(Long id);
}
