package org.capstore.service;

import org.capstore.dao.CustomerDao;
import org.capstore.dao.CustomerDaoImpl;
import org.capstore.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Transactional
	public boolean isvaliduser(Customer login) {
		
		return customerDao.isvaliduser(login);
	}

	
	
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
		
	}


}