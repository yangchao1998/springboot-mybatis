package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.domain.User;
import com.atguigu.springboot.dao.UserDao;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author yangchao98
 * @create 2020-07-01 22:22
 */
@Transactional(readOnly = true)//只读事务
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    //@Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
