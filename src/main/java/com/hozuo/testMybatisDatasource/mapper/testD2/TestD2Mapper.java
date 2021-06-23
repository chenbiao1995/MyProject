package com.hozuo.testMybatisDatasource.mapper.testD2;

import com.hozuo.testMybatisDatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestD2Mapper {
    List<User> select ();
}
