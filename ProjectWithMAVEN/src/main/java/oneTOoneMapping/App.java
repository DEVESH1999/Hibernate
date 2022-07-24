package oneTOoneMapping;

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
q1.setQuestionId(10);
q1.setQuestion("what is java ?");
a1.setAnswerId(5);
a1.setAnswer("java is an OOP based programming language");
q1.setAnswer(a1);
question q2=new question();

q2.setQuestionId(6);
q2.setQuestion("full form of OOP");
answer a2=new answer();
a2.setAnswerId(15);
a2.setAnswer("object oriented programming");
q2.setAnswer(a2);
Session s=factory.openSession();
Transaction tx=s.beginTransaction();
s.save(q1);
s.save(q2);
tx.commit();
s.close();
factory.close();
}
}
