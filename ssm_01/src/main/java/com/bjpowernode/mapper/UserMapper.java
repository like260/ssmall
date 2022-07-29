package com.bjpowernode.mapper;

import com.bjpowernode.pojo.User;

import java.util.List;

public interface UserMapper {
    int addUser(User user);
    int delUser(Integer userId);
    int editUser(User user);
    User searchOne(Integer userId);
    List<User> searchAll();
}
