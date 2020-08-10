package com.cs.cloud.demo.service.impl;

import com.cs.cloud.demo.entity.User;
import com.cs.cloud.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * @Author: freely
 * @Description:
 * @Date: Create in 8:54 下午 2020/8/10
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Boolean create(User user) {
        return null;
    }

    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setUsername("测试");
        user.setId(1L);
        user.setPassword("密码");
        return user;
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        User user = new User();
        user.setUsername("测试");
        user.setId(1L);
        user.setPassword("密码");
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }

    @Override
    public User getByUsername(String username) {
        User user = new User();
        user.setUsername("测试");
        user.setId(1L);
        user.setPassword("密码");
        return user;
    }

    @Override
    public Boolean update(User user) {
        return true;
    }

    @Override
    public Boolean delete(Long id) {
        return true;
    }
}
