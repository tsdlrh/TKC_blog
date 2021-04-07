package com.tkcblog.blog.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by tkc on 2021/03/27.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    //登录拦截器
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/admin");
            return false;
        }//如果用户为空，或者被注销，则重定向到管理员登录页面
        return true;
    }
}
