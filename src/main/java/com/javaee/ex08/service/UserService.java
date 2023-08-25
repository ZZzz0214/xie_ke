package com.javaee.ex08.service;

import com.javaee.ex08.po.User;

import java.util.List;

public interface UserService {
    User findUserById(int id);
    List<User> findUserAll();
    int userSignUp(User user);
}
