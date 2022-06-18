package com.hib.HibernateSec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started" );
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        Student st=new Student(101,"Ram","Mumbai");
        Transaction t=s.beginTransaction();
        
        s.save(st);
        t.commit();
        
        s.close();
        factory.close();
    }
}
