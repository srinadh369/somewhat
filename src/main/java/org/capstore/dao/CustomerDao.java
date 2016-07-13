package org.capstore.dao;

import org.capstore.domain.Customer;

public interface CustomerDao {
	
	public boolean isvaliduser(Customer login);
	
	public void saveCustomer(Customer customer);
	

}
