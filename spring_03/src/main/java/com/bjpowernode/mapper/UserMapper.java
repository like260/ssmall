package com.bjpowernode.mapper;

import com.bjpowernode.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUserPage(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex);

    int getRowCount(
                    @Param("userName")
                    String userName,
                    @Param("userSex")
                    String userSex);
}
