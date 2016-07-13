package org.capstore.dao;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.capstore.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	
	@Transactional
	public boolean isvaliduser(Customer login) {
		
			Session session=this.sessionFactory.getCurrentSession();
			session.beginTransaction();
			String sql = "select email_id,password from Customer where"
					+ " email_id='"+ login.getEmail_id()+"'"
					+ " and password='"+ login.getPassword()+"'";
			
			    
			
			List <Objects []> rows = sessionFactory.getCurrentSession().createQuery(sql).list();
		
			
			if(rows.isEmpty())
				return false;
			else
				return true;
		
	}
	
	
	 @Transactional
		@Override
		public void saveCustomer(Customer customer) {
			
		 	String staticPart = "http://www.yoursite.com/foo/";

				//randomly generate the integer number and store in variable (e.g. ranNum)

				int ranNum = (int) (Math.random()*1000);
				String finalURL = staticPart + Integer.toString(ranNum);
		 
		  Session session = this.sessionFactory.getCurrentSession();
		    session.beginTransaction();
			customer.setRegdate(new Date());
			customer.setVerification_code(finalURL);
			customer.setEmail_verified(0);
			
			
			int car=(int) (Math.random()*5000);
			
			customer.setCart_id(car);
			
			
			
			sessionFactory.getCurrentSession().save(customer);
		

	 }	

}
	
	
	
	
	
	


