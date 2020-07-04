package com.atguigu.springboot;

import com.atguigu.springboot.service.UserService;
import com.atguigu.springboot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

/**
 * @author yangchao98
 * @create 2020-07-02 10:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {


    @Autowired
    DataSource dataSource;

    @Autowired
    UserService userService;

    @Test
    public void setDataSourceTest() throws Exception{
        System.out.println(dataSource.getClass());//获取数据源的名字
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
        connection.close();//归还连接给链接池
    }

    @Test
    public void test(){
        List<User> users = userService.findAll();
        users.forEach(System.out::println);
    }


}
