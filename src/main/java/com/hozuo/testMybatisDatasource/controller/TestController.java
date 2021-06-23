package com.hozuo.testMybatisDatasource.controller;

import com.hozuo.testMybatisDatasource.pojo.User;
import com.hozuo.testMybatisDatasource.service.TestD1Service;
import com.hozuo.testMybatisDatasource.service.TestD2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * TestController
 * <p>2020/6/23
 * <p> 测试控制器
 * @author hozuo
 * @version 1.0
 */
@RestController
public class TestController {

    private TestD1Service testD1Service;

    private TestD2Service testD2Service;

    @Autowired
    public void setTestD1Service(TestD1Service testD1Service) {
        this.testD1Service = testD1Service;
    }

    @Autowired
    public void setTestD2Service(TestD2Service testD2Service) {
        this.testD2Service = testD2Service;
    }

    @RequestMapping("/d1")
    public List<User> testD1() {
        return testD1Service.select();
    }

    @RequestMapping("/insert")
    public void insert() {
        //test
        User user = new User();
        user.setId(new Random().nextInt());
        user.setUsername("ceshi");
        user.setPassword("");
        testD1Service.insert(user);
        System.out.println("end");
    }

    @RequestMapping("/d2")
    public List<User> testD2() {
        return testD2Service.select();
    }
}
