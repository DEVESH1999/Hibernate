package com.map3;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	
	    public static void main( String[] args )
	    {
	        System.out.println( "Project started.." );
	        Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        bank b1=new bank();
	        b1.setBank_code(10);
	        b1.setBankName("SBI");
	        bank b2=new bank();
	        b2.setBank_code(20);
	        b2.setBankName("BOB");
	        bank b3=new bank();
	        b3.setBank_code(30);
	        b3.setBankName("UNION");
	        bank b4=new bank();
	        b4.setBank_code(40);
	        b4.setBankName("HDFC");
	        bank b5=new bank();
	        b5.setBank_code(50);
	        b5.setBankName("AXIS");
	        customer c1=new customer();
	        c1.setCust_id(101);
	        c1.setCust_name("RAJEEV");
	        
	        customer c2=new customer();
	        c2.setCust_id(102);
	        c2.setCust_name("AJAY");
	        
	        customer c3=new customer();
	        c3.setCust_id(103);
	        c3.setCust_name("ANKIT");
	        customer c4=new customer();
	        c4.setCust_id(104);
	        c4.setCust_name("ASHISH");
	        customer c5=new customer();
	        c5.setCust_id(105);
	        c5.setCust_name("RAHUL");
	       
	        ArrayList<bank>bank=new ArrayList<bank>();
	        bank.add(b1);
	        bank.add(b2);
	        bank.add(b3);
	        bank.add(b4);
	        bank.add(b5);
	        ArrayList<customer>customer=new ArrayList<customer>();
	       customer.add(c1);
	       customer.add(c2);
	       customer.add(c3);
	       customer.add(c4);
	       customer.add(c5);
	        b1.setCustomer(customer);
	        b2.setCustomer(customer);
	        b3.setCustomer(customer);
	        b4.setCustomer(customer);
	        b5.setCustomer(customer);
	        c4.setBank(bank);
	        c5.setBank(bank);
	        c1.setBank(bank);
	        c2.setBank(bank);
	        c3.setBank(bank);
	       Session session=factory.openSession();
	       Transaction tx= session.beginTransaction();
	       session.save(b1);
	       session.save(b2);
	       session.save(b3);
	       session.save(b4);
	       session.save(b5);
	       session.save(c1);
	       session.save(c2);
	       session.save(c3);
	       session.save(c4);
	       session.save(c5);
	       tx.commit();
	    
	       session.close();
	        factory.close();
	    }

}
