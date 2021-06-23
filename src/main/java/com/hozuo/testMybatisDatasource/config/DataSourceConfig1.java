package com.hozuo.testMybatisDatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * DataSourceConfig1
 * <p>2020/6/23
 * <p>主数据源配置
 * @author hozuo
 * @version 1.0
 */
@Configuration
@MapperScan(value  = "com.hozuo.testMybatisDatasource.mapper.testD1", sqlSessionFactoryRef = "test1SqlSessionFactory")
public class DataSourceConfig1 {

    // 表示这个数据源是默认数据源
    @Primary
    @Bean(name = "test1DataSource")
    // 读取application.properties中的配置参数映射成为一个对象
    // prefix表示yml配置文件中参数的前缀
    @ConfigurationProperties(prefix = "spring.datasource.test1")
    public DataSource getDateSource1() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "test1SqlSessionFactory")
    // @Qualifier表示查找Spring容器中名字为test1DataSource的对象
    public SqlSessionFactory test1SqlSessionFactory(@Qualifier("test1DataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                // 设置mybatis的.xml所在位置
                new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/testD1/*.xml"));
        return bean.getObject();
    }

    @Primary
    @Bean("test1SqlSessionTemplate")
    public SqlSessionTemplate test1SqlSessionTemplate(
            @Qualifier("test1SqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }
}