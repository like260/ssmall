package com.bjpowernode.test;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void addUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Service.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");

        userService.addUser(new User(22,"张三","35321"));
    }
}
