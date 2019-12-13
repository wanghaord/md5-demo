package com.runqing.controller;

import com.runqing.model.User;
import com.runqing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public List<User> findUser() {
        String uid = "1";
        List<User> userInfo = userService.findAll();
        return userInfo;
    }

    @RequestMapping("/saveUser")
    public void saveUser() {
        userService.saveUser();
    }

    @RequestMapping("/findById")
    public User findById(String uid) {
        User userInfo = userService.findUserById(uid);
        return userInfo;
    }
}
