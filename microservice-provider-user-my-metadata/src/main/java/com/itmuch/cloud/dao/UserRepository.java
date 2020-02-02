package com.itmuch.cloud.dao;

import com.itmuch.cloud.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ：loso
 * @date ：Created in 2020/1/29 3:18 上午
 * @description：Dao
 * @modified By：
 * @version: 1.0$
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
