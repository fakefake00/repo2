package com.hui.service.Impl;

import com.hui.service.UserService;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加一个用户");
    }

    public void delete() {
        System.out.println("删除一个用户");
    }

    public void update() {
        System.out.println("更新一个用户");
    }

    public void query() {
        System.out.println("查询一个用户");
    }
}
