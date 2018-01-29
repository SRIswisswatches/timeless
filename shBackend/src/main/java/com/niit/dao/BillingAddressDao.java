package com.niit.dao;

import java.util.List;

import com.niit.model.BillingAddress;

public interface BillingAddressDao {

	public List<BillingAddress> list();
	
	public BillingAddress getByBillId(int billid);		
	
	public BillingAddress getByBillingAddress(String billingaddress);	
	
    public BillingAddress getByContactNumber(int contactnumber);
    
	public void saveOrUpdate(BillingAddress billingaddress);
		
	public void delete(String BillingAddress);
	
	public void editBillingAddress(BillingAddress billingaddress);
}