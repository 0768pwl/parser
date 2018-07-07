package com.cz.pwl.parser.dao.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 描述:数据源定义
 *
 * @author panwl
 * @create 2018-07-07
 */
@Configuration
public class DataSourceDefine {

    @Bean(name = "userDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.user")
    public DataSource userDataSource(){
        return new DruidDataSource();
    }

}
