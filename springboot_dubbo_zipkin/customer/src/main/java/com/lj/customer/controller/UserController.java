package com.lj.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lj.commen.domain.User;
import com.lj.commen.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: cfeng
 * @date: 2020/9/6
 * @description:
 */
@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }
}
