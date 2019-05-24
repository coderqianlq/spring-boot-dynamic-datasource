package com.qianlq.dynamicdatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
@MapperScan("com.qianlq.dynamicdatasource.mapper")
public class SpringBootDynamicDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDynamicDatasourceApplication.class, args);
	}

}
