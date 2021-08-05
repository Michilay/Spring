package com.michilay.mapper;

import com.michilay.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

//    添加用户
    public int addUser(User user);
//    删除用户
    public int deleteUser(int id);


}
