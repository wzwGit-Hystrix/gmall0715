package com.atguigu.demo.demo.controller;

import com.atguigu.demo.demo.bean.UserInfo;
import com.atguigu.demo.demo.service.UserService;
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
     *
     * @return
     */
    @RequestMapping("getAll")
    @ResponseBody
    public List<UserInfo> getAll() {
        return userService.getAll ();
    }

    /**
     * 根据用户姓名（或者其他信息）进行查询
     *
     * @return
     */
    @RequestMapping("getUserByName")
    @ResponseBody
    public List<UserInfo> getUserByName(UserInfo userInfo) {
        return userService.getUserByName (userInfo);
    }

    /**
     * 通过nickname进行模糊查询
     */
    @RequestMapping("getUserByNickName")
    @ResponseBody
    public List<UserInfo> getUserByNickName(UserInfo userInfo) {
        return userService.getUserByNickName (userInfo);
    }

    /**
     * 进行登陆操作时判断用户是否存在
     */
    @RequestMapping("getInfoByUser")
    @ResponseBody
    public UserInfo getInfoByUser(UserInfo userInfo) {
        return userService.getInfoByUser (userInfo);

    }

    /**
     * 添加用户数据
     *
     * @param userInfo
     */
    @RequestMapping("insert")
    @ResponseBody
    public void insertUserInfo(UserInfo userInfo) {
        userService.insertUserInfo (userInfo);
    }

    /**
     * 根据loginname进行修改
     */
    @RequestMapping("updateByLoginName")
    @ResponseBody
    public void updateByLoginName(UserInfo userInfo) {
        userService.updateByLoginName (userInfo);
    }

    /**
     * 按照主键进行修改
     */
    @RequestMapping("updateById")
    @ResponseBody
    public void updateById(UserInfo userInfo) {
        userService.updateById (userInfo);
    }
    /**
     * 根据用户自定义条件删除
     */
    @RequestMapping("deleByExample")
    @ResponseBody
    public void deleByExample(UserInfo userInfo){
        userService.deleByExample(userInfo);
    }
    /**
     * 直接删除
     */
    @RequestMapping("delete")
    @ResponseBody
    public void delete(UserInfo userInfo){
        userService.delete(userInfo);
    }

    /**
     * 根据主键进行删除
     */
    @RequestMapping("deleteById")
    @ResponseBody
    public void deleteById(UserInfo userInfo){
        userService.deleteById(userInfo);
    }

}
