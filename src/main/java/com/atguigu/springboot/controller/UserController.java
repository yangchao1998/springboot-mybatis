package com.atguigu.springboot.controller;

import com.atguigu.springboot.domain.User;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangchao98
 * @create 2020-07-01 22:23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll(){
        System.out.println("userService = " + userService.getClass());
        return userService.findAll();
    }

}
