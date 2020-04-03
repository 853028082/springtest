package com.myspring.testone.controller;

import com.myspring.testone.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
public class ORCodeController {
    @Autowired
    private LoginDao loginDao;


    @RequestMapping("/jsp")
    public String getjsp() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "登陆失败";
    }


    @GetMapping("/register/index")
    @ResponseBody
    public String registerIndex() {
        return "注册成功";
    }


    @PostMapping("/register/add")
    public String registerAdd(String username, String password) {
        loginDao.adduser(username, password);
        return "redirect:/register/index";
    }

}
