package com.atguigu.gmall.demo.controller;

import com.atguigu.gmall.demo.bean.UserInfo;

import com.atguigu.gmall.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
  @Autowired
  private UserService userService;

    /**
     * 查询所有用户信息
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public List<UserInfo> getAll(){
        return userService.findAll();
    }
}
