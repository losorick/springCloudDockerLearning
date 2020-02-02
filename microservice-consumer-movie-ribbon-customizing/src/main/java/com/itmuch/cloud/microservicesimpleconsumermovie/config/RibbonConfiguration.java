package com.itmuch.cloud.microservicesimpleconsumermovie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：loso
 * @date ：Created in 2020/2/2 3:50 下午
 * @description：Ribbon配置类
 * @modified By：
 * @version: $
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
