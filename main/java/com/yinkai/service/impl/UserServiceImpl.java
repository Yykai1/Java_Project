package com.yinkai.service.impl;

import com.yinkai.mapper.UserMapper;
import com.yinkai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    public String login(String userName,String passWord){
        return userMapper.loginIn(userName,passWord);
    }


}
