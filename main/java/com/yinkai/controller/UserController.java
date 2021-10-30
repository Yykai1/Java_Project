package com.yinkai.controller;

import com.yinkai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(path = "/login")
public class UserController {

    @Autowired
    public UserService userService;

    @ResponseBody
    @GetMapping("/pass")
    public String getLogin(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        System.out.println(userName);
        System.out.println(passWord);
        String result = userService.login(userName,passWord);
        if(result == null){
            System.out.println(0);
            return "0";
        }
        else{
            System.out.println(1);
            return "1";
        }
    }


}
