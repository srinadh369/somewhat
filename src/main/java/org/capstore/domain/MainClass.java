package org.capstore.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfiguration config=new AnnotationConfiguration();
		AnnotationConfiguration config1=new AnnotationConfiguration();
		AnnotationConfiguration config2=new AnnotationConfiguration();
		config.addAnnotatedClass(Admin.class);
		config.configure();
		
		//Re-create the schema EveryTime
		new SchemaExport(config).create(true, true);
		
		
		config1.addAnnotatedClass(Merchant.class);
		config1.configure();
		new SchemaExport(config1).create(true, true);
		
		
		config2.addAnnotatedClass(Customer.class);
		config2.configure();
		new SchemaExport(config2).create(true, true);
		/*//Session Factory
		SessionFactory factory= config.buildSessionFactory();
		
		//Session and Transaction
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(student);
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		session.getTransaction().commit();
		*/
		/*session.close();*/
	}

}
