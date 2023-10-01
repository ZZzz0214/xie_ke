package com.javaee.demo.service;

import com.javaee.demo.po.User;

import java.util.List;

public interface UserService {
    User findUserById(int id);
    List<User> findUserAll();
    int userSignUp(User user);
}
