package com.atguigu.springboot.dao;

import com.atguigu.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Component;



import java.util.List;

/**
 * @author yangchao98
 * @create 2020-07-01 22:18
 */
//@Mapper标记该类是一个mybatis的mapper接口，可以被spring boot自动扫描到spring上下文中

@Component(value = "UserDao")
public interface UserDao {
    public List<User> findAll();
}
