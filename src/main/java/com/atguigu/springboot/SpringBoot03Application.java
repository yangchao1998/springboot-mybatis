package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yangchao98
 * @create 2020-07-01 22:26
 */
@EnableTransactionManagement
@MapperScan("com.atguigu.springboot.dao")//加这个,dao层可以不加@Mapper注解,这个是交给spring Ioc 容器,创建代理对象
@SpringBootApplication
public class SpringBoot03Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot03Application.class, args);
    }
}
