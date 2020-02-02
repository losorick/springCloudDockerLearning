package com.itmuch.cloud.microservicesimpleconsumermovie.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：loso
 * @date ：Created in 2020/2/2 3:55 下午
 * @description：测试类，为特定的name的Ribbon Client自定义配置
 * @modified By：
 * @version: $
 */
@Configuration
@RibbonClient(name = "microservice-provider-user", configuration = RibbonConfiguration.class)

public class TestConfiguration {
}
