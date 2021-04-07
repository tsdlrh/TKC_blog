package com.tkcblog.blog.web.admin;


import com.tkcblog.blog.po.User;
import com.tkcblog.blog.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {

    //业务注入
    @Autowired
    private UseService useService;

    //返回登录页面
    @GetMapping
    public String loginPage(){
        return "admin/login";
    }

    //登录页面的校验功能
    @PostMapping("/login")
    public String login(@RequestParam(value="username",required = false) String username,
                        @RequestParam(value="password",required = false) String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        User user = useService.checkUser(username,password);
        if(user != null){
            user.setPassword(null);
            session.setAttribute("user",user);
            return "admin/index";
        }else{
            attributes.addFlashAttribute("message","用户名和密码错误");
            return "redirect:/admin";
        }

    }

    //注销之后，重新返回登录页面
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";

    }

}
