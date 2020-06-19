package com.dbi.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class App 
{
    public static void main( String[] args )
    {
      
    	AnnotationConfiguration ac=new AnnotationConfiguration();
    	ac.addAnnotatedClass(Employee.class);
    	
    	ac.configure("hibernate.cfg.xml");
    	
    	// new SchemaExport(ac).create(true,true);
    	
    	SessionFactory sf=ac.buildSessionFactory();
    	Session s=sf.openSession();
    	
    	//Employee e=(Employee)s.get(Employee.class, 1002);
    //	e.setEmail("xyz@gmail.com");
    	
    	/*
    	Employee e=new Employee();
    	e.setEid(1003);
    	e.setFname("Abhishek");
    	e.setLname("Chaudhary");
    	e.setEmail("zya@gmail.com");
    	
    	
    	
    	s.save(e);
    	s.beginTransaction().commit();
    	*/
    	
    	List<Employee> es=s.createQuery("from com.dbi.entity.Employee").list();
    	
    	for(Employee e:es) 
    		System.out.println(e.getEid()+" "+e.getFname()+" "+e.getLname()+" "+e.getEmail());
    	
    	
    	
    }
}
