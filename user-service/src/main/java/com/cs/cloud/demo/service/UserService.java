package com.cs.cloud.demo.service;


import com.cs.cloud.demo.entity.User;

import java.util.List;

/**
 * @Author: freely
 * @Description:
 * @Date: Create in 8:54 下午 2020/8/10
 */

public interface UserService {

    void create(User user);

    User getUser(Long id);

    List<User> getUserByIds(List<Long> ids);

    User getByUsername(String username);

    void update(User user);

    void delete(Long id);


}
