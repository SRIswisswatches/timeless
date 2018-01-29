package com.niit.dao;

import java.util.List;

import com.niit.model.Role;

public interface RoleDao {

	public List<Role> list();	
	
	public Role getByUName(String username);
	
	public Role getByEmail(String email);
	
	public void saveOrUpdate(Role role);
		
    public void delete(String username);
}