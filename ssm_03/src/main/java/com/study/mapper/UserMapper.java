package com.study.mapper;

import com.study.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUserPage(@Param("userName") String userName,@Param("userSex") String userSex);

    int getRowCount(@Param("userName") String userName,@Param("userSex") String userSex);

    int deleteUserById(String userId);

    int createUser(User user);

    int updateUserById(User user);

    int deleteUserByIdList(String[] userIdList);
}
