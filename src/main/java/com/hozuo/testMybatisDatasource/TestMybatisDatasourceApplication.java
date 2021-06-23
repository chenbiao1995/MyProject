package com.hozuo.testMybatisDatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * TestMybatisDatasourceApplication
 * <p>2020/6/23
 * <p>关闭mapper自动扫描
 * @author hozuo
 * @version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestMybatisDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMybatisDatasourceApplication.class, args);
	}

}
