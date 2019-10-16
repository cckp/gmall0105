package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: gmall0105
 * @description:
 * @author: cckp
 * @create: 2019-10-15 23:51
 **/
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello world!";
    }

    @RequestMapping("index2")
    @ResponseBody
    public List<UserMember> index2() {
        return userService.selectAllUser();
    }

}
