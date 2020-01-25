package com.bunfly.springboot_quick;

import com.bunfly.springboot_quick.dao.UserMapper;
import com.bunfly.springboot_quick.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQuickApplication.class)
public class TestJunit {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void springbootTest() {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}
