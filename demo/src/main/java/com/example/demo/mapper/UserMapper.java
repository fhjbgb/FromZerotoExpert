package com.example.demo.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    @Insert("insert into user(user_name,user_pwd)values(#{username},#{password})")
    void saveInfo(@Param("username") String username, @Param("password") String password);

}
