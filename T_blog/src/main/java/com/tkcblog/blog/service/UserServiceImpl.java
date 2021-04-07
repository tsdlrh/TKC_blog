package com.tkcblog.blog.service;

import com.tkcblog.blog.Util.MD5Utils;
import com.tkcblog.blog.dao.UserRepositiry;
import com.tkcblog.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UseService{

    //持久层注入
    @Autowired
    private UserRepositiry userRepositiry;
    //MD5加密，判断用户是否合法
    @Override
    public User checkUser(String username, String password) {
        User user = userRepositiry.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

}
