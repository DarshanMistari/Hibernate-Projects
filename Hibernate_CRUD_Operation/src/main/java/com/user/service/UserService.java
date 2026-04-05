package com.user.service;

import com.user.dao.UserDao;
import com.user.entity.User;

import java.util.List;

public class UserService {

    UserDao userDao = new UserDao();

    public String saveUser(User user){
       String msg =  userDao.saveUser(user);
        return msg;
    }

    public String updateUser(User user){
        String msg = userDao.updateUser(user);
        return msg;
    }

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    public String deleteUser(int id){
        return userDao.deleteUser(id);

    }
}
