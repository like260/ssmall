package com.bjpowernode.controller;

import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    public static final int PAGE_SIZE = 5;
    @RequestMapping("/selectUserPage")
    public Object selectUserPage(String userName,String userSex,Integer page){
        if (page == null)
            page = 1;
        return userService.selectUserPage(userName,userSex,page,PAGE_SIZE);
    }

    @RequestMapping("/getRowCount")
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName, userSex);
    }
}
