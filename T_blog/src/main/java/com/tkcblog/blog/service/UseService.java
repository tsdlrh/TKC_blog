package com.tkcblog.blog.service;

import com.tkcblog.blog.po.User;

public interface UseService {
    //定义检查用户是否合法的接口
    User checkUser(String username,String password);

}
