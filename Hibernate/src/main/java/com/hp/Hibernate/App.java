package com.hp.Hibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class App 
{  // beginning of the class App
    public static void main( String[] args )
    {  //beginning of the main method
         			
    	AnnotationConfiguration ac=new AnnotationConfiguration();
         ac.addAnnotatedClass(UserDetails.class);
         ac.addAnnotatedClass(Vehicle.class);
         ac.addAnnotatedClass(TwoWheeler.class);
         ac.addAnnotatedClass(FourWheeler.class);
         
         ac.configure("hibernate.cfg.xml");
         
         new SchemaExport(ac).create(true, true);
         
         SessionFactory sf=ac.buildSessionFactory();
         
         Session s=sf.openSession();
          
          Vehicle vehicle=new Vehicle();   
          vehicle.setVehicleName("Car");
       
          TwoWheeler bike=new TwoWheeler();
          bike.setVehicleName("Bike");
          bike.setSteeringHandle("Bike Steering Handle");
           
             
           FourWheeler car=new FourWheeler();
           
           car.setVehicleName("Porsche");
           car.setSteeringWheel("Porsche Steering Wheel");
      
           
       
         s.beginTransaction().commit();
         s.save(bike);
         s.save(car);
         
         s.close();
         
         
    } // closing of the main method
    
}  // closing of the class
