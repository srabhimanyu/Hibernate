package com.dbi.entity;

import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Hbt151 {

	
	public static void main(String args[]) {
		
		AnnotationConfiguration ac=new AnnotationConfiguration();
		ac.addAnnotatedClass(UserDetails.class);	
		ac.configure();
		
		 new SchemaExport(ac).create(true, true);
		
		SessionFactory sf=ac.buildSessionFactory();
		Session s=sf.openSession();
		
		
        UserDetails user=new UserDetails();
     
        
        user.setUsername("First User");
    
        UserDetails user2=new UserDetails();
        user2.setUsername("Second User");
        
		Address addr=new Address();
		
		addr.setStreet("Street Name");
		addr.setCity("City Name");
		
		user.setAddress(addr);
		
        s.save(user);
        s.save(user2);
        
        
        s.beginTransaction().commit();
        
        s.close();
		
	}
	
	
}
