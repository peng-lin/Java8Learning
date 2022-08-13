package com.example.java8learning.service.impl;

import com.example.java8learning.entity.User;
import com.example.java8learning.service.CreateUser;

/**
 * CreateUserImpl
 *
 * @author Peng Lin
 * 2022年 08月 10日 22:56
 */
public class CreateUserImpl implements CreateUser {
    @Override
    public User createUser() {
        return new User(1,"xiaohong");
    }
}
