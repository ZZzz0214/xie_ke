package com.javaee.ex08.mapper;

import com.javaee.ex08.po.User;

import java.util.List;

public interface UserMapper {
    User findUserById(int userID);
    List<User> findUserAll();
    int userSignUp(User user);
}
