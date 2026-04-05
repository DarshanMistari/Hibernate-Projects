package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;

import java.util.List;

public class UserController {

    UserService userService = new UserService();

    public String saveUser(User user){
       String msg =  userService.saveUser(user);
       return msg;
    }

    public String updateUser(User user){
        String msg = userService.updateUser(user);
        return msg;
    }

    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    public String deleteUser(int id) {
        return userService.deleteUser(id);
    }

}
