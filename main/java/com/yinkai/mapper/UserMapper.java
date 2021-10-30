package com.yinkai.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Component(value="userMapper")
public interface UserMapper {

    @Select("select * from user where userName = #{userName} and passWord = #{passWord}")
    String loginIn(@Param("userName") String userName,@Param("passWord") String passWord);
}

