package org.capstore.dao;


import java.util.List;
import java.util.Objects;

import org.capstore.domain.Merchant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class MerchantDaoImpl implements MerchantDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Integer isvaliduser(Merchant login) {
		
		
		Integer merchant=0;
		Session session=this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		
		
		
			Session session1=this.sessionFactory.getCurrentSession();
			session1.beginTransaction();
			String sql = "select merchant_id,email_id,password from Merchant where"
					+ " email_id='"+ login.getEmail_id()+"'"
					+ " and password='"+ login.getPassword()+"'";
			
			    
			
			List <Objects []> rows = sessionFactory.getCurrentSession().createQuery(sql).list();
		
			for(Object [] row : rows)
			{
				if(login.getEmail_id().equals(row[1])&&login.getPassword().equals(row[2]))
				{System.out.println(row[1]);
					System.out.println(row[2]);
					 merchant=(Integer) row[0];
					System.out.println(row[0]);
				}
				
			}
			
			

			
			
			return merchant;
	}
	
	@Transactional
	@Override
	public void saveMerchant(Merchant merchant) {
		
	 	
	  Session session = this.sessionFactory.getCurrentSession();
	    session.beginTransaction();
	   
	    merchant.setEmail_verified(0);
		
	
		
		sessionFactory.getCurrentSession().save(merchant);
		//session.getTransaction().commit();

		
	}
	
	
	
	
}