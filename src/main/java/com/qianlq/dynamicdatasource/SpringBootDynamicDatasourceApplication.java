package com.qianlq.dynamicdatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class SpringBootDynamicDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDynamicDatasourceApplication.class, args);
	}

}
