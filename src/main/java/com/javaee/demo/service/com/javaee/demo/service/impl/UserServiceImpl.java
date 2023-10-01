package com.javaee.demo.service.com.javaee.demo.service.impl;

import com.javaee.demo.mapper.UserMapper;
import com.javaee.demo.po.User;
import com.javaee.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT, readOnly = false)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper UserMapper;
    public User findUserById(int id){
        return UserMapper.findUserById(id);
    }
    public  List<User> findUserAll(){
        return UserMapper.findUserAll();
    }
    public int  userSignUp(User user){
        return UserMapper.userSignUp(user);
    }
}
