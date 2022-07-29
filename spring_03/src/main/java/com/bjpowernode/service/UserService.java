package com.bjpowernode.service;


import com.bjpowernode.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUserPage(String userName,String userSex,Integer page,int pageSize);
    int getRowCount(String userName,String userSex);
}
