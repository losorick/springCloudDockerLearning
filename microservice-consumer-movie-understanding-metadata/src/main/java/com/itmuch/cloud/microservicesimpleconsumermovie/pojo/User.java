package com.itmuch.cloud.microservicesimpleconsumermovie.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ：loso
 * @date ：Created in 2020/2/1 12:34 上午
 * @description：用户类
 * @modified By：
 * @version: 1.0$
 */
@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;



}
