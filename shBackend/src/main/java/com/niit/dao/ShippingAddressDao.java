package com.niit.dao;

import java.util.List;

import com.niit.model.ShippingAddress;

public interface ShippingAddressDao {

    public List<ShippingAddress> list();
    
    public List<ShippingAddress> list(String EmailId);
	
	public ShippingAddress getByShippingAddress(String shippingaddress);
	
	public ShippingAddress getByShippingId(int shippingid);
	
	public ShippingAddress getByUserName(String username);
	
	public ShippingAddress getByUserId(int userid);
	
	public void saveOrUpdate(ShippingAddress shippingaddress);
	
	public void delete(int shippingId);
	
	public void editShippingAddress(ShippingAddress shippingaddress);
}