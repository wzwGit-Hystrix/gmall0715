package com.atguigu.demo.demo.service.impl;

import com.atguigu.demo.demo.bean.UserInfo;
import com.atguigu.demo.demo.mapper.UserInfoMapper;
import com.atguigu.demo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAll() {
        return userInfoMapper.selectAll ();
    }

    @Override
    public List<UserInfo> getUserByName(UserInfo userInfo) {
        Example example = new Example (UserInfo.class);
        example.createCriteria ().andEqualTo ("name", userInfo.getName ());
        return userInfoMapper.selectByExample (example);
    }

    @Override
    public List<UserInfo> getUserByNickName(UserInfo userInfo) {
        Example example = new Example (UserInfo.class);
        example.createCriteria ().andLike ("nickName", "%" + userInfo.getNickName () + "%");
        return userInfoMapper.selectByExample (example);
    }

    @Override
    public UserInfo getInfoByUser(UserInfo userInfo) {
        return userInfoMapper.selectOne (userInfo);
    }

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insertSelective (userInfo);
    }

    @Override
    public void updateByLoginName(UserInfo userInfo) {
        Example example = new Example (UserInfo.class);
        example.createCriteria ().andEqualTo ("loginName", userInfo.getLoginName ());
        userInfoMapper.updateByExampleSelective (userInfo, example);
    }

    @Override
    public void updateById(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective (userInfo);
    }

    @Override
    public void deleByExample(UserInfo userInfo) {
        Example example = new Example (UserInfo.class);
        example.createCriteria ().andEqualTo ("name", userInfo.getName ());
        userInfoMapper.deleteByExample (example);
    }

    @Override
    public void delete(UserInfo userInfo) {
        userInfoMapper.delete (userInfo);
    }

    @Override
    public void deleteById(UserInfo userInfo) {
        userInfoMapper.deleteByPrimaryKey (userInfo);
    }
}
