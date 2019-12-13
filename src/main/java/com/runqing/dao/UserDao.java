package com.runqing.dao;

import com.runqing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, String> {

    //查询所有用户信息
    List<User> findAll();

    //保存用户信息
    User save(User user);

    //根据用户id查询用户信息
    User findByuId(String uid);
}
