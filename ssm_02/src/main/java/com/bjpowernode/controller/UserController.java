package com.bjpowernode.controller;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    public static final int PAGE_SIZE = 5;
    @RequestMapping("/selectUserPage")
    public List<User> selectUserPage(String userName,String userSex,Integer page){
        if(page == null)
            page = 1;
        List<User> list = userService.selectUserPage(userName, userSex, page,PAGE_SIZE);
        return list;
    }

    @RequestMapping("/getRowCount")
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName, userSex);
    }

    @RequestMapping("/deleteUserById")
    public int deleteUserById(String userId){
        return userService.delUser(userId);
    }

    @RequestMapping("/createUser")
    public int createUser(User user){
        int ran = new Random().nextInt(9000) + 1000;
        user.setUserId(System.currentTimeMillis() + "" + ran);
        return userService.addUser(user);
    }
}
