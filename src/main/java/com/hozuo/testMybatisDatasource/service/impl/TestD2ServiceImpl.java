package com.hozuo.testMybatisDatasource.service.impl;

import com.hozuo.testMybatisDatasource.mapper.testD2.TestD2Mapper;
import com.hozuo.testMybatisDatasource.pojo.User;
import com.hozuo.testMybatisDatasource.service.TestD2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TestD2ServiceImpl
 * 2020/6/23
 *
 * @author hozuo
 * @version 1.0
 */
@Service
public class TestD2ServiceImpl implements TestD2Service {

    private TestD2Mapper testD2Mapper;

    @Autowired
    public void setTestD2Mapper(TestD2Mapper testD2Mapper) {
        this.testD2Mapper = testD2Mapper;
    }

    @Override
    public List<User> select() {
        return testD2Mapper.select();
    }
}
