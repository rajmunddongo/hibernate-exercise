package com.rajmi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Phone> telefonok = new ArrayList<>();
        telefonok.add(new Phone(101,"Iphone",11));
        telefonok.add(new Phone(102,"Samsung galaxy S",20));
        Friend barat1 = new Friend(
                1,
                "Lukács",
                "Máté",
                new Job(1,"Telekom","Budapest"));
        List<Friend> phoneSharers = new ArrayList<>();
        phoneSharers.add(barat1);
        for(Phone telefon : telefonok){telefon.setFriend(phoneSharers);}
        barat1.setPhone(telefonok);

        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Friend.class)
                .addAnnotatedClass(Phone.class)
                .addAnnotatedClass(Phone.class);
        StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(barat1);
        for(Phone telefon : telefonok){
            session.save(telefon);
        }

        transaction.commit();

        System.out.println(barat1);
    }
}
