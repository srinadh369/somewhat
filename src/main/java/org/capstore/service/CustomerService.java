package org.capstore.service;



import org.capstore.domain.Customer;

public interface CustomerService {
	
	public boolean isvaliduser(Customer login);
	
	public void saveCustomer(Customer customer);
	
	
}