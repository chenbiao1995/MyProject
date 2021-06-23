package com.hozuo.testMybatisDatasource.mapper.testD1;

import com.hozuo.testMybatisDatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestD1Mapper {
    List<User> select ();

    void insert(User user);
}
