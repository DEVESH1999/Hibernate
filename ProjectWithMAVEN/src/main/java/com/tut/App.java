package com.tut;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started.." );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Student st=new Student();
        st.setId(1);
        st.setName("Devesh");
        st.setCity("Lucknow");
        Student st1=new Student();
        st1.setId(2);
        st1.setName("Ashish");
        st1.setCity("Kolkata");
        Student st2=new Student();
        st2.setId(3);
        st2.setName("Deepak");
        st2.setCity("Mumabai");
        Student st3=new Student();
        st3.setId(4);
        st3.setName("Vishal");
        st3.setCity("Banglore");
        System.out.println(st);
        Session session=factory.openSession();
       Transaction tx= session.beginTransaction();
       session.save(st);
       tx.commit();
       session.close();
        factory.close();
    }
}
