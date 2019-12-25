package com.atguigu.demo.demo.service;

import com.atguigu.demo.demo.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 获取所有用户信息
     *
     * @return
     */
    List<UserInfo> getAll();

    /**
     * 根据用户某一项或者几项信息进行查询
     *
     * @param userInfo
     * @return
     */
    List<UserInfo> getUserByName(UserInfo userInfo);

    /**
     * 通过nickname进行模糊查询
     *
     * @param userInfo
     * @return
     */
    List<UserInfo> getUserByNickName(UserInfo userInfo);

    /**
     * 登陆时判断用户是否已经存在
     *
     * @param userInfo
     * @return
     */
    UserInfo getInfoByUser(UserInfo userInfo);

    /**
     * 添加用户数据
     *
     * @param userInfo
     */
    void insertUserInfo(UserInfo userInfo);

    /**
     * 根据loginname进行修改
     *
     * @param userInfo
     */
    void updateByLoginName(UserInfo userInfo);

    /**
     * 根据主键id进行修改
     *
     * @param userInfo
     */
    void updateById(UserInfo userInfo);

    /**
     * 用户自定义删除
     *
     * @param userInfo
     */
    void deleByExample(UserInfo userInfo);

    /**
     * 直接删除
     *
     * @param userInfo
     */
    void delete(UserInfo userInfo);

    /**
     *
     * @param userInfo
     */
    void deleteById(UserInfo userInfo);
}
