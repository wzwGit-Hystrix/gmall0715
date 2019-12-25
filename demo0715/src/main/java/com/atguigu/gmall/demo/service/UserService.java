package com.atguigu.gmall.demo.service;

import com.atguigu.gmall.demo.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     */
    List<UserInfo> findAll();
    
}
