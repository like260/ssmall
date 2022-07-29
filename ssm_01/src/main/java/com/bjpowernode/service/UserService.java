package com.bjpowernode.service;

import com.bjpowernode.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int delUser(Integer userId);
    int update(User user);
    User searchOne(Integer userId);
    List<User> searchAll();
}
