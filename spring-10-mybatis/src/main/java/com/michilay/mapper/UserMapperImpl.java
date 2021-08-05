package com.michilay.mapper;

import com.michilay.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
//    所有操作通过sqlsession来执行，现在使用spring new出来的sqlswssionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }


    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }



    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }
}
