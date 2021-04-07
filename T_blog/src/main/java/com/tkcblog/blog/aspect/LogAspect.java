package com.tkcblog.blog.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    //记录日志
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //对web目录下的所有文件记录日志
    @Pointcut("execution(* com.tkcblog.blog.web.*.*(..))")
    public void log(){

    }

    //记录之前
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();//获取request响应
        String url = request.getRequestURL().toString();//获取url
        String ip = request.getRemoteAddr();//获取远程IP地址
        String classMethod = joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        RequestLog requestLog = new RequestLog(url,ip,classMethod,args);
        logger.info("Request :{}" , requestLog);
    }

    //记录之后，用作测试使用
    @After("log()")
    public void doAfter(){

//        logger.info("------doAfter--------");
    }

    //返回result
    @AfterReturning(returning = "result",pointcut = "log()")
    public void doAfterReturn(Object result){
        logger.info("Result : {}",result);

    }


    private class RequestLog{
       private String url;
       private String ip;
       private String classMethod;
       private Object[] args;

        @Override
        public String toString() {
            return "{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }

        public RequestLog(String url, String ip, String classMethod, Object[] args){
           this.url = url;
           this.ip = ip;
           this.classMethod = classMethod;
           this.args = args;

       }

    }


}
