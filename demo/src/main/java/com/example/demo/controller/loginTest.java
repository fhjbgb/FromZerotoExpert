package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginTest {
    @ResponseBody
    @RequestMapping("/FromZerotoExpert")
    public String login(){
        String str= "我的第一个页面";
        return str;
    }
}
