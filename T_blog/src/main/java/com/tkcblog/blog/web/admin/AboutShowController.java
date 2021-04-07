package com.tkcblog.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by limi on 2017/10/24.
 */
@Controller
public class AboutShowController {

    //当https返回about响应时，返回关于我的页面映射
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
