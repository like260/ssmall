package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    static final int PAGE_SIZE = 5;
    @RequestMapping("/selectUserPage")
    public Object selectUserPage(String userName,String userSex,Integer page){
        if(page == null)
            page = 1;
        return userService.selectUserPage(userName,userSex,page,PAGE_SIZE);
    }

    @RequestMapping("/getRowCount")
    public int getRowCount(String userName,String userSex){
        return userService.getRowCount(userName, userSex);
    }
    @RequestMapping("/deleteUserById")
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }
    @RequestMapping("/createUser")
    public int createUser(User user){
        return userService.createUser(user);
    }
    @RequestMapping("/updateUserById")
    public int updateUserById(User user){
        return userService.updateUserById(user);
    }
    @RequestMapping("/deleteUserByIdList")
    public int deleteUserByIdList(String[] userIdList){
        return userService.deleteUserByIdList(userIdList);
    }
    /*int getRowCount(@Param("userName") String userName,@Param("userSex") String userSex);

    int deleteUserById(Integer userId);

    int createUser(User user);

    int updateUserById(User user);

    int deleteUserByIdList(String[] userIdList);*/
}
