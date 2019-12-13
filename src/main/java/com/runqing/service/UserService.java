package com.runqing.service;

import com.runqing.dao.UserDao;
import com.runqing.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author runqing
 *  用户逻辑类
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据用户id查询用户信息
     */
    public List<User> findAll() {
        List<User> user = userDao.findAll();
        return user;
    }

    /**
     * 新增用户（不使用加密时直接将明文密码保存到数据库中）
     * 弊端：明文存储的密码安全性极其低，很容易被拿到
     */
    public void saveUser() {
        User user = new User("2", "李四", "1234", "1231312@qq.com");
        userDao.save(user);
    }

    /**
     * 根据用户ID查询用户信息
     */
    public User findUserById(String uid) {
        User user = userDao.findByuId(uid);
        return user;
    }



}
