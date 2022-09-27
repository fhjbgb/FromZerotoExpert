package com.example.demo.service;


import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public void register(String username,String password){
        userMapper.saveInfo(username,password);
    }
}
