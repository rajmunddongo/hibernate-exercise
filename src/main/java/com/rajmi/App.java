package com.rajmi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Friend barat1 = new Friend(1,"Lukács","Máté");

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Friend.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(barat1);

        transaction.commit();
    }
}
