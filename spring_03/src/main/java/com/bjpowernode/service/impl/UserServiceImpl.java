package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.UserMapper;
import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
