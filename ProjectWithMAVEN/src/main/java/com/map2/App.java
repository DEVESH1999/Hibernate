package com.map2;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	 public static void main( String[] args ) {
	System.out.println( "Project started.." );
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
question q1=new question();
answer a1=new answer();
q1.setQuestionId(101);
q1.setQuestion("concept of OOPs");
a1.setAnswerId(5);
a1.setAnswer("inheritance");
a1.setQuestion(q1);
answer a2=new answer();
a2.setAnswerId(10);
a2.setAnswer("encapsulation");
a2.setQuestion(q1);
answer a3=new answer();
a3.setAnswerId(15);
a3.setAnswer("polymorphism");
a3.setQuestion(q1);
answer a4=new answer();
a4.setAnswerId(20);
a4.setAnswer("abstraction");
a4.setQuestion(q1);
ArrayList<answer>list=new ArrayList<answer>();
list.add(a1);
list.add(a2);
list.add(a3);
list.add(a4);
q1.setAnswers(list);
Session s=factory.openSession();
Transaction tx=s.beginTransaction();
s.save(q1);
s.save(a1);
s.save(a2);
s.save(a3);
s.save(a4);
tx.commit();
s.close();
factory.close();
}
}