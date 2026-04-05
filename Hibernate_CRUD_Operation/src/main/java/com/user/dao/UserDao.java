package com.user.dao;

import com.config.HibernateConfig;
import com.user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {

    SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

    public String saveUser(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);
        transaction.commit();
        session.close();
        return "User save SuccessFully";
    }


    public String updateUser(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User existingUser =  session.get(User.class,user.getId());
        existingUser.setId(user.getId());
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        existingUser.setEmail(user.getEmail());
        existingUser.setAddress(user.getAddress());

        session.update(existingUser);
        transaction.commit();
        session.close();

        return "Update SuccessFully";
    }

    public List<User> getAllUser(){
        Session session = sessionFactory.openSession();
//        HQL - Hibernate Query language - from User
//        SQl - Structure Query Language - select * from user
       List<User> userList = session.createQuery("from User").list();

        return userList;
    }

    public String deleteUser(int id){

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = session.get(User.class,id);

        session.delete(user);
        transaction.commit();
        session.close();

        return "Delete User SuccessFully";
    }
}
