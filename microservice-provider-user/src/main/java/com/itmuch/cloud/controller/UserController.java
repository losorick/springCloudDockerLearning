package com.itmuch.cloud.controller;

import com.itmuch.cloud.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.itmuch.cloud.pojo.User;

/**
 * @author ：loso
 * @date ：Created in 2020/1/29 3:23 上午
 * @description：user com.itmuch.cloud.controller
 * @modified By：
 * @version: 1.0$
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = userRepository.findById(id).orElse(null);
        return findOne;
    }
}
