package com.bunfly.springboot_quick.controller;

import com.bunfly.springboot_quick.dao.UserMapper;
import com.bunfly.springboot_quick.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuickMybatis {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    public List<User> queryUser() {
        return userMapper.queryUserList();
    }
}
