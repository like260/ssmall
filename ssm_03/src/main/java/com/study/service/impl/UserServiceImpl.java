package com.study.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.mapper.UserMapper;
import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectUserPage(String userName, String userSex, Integer page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<User> list = userMapper.selectUserPage(userName, userSex);
        PageInfo info = new PageInfo(list);
        return info.getList();
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName, userSex);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int createUser(User user) {
        user.setUserId(System.currentTimeMillis() + "" + (new Random().nextInt(9000) + 1000));
        return userMapper.createUser(user);
    }

    @Override
    public int updateUserById(User user) {
        return userMapper.updateUserById(user);
    }

    @Override
    public int deleteUserByIdList(String[] userIdList) {
        return userMapper.deleteUserByIdList(userIdList);
    }
}
