package com.baidu.www.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {
    //登录
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    //登录后跳转
    @GetMapping("/login3")
    public String main(){
        return "login3";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/earth_moon_sys")
    public String earth_moon_sys(){
        return "earth_moon_sys";
    }
    @GetMapping("/login_1")
    public String login_1(){
        return "login_1";
    }
    //因为没有连接数据库，所以在这里写一个模拟数据库
    @PostMapping("/logincheck")
    public String check(@RequestParam("username") String name, @RequestParam("password") String psw, Map<String, Object> map) {
        if (name.equals("fbb") && psw.equals("123")) {
            return "redirect:/main";
        } else {
            map.put("msg", "用户名或密码错误");            //错了就把错误信息存进去，让前端来取
            return "login";
        }
    }





}