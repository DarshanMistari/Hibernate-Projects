package com.config;
import com.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

    public static void main(String[] args) {

//        1. create the object of configuration class
        Configuration configuration = new Configuration();

//        2.call configure method
        configuration.configure("hibernate.cfg.xml");

//        3. call buildSessionFactory method
        SessionFactory factory= configuration.buildSessionFactory();

        System.out.println("Hibernate configured successfully");

//      4.
        Session session = factory.openSession();
//        save, update, delete, get,
//        we need to start the transaction to insert, update, and delete data

//      5.
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setId(2);
        student.setName("Kalpesh Mistari");
        student.setMarks(78.80);

        System.out.println("Data insert into database");
//        6. To save the data in table -> save method is depreceted old method
        session.save(student);

//        7. To save the data in database
        transaction.commit();

//        8. To closed the Session for the security
        session.close();

    }
}
