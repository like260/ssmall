package com.bjpowernode.mapper;

import com.bjpowernode.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int addUser(User user);
    int delUser(String userId);
    int editUser(User user);
    List<User> selectUserPage(
            @Param("userName")
            String userName,
            @Param(("userSex"))
            String userSex);
    int getRowCount(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex);
}
