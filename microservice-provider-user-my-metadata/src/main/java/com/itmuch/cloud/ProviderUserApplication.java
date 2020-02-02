package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：loso
 * @date ：Created in 2020/1/29 3:44 上午
 * @description：启动类
 * @modified By：
 * @version: 1.0$
 */

@SpringBootApplication
@EnableEurekaClient
public class ProviderUserApplication {
    public static void main(String[] args){
        SpringApplication.run(ProviderUserApplication.class,args);
    }
}
