package com.javaee.demo.mapper;

import com.javaee.demo.po.User;

import java.util.List;

public interface UserMapper {
    User findUserById(int userID);
    List<User> findUserAll();
    int userSignUp(User user);
}
