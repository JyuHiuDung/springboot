package com.bunfly.springboot_quick.dao;

import com.bunfly.springboot_quick.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
