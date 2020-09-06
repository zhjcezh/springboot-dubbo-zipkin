package com.lj.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lj.commen.domain.User;
import com.lj.commen.service.UserService;
import com.lj.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: cfeng
 * @date: 2020/9/6
 * @description:
 */
@Service(version = "1.0.0")
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getOne(3L);
    }
}
