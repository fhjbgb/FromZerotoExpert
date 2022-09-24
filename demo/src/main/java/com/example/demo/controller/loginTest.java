package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class loginTest {
//    @ResponseBody
//    @RequestMapping("/FromZerotoExpert")
//    public String login(HttpServletResponse response, @CookieValue(value = "cookie",defaultValue = "0") String s,
//                        HttpServletRequest request){
////        Cookie cookie = null;
//        if(s.equals("0")) {
//            Cookie cookie = new Cookie("cookie", "1");
//            cookie.setMaxAge(60);
//            response.addCookie(cookie);
//            String str ="嗨，欢迎您来到 首次来到from zero to expert.";
//            return str;
//        }
//        else {
//            int i = 0;
//            String str = "";
//            Cookie []cookie = request.getCookies();
//            Cookie tmp =null;
//            for(int t = 0; t <cookie.length; t++){
//                if(cookie[t].getName().equals("cookie")){
//                    i = Integer.valueOf(cookie[t].getValue());
//
//                    i++;
//                    cookie[t].setValue(String.valueOf(i));
//                    str ="嗨，欢迎您来到 再次来到from zero to expert,这是你第"+i+"次登录";
//                    return str;
//                }
//            }
//
//        }
//        return "";
//    }


    @ResponseBody
    @RequestMapping("/FromZerotoExpert")
    public String login(HttpServletResponse response, @CookieValue(value = "cookie",defaultValue = "0") String s){
        if(s.equals("0")){
            Cookie cookie = new Cookie("cookie", "1");
            cookie.setMaxAge(60);
            response.addCookie(cookie);
            String str ="嗨，欢迎您来到 首次来到from zero to expert.";
            return str;
        }
        else {
            String str ="嗨，欢迎您来到 再次来到from zero to expert.";
            return str;
        }
    }
}
