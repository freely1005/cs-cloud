package com.cs.cloud.demo.entity;

import lombok.Data;

/**
 * @Author: freely
 * @Description:
 * @Date: Create in 8:54 下午 2020/8/10
 */
@Data
public class User {

    private Long id;
    private String username;
    private String password;

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
