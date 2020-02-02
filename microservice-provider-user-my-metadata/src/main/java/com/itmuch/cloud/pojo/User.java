package com.itmuch.cloud.pojo;

import lombok.Data;
import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;

/**
 * @author ：loso
 * @date ：Created in 2020/1/29 2:53 上午
 * @description：用户实体类
 * @modified By：
 * @version: 1.0$
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;
}
