package com.hozuo.testMybatisDatasource.service.impl;

import com.hozuo.testMybatisDatasource.mapper.testD1.TestD1Mapper;
import com.hozuo.testMybatisDatasource.pojo.User;
import com.hozuo.testMybatisDatasource.service.TestD1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TestD1ServiceImpl
 * 2020/6/23
 *
 * @author hozuo
 * @version 1.0
 */
@Service
public class TestD1ServiceImpl implements TestD1Service {

    private TestD1Mapper testD1Mapper;

    @Autowired
    public void setTestD1Mapper(TestD1Mapper testD1Mapper) {
        this.testD1Mapper = testD1Mapper;
    }

    @Override
    public List<User> select() {
        return testD1Mapper.select();
    }

	@Override
	public void insert(User user) {
		testD1Mapper.insert(user);
	}
}
