package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.UserMapper;
import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int delUser(Integer userId) {
        return userMapper.delUser(userId);
    }

    @Override
    public int update(User user) {
        return userMapper.editUser(user);
    }

    @Override
    public User searchOne(Integer userId) {
        return userMapper.searchOne(userId);
    }

    @Override
    public List<User> searchAll() {
        return userMapper.searchAll();
    }
}
