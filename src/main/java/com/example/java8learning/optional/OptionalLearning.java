package com.example.java8learning.optional;

import com.example.java8learning.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * OptionalLearning
 * 学习Optional用法
 *
 * @author Peng Lin
 * 2022年 08月 10日 22:34
 */
public class OptionalLearning {

    public static void main(String[] args) {
        User user1 = new User(1, "xiaoming");
        User user2 = null;
        // ofNullable是进行对象的判空逻辑, 前者不管是否为空,orElse(方法)都会执行内部的方法,
        // 但是结果返回还是前者, 不会返回内部方法的结果
        // 前者为空,orElseGet(lambda表达式)则会进行操作

        User user5 = Optional.ofNullable(user1).orElse(createUser());
        System.out.println(user5);
        User user4 = Optional.ofNullable(user2).orElse(createUser());
        System.out.println(user4);
        User user3 = Optional.ofNullable(user1).orElseGet(() -> createUser());
        System.out.println(user3);
        User user = Optional.ofNullable(user2).orElseGet(() -> createUser());
        System.out.println(user);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user3);
        List<User> userLists = new ArrayList<>();
        Optional.ofNullable(user).ifPresent(userLists::add);

        // TODO JPA

    }

    private static User createUser() {
        System.out.println("执行了createUser()");
        return new User(2, "xiaohong");
    }

}

