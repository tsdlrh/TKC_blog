package com.tkcblog.blog.dao;

import com.tkcblog.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositiry extends JpaRepository<User,Long> {

    //定义从用户名和密码进行查找的接口
    User findByUsernameAndPassword(String username,String password);

}
