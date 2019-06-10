package com.qianlq.dynamicdatasource;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author qianliqing
 * @date 2019/6/10 3:09 PM
 * email: qianlq0824@gmail.com
 */

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDynamicDatasourceApplication.class);
    }
}
