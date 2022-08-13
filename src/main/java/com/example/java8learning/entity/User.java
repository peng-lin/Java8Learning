package com.example.java8learning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * User
 * 用户测试类
 *
 * @author Peng Lin
 * 2022年 08月 10日 22:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
}
