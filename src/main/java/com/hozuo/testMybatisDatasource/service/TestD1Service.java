package com.hozuo.testMybatisDatasource.service;

import com.hozuo.testMybatisDatasource.pojo.User;

import java.util.List;

/**
 * TestD1Service
 * <p>2020/6/23
 * @author hozuo
 * @version 1.0
 */
public interface TestD1Service {
    List<User> select ();

    void insert(User user);
}
