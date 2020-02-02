package com.itmuch.cloud.microservicesimpleconsumermovie.controller;

import com.itmuch.cloud.microservicesimpleconsumermovie.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：loso
 * @date ：Created in 2020/2/1 12:50 上午
 * @description：controller
 * @modified By：
 * @version: 1.0$
 */
@RestController
@Slf4j
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value(value = "${user.userServiceUrl}")
    private String userServiceUrl;


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        String url = userServiceUrl + id;
        log.info("url : {}",url);
        return this.restTemplate.getForObject(url,User.class);
    }
}
