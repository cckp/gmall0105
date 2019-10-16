package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UserMember;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: gmall0105
 * @description:
 * @author: cckp
 * @create: 2019-10-15 23:51
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserMember> selectAllUser() {
        return userMapper.selectAllUser();
    }


}
