package com.atguigu.springboot.service;

import com.atguigu.springboot.domain.User;

import java.util.List;

/**
 * @author yangchao98
 * @create 2020-07-01 22:21
 */

public interface UserService {
    List<User> findAll();
}
