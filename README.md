# 这是我的个人博客的源码

个人博客前端网页链接：http://82.156.201.213:8086/



个人博客后台管理链接：http://82.156.201.213:8086/admin
                                                       用户名：tkc  密码：12345   

# 目录
* [博客概述](#博客概述)
  * [博客的功能](#博客的功能)
  * [博客搭建的工具](#博客搭建的工具)
  * [博客的页面设计](#博客的页面设计)
  * [博客实现的具体功能](#博客实现的具体功能)
  * [博客的应用分层](#博客的应用分层)
* [博客框架搭建及异常处理](#博客框架搭建及异常处理)
* [日志处理](#日志处理)
* [页面设计](#页面设计)
  * [电脑端展示](#页面电脑端展示)
  * [移动端展示](#页面移动端展示)
  * [导航栏](#导航栏示例)
  * [底部栏](#底部栏示例)
  * [管理员登录](#管理员登录示例)
  * [博客内容简介](#博客内容简介示例)
  * [分类标题](#分类标题示例)
  * [标签标题](#标签标题示例)
  * [归档内容标题](#归档内容示例)
  * [博客文章后台管理](#博客文章后台管理示例)
  * [博客分类后台管理](#博客分类后台管理示例)
  * [博客标签后台管理](#博客标签后台管理示例)
* [管理员登录](#管理员登录)
  * [数据库层(po)](#数据库层)
  * [持久层(dao)](#持久层)
  * [业务逻辑层(service)](#业务逻辑层)
  * [请求处理层(web)](#请求处理层)
  * [页面显示层](#页面显示层)
* [博客管理](#博客管理)
  * [数据库层(po)](#数据库层)
  * [持久层(dao)](#持久层)
  * [业务逻辑层(service)](#业务逻辑层)
  * [请求处理层(web)](#请求处理层)
  * [页面显示层](#页面显示层)
* [标签管理](#标签管理)
  * [数据库层(po)](#数据库层)
  * [持久层(dao)](#持久层)
  * [业务逻辑层(service)](#业务逻辑层)
  * [请求处理层(web)](#请求处理层)
  * [页面显示层](#页面显示层)
* [分类管理](#分类管理)
  * [数据库层(po)](#数据库层)
  * [持久层(dao)](#持久层)
  * [业务逻辑层(service)](#业务逻辑层)
  * [请求处理层(web)](#请求处理层)
  * [页面显示层](#页面显示层)
* [部署到云服务器](#部署到云服务器)



# (一）博客概述

## 博客的功能：
1、实现个人文章的展示
2、实现文章标签的归档
3、实现文章的分类
4、文章的增删改查
5、标签的增删改查
6、分类的增删改查
7、介绍自己的主页


## 博客搭建的工具：



前端：
编程语言：JavaScript,CSS,HTML5
框架：Semantic UI

后端：
编程语言：Java
框架：Spring Boot 2.x, JPA, thymeleaf

数据库：
MySQL

环境：
IntelliJ IDEA Community Edition 2020.3.3 x64
Maven 3
JDK 8

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E5%8D%9A%E5%AE%A2%E6%A6%82%E8%BF%B0/%E5%8D%9A%E5%AE%A2%E6%A6%82%E8%BF%B01.png)

## 博客的页面设计：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E5%8D%9A%E5%AE%A2%E6%A6%82%E8%BF%B0/%E5%8D%9A%E5%AE%A2%E6%A6%82%E8%BF%B02.png)


## 博客实现的具体功能：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E5%8D%9A%E5%AE%A2%E6%A6%82%E8%BF%B0/%E5%8D%9A%E5%AE%A2%E6%A6%82%E8%BF%B03.png)


## 博客的应用分层：

页面显示层
    ↑
请求处理层（Web层）
    ↑
业务逻辑层（Service层）
    ↑
持久层（Dao层）
    ↑
数据源



#  博客框架搭建及异常处理


1.新建项目


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA1.png)


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA2.png)


选择插件

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA3.png)

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA4.png)

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA5.png)

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA6.png)



2.修改pom.xml文件

添加下面一句

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA7.png)



3.编写配置application.yml文件

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA8.png)


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA9.png)


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA10.png)




4.编写异常处理


在templates目录下新建一个error文件夹，并在里面新建两个页面404.html与500.html


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA11.png)


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA12.png)




在templates目录下新建一个index.html页面

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA13.png)



5.在com.tkcblog.blog目录下新建web文件夹，里面编写IndexController.class

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA14.png)



6.run运行BlogApplication

7.在浏览器网址输入：localhost:8080

弹出500页面，说明错误页面跳转成功

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA15.png)


8.在error文件夹下编写error.html

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA16.png)


9.在com.tkcblog.blog包下新建一个handler文件夹，编写ControllerException.class

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA17.png)



10.运行测试，跳转到“错误”页面

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA18.png)


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA19.png)



11.在com.tkcblog.blog的目录下新建一个NotFoundExceotion.class

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA/%E6%A1%86%E6%9E%B6%E6%90%AD%E5%BB%BA20.png)


#  日志处理

1、在com.tkcblog.blog包下新建一个aspect文件夹，编写LogAspect.class

```
@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Pointcut("execution(* com.tkcblog.blog.web.*.*(..))")
    public void log(){
    }
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        RequestLog requestLog = new RequestLog(url,ip,classMethod,args);
        logger.info("Request :{}" , requestLog);
    }
    @After("log()")
    public void doAfter(){
    }
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
```


2、修改IndeController.class,进行测试

![mage](https://github.com/tsdlrh/Blog_image/blob/master/%E6%97%A5%E5%BF%97%E5%A4%84%E7%90%86/%E6%97%A5%E5%BF%97%E5%A4%84%E7%90%861.png)

![mage](https://github.com/tsdlrh/Blog_image/blob/master/%E6%97%A5%E5%BF%97%E5%A4%84%E7%90%86/%E6%97%A5%E5%BF%97%E5%A4%84%E7%90%862.png)

rebuild一下

![mage](https://github.com/tsdlrh/Blog_image/blob/master/%E6%97%A5%E5%BF%97%E5%A4%84%E7%90%86/%E6%97%A5%E5%BF%97%E5%A4%84%E7%90%863.png)

测试成功！


# 页面设计

## 页面电脑端展示

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E7%94%B5%E8%84%91%E7%AB%AF.png)

## 页面移动端展示

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E7%A7%BB%E5%8A%A8%E7%AB%AF.png)


## 页面设计采用Semantic UI实现

### 导航栏示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A11.png)

```

<!--导航-->
<nav th:replace="_fragment :: menu(1)" class="ui inverted attached segment m-padded-tb-mini m-shadow-small" >
    <div class="ui container">
        <div class="ui inverted secondary stackable menu">
            <h2 class="ui teal header item">Blog</h2>
            <a href="#" class=" m-item item m-mobile-hide"><i class="home icon"></i>首页</a>
            <a href="#" class="m-item item m-mobile-hide"><i class="idea icon"></i>分类</a>
            <a href="#" class="m-item item m-mobile-hide"><i class="tags icon"></i>标签</a>
            <a href="#" class="m-item item m-mobile-hide"><i class="clone icon"></i>归档</a>
            <a href="#" class="m-item item m-mobile-hide"><i class="info icon"></i>关于我</a>
            <div class="right m-item item m-mobile-hide">
                <div class="ui icon inverted transparent input m-margin-tb-tiny">
                    <input type="text" placeholder="Search....">
                    <i class="search link icon"></i>
                </div>
            </div>
        </div>
    </div>
    <a href="#" class="ui menu toggle black icon button m-right-top m-mobile-show">
        <i class="sidebar icon"></i>
    </a>
</nav>
```

### 底部栏示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A12.png)

```
<!--底部footer-->
<footer th:replace="_fragment :: footer" class="ui inverted vertical segment m-padded-tb-massive">
    <div class="ui center aligned container">
        <div class="ui inverted divided stackable grid">
            <div class="three wide column">
                <div class="ui inverted link list">
                    <div class="item">
                        <img src="../static/images/wechat.jpg" th:src="@{/images/wechat.jpg}"  class="ui rounded image" alt="" style="width: 110px">
                    </div>
                </div>
            </div>
            <div class="three wide column">
                <h4 class="ui inverted header m-text-thin m-text-spaced " >最新博客</h4>
                <div class="ui inverted link list">
                    <a href="#" class="item m-text-thin">最新博客1</a>
                    <a href="#" class="item m-text-thin">最新博客2</a>
                    <a href="#" class="item m-text-thin">最新博客3</a>
                </div>
            </div>
            <div class="three wide column">
                <h4 class="ui inverted header m-text-thin m-text-spaced ">联系我</h4>
                <div class="ui inverted link list">
                    <a href="#" class="item m-text-thin">Email：2541002015@qq.com</a>
                    <a href="#" class="item m-text-thin">QQ：2541002015</a>
                </div>
            </div>
            <div class="seven wide column">
                <h4 class="ui inverted header m-text-thin m-text-spaced ">Blog</h4>
                <p class="m-text-thin m-text-spaced m-opacity-mini">这是我的个人博客、记录学习进度和关于编程、写作、思考相关的任何内容...</p>
            </div>
        </div>
        <div class="ui inverted section divider"></div>
        <p class="m-text-thin m-text-spaced m-opacity-tiny">Copyright © 2021 - 2021 Tiankaicong Designed by Tiankaicong</p>
    </div>


</footer>
```

### 管理员登录示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A13.png)

```
<!--管理员登录-->
<div class="m-container m-padded-tb-massive" style="max-width: 30em !important">
    <div class="ui container">
        <div class="ui middle aligned center aligned grid">
            <div class="column">
                <h2 class="ui teal image header">
                    <div class="content">
                       管理后台登录
                    </div>
                </h2>
                <form class="ui large form" method="post"  th:action="@{/admin/login}">
                    <div class="ui segment">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="user icon"></i>
                                <input type="text" name="username" placeholder="用户名">
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="lock icon"></i>
                                <input type="password" name="password" placeholder="密码">
                            </div>
                        </div>
                        <button class="ui fluid large teal submit button">登   录</button>
                    </div>
                    <div class="ui error message"></div>
                    <div class="ui mini negative message" th:unless="${#strings.isEmpty(message)}" th:text="${message}">用户名或密码错误</div>
                </form>
            </div>
        </div>
    </div>
</div>
```
### 博客内容简介示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A14.png)


```
<!--博客内容简介示例-->
<div class="ui padded vertical segment m-padded-tb-large" th:each="blog : ${page.content}">
    <div class="ui middle aligned mobile reversed stackable grid" >
        <div class="eleven wide column">
            <h3 class="ui header" ><a href="#" th:href="@{/blog/{id}(id=${blog.id})}" target="_blank" class="m-black" th:text="${blog.title}">读后感</a></h3>
            <p class="m-text"><a href="#" th:href="@{/blog/{id}(id=${blog.id})}" target="_blank" th:text="|${blog.description}......|" class="m-black">《全球通史：从史前到21世纪》是全球史观的奠基之作，也是全球史的集大成者…...</a></p>
            <div class="ui grid">
                <div class="eleven wide column">
                    <div class="ui mini horizontal link list">
                        <div class="item">
                            <img src="http://cdn.xiongsihao.com/avatar.png" th:src="@{${blog.user.avatar}}"  alt="" class="ui avatar image">
                            <div class="content"><a href="#" class="header" th:text="${blog.user.nickname}" >田开聪</a></div>
                        </div>
                        <div class="item">
                            <i class="calendar icon"></i><span th:text="${#dates.format(blog.updateTime,'yyyy-MM-dd')}">2021-03-27</span>
                        </div>
                        <div class="item">
                            <i class="eye icon"></i> <span th:text="${blog.views}">123</span>
                        </div>
                    </div>
                </div>
                <div class="right aligned five wide column">
                    <a href="#" target="_blank" class="ui teal basic label m-padded-tiny m-text-thin" th:text="${blog.type.name}">认知升级</a>
                </div>
            </div>
        </div>

        <div class="five wide column">
            <a href="#" th:href="@{/blog/{id}(id=${blog.id})}" target="_blank">
                <img src="https://unsplash.it/800/450?image=1005" th:src="@{${blog.firstPicture}}"  alt="" class="ui rounded image">
            </a>
        </div>


    </div>
</div>
```
### 分类标题示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A15.png)

```
<!--分类标题示例-->
<div class="ui top attached segment ">
  <div class="ui middle aligned two column grid ">
    <div class="column">
      <h3 class="ui teal header">分类</h3>
    </div>
    <div class="right aligned column">
      共 <h2 class="ui orange header m-inline-block m-text-thin" th:text="${#arrays.length(types)}"> 7 </h2> 个
    </div>
  </div>
</div>

<div class="ui attached segment m-padded-tb-large animate__animated animate__fadeIn">
  <div class="ui labeled button m-margin-tb-tiny" th:each="type : ${types}">
    <a href="#" th:href="@{/types/{id}(id=${type.id})}" class="ui basic  button" th:classappend="${type.id==activeTypeId} ? 'teal'" th:text="${type.name}">二十四画生</a>
    <div class="ui basic  left pointing label" th:classappend="${type.id==activeTypeId} ? 'teal'" th:text="${#arrays.length(type.blogs)}">5</div>
  </div>
</div>
```

### 标签标题示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A16.png)

```
<!--标签标题示例-->
<div class="ui top attached segment">
  <div class="ui middle aligned two column grid">
    <div class="column">
      <h3 class="ui teal header">标签</h3>
    </div>
    <div class="right aligned column">
      共 <h2 class="ui orange header m-inline-block m-text-thin" th:text="${#arrays.length(tags)}"> 4 </h2> 个
    </div>
  </div>
</div>
<div class="ui attached segment m-padded-tb-large  animate__animated animate__fadeIn">
  <a href="#" th:href="@{/tags/{id}(id=${tag.id})}"  class="ui basic left pointing large label m-margin-tb-tiny" th:classappend="${tag.id==activeTagId} ? 'teal'" th:each="tag : ${tags}">
    <span th:text="${tag.name}">而我国为</span> <div class="detail" th:text="${#arrays.length(tag.blogs)}">5</div>
  </a>
</div>
```

### 归档内容示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A17.png)


```
<!--归档内容示例-->

<div class="ui fluid vertical menu animate__animated animate__bounceInUp">
  <a href="#" th:href="@{/blog/{id}(id=${blog.id})}" target="_blank" class="item" th:each="blog : ${item.value}">
    <span>
      <i class="mini teal circle icon"></i><span th:text="${blog.title}">博客1</span>
      <div class="ui teal basic left pointing label m-padded-mini " th:text="${#dates.format(blog.updateTime,'MMMdd')}">三月26</div>
    </span>
  </a>
  <!--/*-->
  <a href="#" target="_blank" class="item">
    <span>
      <i class="mini teal circle icon"></i>测试
      <div class="ui teal basic left pointing label m-padded-mini ">三月26</div>
    </span>
  </a>
   <a href="#" target="_blank" class="item">
    <span>
      <i class="mini teal circle icon"></i>测试
      <div class="ui teal basic left pointing label m-padded-mini ">三月26</div>
    </span>
  </a>
   <a href="#" target="_blank" class="item">
    <span>
      <i class="mini teal circle icon"></i>测试
      <div class="ui teal basic left pointing label m-padded-mini ">三月26</div>
    </span>
  </a>
  <!--*/-->
</div>
```

### 博客文章后台管理示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A18.png)

```
<!--博客文章后台管理示例-->
<table th:fragment="blogList" class="ui compact teal table">
    <thead>
    <tr>
        <th></th>
        <th>标题</th>
        <th>类型</th>
        <th>推荐</th>
        <th>状态</th>
        <th>更新时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="blog,iterStat : ${page.content}">
        <td th:text="${iterStat.count}">1</td>
        <td th:text="${blog.title}">读后感</td>
        <td th:text="${blog.type.name}">认知升级</td>
        <td th:text="${blog.recommend} ? '是':'否'">是</td>
        <td th:text="${blog.published} ? '发布':'草稿'">草稿</td>
        <td th:text="${blog.updateTime}">2021-03-27 16:41:30.351</td>
        <td>
            <a href="#" th:href="@{/admin/blogs/{id}/input(id=${blog.id})}" class="ui mini teal basic button">编辑</a>
            <a href="#" th:href="@{/admin/blogs/{id}/delete(id=${blog.id})}" class="ui mini red basic button">删除</a>
        </td>
    </tr>
    </tbody>
    <tfoot>
    <tr>
        <th colspan="7">
            <div class="ui mini pagination menu" th:if="${page.totalPages}>1" >
                <a onclick="page(this)" th:attr="data-page=${page.number}-1" class="item" th:unless="${page.first}">上一页</a>
                <a onclick="page(this)" th:attr="data-page=${page.number}+1" class=" item" th:unless="${page.last}">下一页</a>
            </div>
            <a href="#" th:href="@{/admin/blogs/input}" class="ui mini right floated teal basic button">新增</a>
        </th>
    </tr>
    </tfoot>
</table>
```

### 博客分类后台管理示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A19.png)


```
<!--博客分类后台管理示例-->
<table class="ui compact teal table">
  <thead>
    <tr>
      <th></th>
      <th>名称</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody>
    <tr th:each="type,iterStat : ${page.content}">
      <td th:text="${iterStat.count}">1</td>
      <td th:text="${type.name}">eryrtu56</td>
      <td>
        <a href="#" th:href="@{/admin/tags/{id}/input(id=${type.id})}" class="ui mini teal basic button">编辑</a>
        <a href="#" th:href="@{/admin/tags/{id}/delete(id=${type.id})}" class="ui mini red basic button">删除</a>
      </td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <th colspan="6" >
        <div class="ui mini pagination menu" th:if="${page.totalPages}>1">
          <a th:href="@{/admin/tags(page=${page.number}-1)}" class="  item" th:unless="${page.first}">上一页</a>
          <a th:href="@{/admin/tags(page=${page.number}+1)}" class=" item" th:unless="${page.last}">下一页</a>
        </div>
        <a href="#" th:href="@{/admin/tags/input}"  class="ui mini right floated teal basic button">新增</a>
      </th>
    </tr>
  </tfoot>
</table>
```

### 博客标签后台管理示例：


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A1/%E9%A1%B5%E9%9D%A2%E8%AE%BE%E8%AE%A110.png)


```
<!--博客标签后台管理示例-->
<table class="ui celled table">
    <thead>
    <tr>
        <th></th>
        <th>名称</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="type,iterStat : ${page.content}">
        <td th:text="${iterStat.count}">1</td>
        <td th:text="${type.name}">测试</td>
        <td>
            <a href="#" th:href="@{/admin/types/{id}/input(id=${type.id})}" class="ui mini teal button">编辑</a>
            <a href="#" th:href="@{/admin/types/{id}/delete(id=${type.id})}" class="ui mini red button">删除</a>
        </td>
    </tr>
    </tbody>
    <tfoot>
    <tr>
        <th colspan="6" >
            <div class="ui mini pagination menu" th:if="${page.totalPages}>1">
                <a th:href="@{/admin/types/(page=${page.number}-1)}" class="item" th:unless="${page.first}">上一页</a>
                <a th:href="@{/admin/types/(page=${page.number}+1)}" class="item" th:unless="${page.last}">下一页</a>
            </div>
            <a href="#" th:href="@{/admin/types/input}" class="ui right floated mini teal basic button">新增</a>
        </th>
    </tr>
    </tfoot>
</table>
```

# 管理员登录

## 数据库层

t_user

```
@Entity
@Table(name="t_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;


    @OneToMany(mappedBy = "user")
    private List<Blog> blogs = new ArrayList<>();

       //User类的一些实例方法..
    }
}
```

## 持久层 

```
public interface UserRepositiry extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username,String password);
}
```

## 业务逻辑层


```
public interface UseService {
    User checkUser(String username,String password);
}



public class UserServiceImpl implements UseService{

    @Autowired
    private UserRepositiry userRepositiry;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepositiry.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

}
```


## 请求处理层


```
@Controller
@RequestMapping("/admin")
public class LoginController {


    @Autowired
    private UseService useService;


    @GetMapping
    public String loginPage(){
        return "admin/login";
    }


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

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";

    }

}
```

## 页面显示层



```
<!--管理员登录-->
<div class="m-container m-padded-tb-massive" style="max-width: 30em !important">
    <div class="ui container">
        <div class="ui middle aligned center aligned grid">
            <div class="column">
                <h2 class="ui teal image header">
                    <div class="content">
                       管理后台登录
                    </div>
                </h2>
                <form class="ui large form" method="post"  th:action="@{/admin/login}">
                    <div class="ui segment">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="user icon"></i>
                                <input type="text" name="username" placeholder="用户名">
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="lock icon"></i>
                                <input type="password" name="password" placeholder="密码">
                            </div>
                        </div>
                        <button class="ui fluid large teal submit button">登   录</button>
                    </div>
                    <div class="ui error message"></div>
                    <div class="ui mini negative message" th:unless="${#strings.isEmpty(message)}" th:text="${message}">用户名或密码错误</div>
                </form>
            </div>
        </div>
    </div>
</div>
```


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E7%AE%A1%E7%90%86%E5%91%98%E7%99%BB%E5%BD%95/Image.png)



# 博客管理

## 数据库层

t_blog


```
@Entity
@Table(name="t_blog")
public class Blog {

    @Id
    @GeneratedValue
    private Long id;

    @Basic(fetch = FetchType.LAZY)
    @Lob
    private String description;

    private String title;
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @ManyToOne
    private Type type;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    private User user;

    @Transient
    private String tagIds;

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

    public Blog(){


    }

```

## 持久层

```
public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {


    @Query("select b from Blog b where b.published=true and b in(select b from Blog b where b.title like ?1 or b.description like ?1)")
    Page<Blog> findByQuery(String query,Pageable pageable);


    @Transactional
    @Modifying
    @Query("update Blog b set b.views = b.views+1 where b.id = ?1")
    int updateViews(Long id);

    @Query("select function('date_format',b.updateTime,'%Y') as year from Blog b group by function('date_format',b.updateTime,'%Y') order by year desc ")
    List<String> findGroupYear();

    @Query("select b from Blog b where function('date_format',b.updateTime,'%Y') = ?1 and b.published=true")
    List<Blog> findByYear(String year);

    @Query("select b from Blog b where b.recommend=true and b.published=true")
    List<Blog> findTop(Pageable pageable);

    @Override
    @Query("select b from Blog b where b.published=true")
    Page<Blog> findAll(Pageable pageable);


    @Query("select b from Blog b where b.published=true")
    List<Blog> findNewBlog(Pageable pageable);

    @Query("select count(b.id) from Blog b where b.published=true")
    Long countBlog();
}
```

## 业务逻辑层

```
public interface BlogService {


    Blog getBlog(Long id);


    Blog getAndConvert(Long id);


    Page<Blog> listBlog(Pageable pageable,BlogQuery blog);


    Page<Blog> listBlog(Pageable pageable);


    Page<Blog> listBlog(Long tagId,Pageable pageable);


    Page<Blog> listBlog(String query,Pageable pageable);


    List<Blog> listRecommendBlogTop(Integer size);


    Map<String,List<Blog>> archiveBlog();


    Long countBlog();


    Blog saveBlog(Blog blog);


    Blog updateBlog(Long id,Blog blog);


    void deleteBlog(Long id);


    Page<Blog> listBlog(Long tagId,Pageable pageable,BlogQuery blog);
}



@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogRepository blogRepository;


    @Override
    public Blog getBlog(Long id) {
        return blogRepository.findById(id).get();
    }


    @Transactional
    @Override
    public Blog getAndConvert(Long id) {
        Blog blog = blogRepository.findById(id).get();
        if (blog == null) {
            throw new NotFoundException("该博客不存在");
        }
        Blog b = new Blog();
        BeanUtils.copyProperties(blog,b);
        blogRepository.updateViews(id);
        return b;
    }
    @Override
    public Page<Blog> listBlog(Long tagIds, Pageable pageable, BlogQuery blog) {
        return blogRepository.findAll(new Specification<Blog>() {
            @Override
            public Predicate toPredicate(Root<Blog> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                List<Predicate> predicates=new ArrayList<>();
                if(blog.isPublished()){   //根据博客是否已发布查询，过滤掉状态为草稿的博客
                    predicates.add(cb.equal(root.<Boolean>get("published"),blog.isPublished()));
                }
                Join join=root.join("tags");
                predicates.add(cb.equal(join.get("id"),tagIds));
                cq.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        },pageable);
    }




    @Override
    public Page<Blog> listBlog(Pageable pageable, BlogQuery blog) {
        return blogRepository.findAll(new Specification<Blog>() {
            @Override
            public Predicate toPredicate(Root<Blog> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (!"".equals(blog.getTitle()) && blog.getTitle() != null) {
                    predicates.add(cb.like(root.<String>get("title"), "%"+blog.getTitle()+"%"));
                }
                if (blog.getTypeId() != null) {
                    predicates.add(cb.equal(root.<Type>get("type").get("id"), blog.getTypeId()));
                }
                if (blog.isRecommend()) {
                    predicates.add(cb.equal(root.<Boolean>get("recommend"), blog.isRecommend()));
                }
                cq.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        },pageable);
    }


    @Override
    public Page<Blog> listBlog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }


    @Override
    public Page<Blog> listBlog(Long tagIds, Pageable pageable) {
        return blogRepository.findAll(new Specification<Blog>() {
            @Override
            public Predicate toPredicate(Root<Blog> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                Join join = root.join("tags");
                return cb.equal(join.get("id"),tagIds);
            }
        },pageable);
    }


    @Override
    public Page<Blog> listBlog(String query, Pageable pageable) {
        return blogRepository.findByQuery(query,pageable);
    }


    @Override
    public List<Blog> listRecommendBlogTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"updateTime");
        Pageable pageable = PageRequest.of(0, size, sort);
        return blogRepository.findTop(pageable);
    }


    @Override
    public Map<String, List<Blog>> archiveBlog() {
        List<String> years = blogRepository.findGroupYear();
        Map<String, List<Blog>> map = new HashMap<>();
        for (String year : years) {
            map.put(year, blogRepository.findByYear(year));
        }
        return map;
    }


    @Override
    public Long countBlog() {
        return blogRepository.count();
    }




    @Transactional
    @Override
    public Blog saveBlog(Blog blog) {
        if (blog.getId() == null) {
            blog.setCreateTime(new Date());
            blog.setUpdateTime(new Date());
            blog.setViews(0);
        } else {
            blog.setUpdateTime(new Date());
        }
        return blogRepository.save(blog);
    }


    @Transactional
    @Override
    public Blog updateBlog(Long id, Blog blog) {
        Blog b = blogRepository.findById(id).get();
        if (b == null) {
            throw new NotFoundException("该博客不存在");
        }
        BeanUtils.copyProperties(blog,b, MyBeanUtils.getNullPropertyNames(blog));
        b.setUpdateTime(new Date());
        return blogRepository.save(b);
    }


    @Transactional
    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
```

## 请求处理层

```
@Controller
@RequestMapping("/admin")
public class BlogController {


    private static final String INPUT="admin/blogs-input";
    private static final String LIST="admin/blogs";
    private static final String REDIRECT_LIST="redirect:/admin/blogs";

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagService tagService;

    @GetMapping("/blogs")
    public String blogs(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable, BlogQuery blog, Model model){
        model.addAttribute("types",typeService.listType());
        model.addAttribute("page",blogService.listBlog(pageable,blog));
        return "admin/blogs";
    }

    @PostMapping("/blogs/search")
    public String search(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable, BlogQuery blog, Model model){
        model.addAttribute("page",blogService.listBlog(pageable,blog));
        return "admin/blogs ::blogList"; //返回admin/blogs页面下的一个片段blogList,实现局部刷新
    }

    @GetMapping("/blogs/input")
    public String input(Model model){
        setTypeAndTag(model);
        model.addAttribute("blog",new Blog());
        return INPUT;
    }

    public void setTypeAndTag(Model model){
        model.addAttribute("types",typeService.listType()); //获取所有分类
        model.addAttribute("tags",tagService.listTag());  //获取所有标签
    }

    @GetMapping("/blogs/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        setTypeAndTag(model);
        Blog blog=blogService.getBlog(id);
        blog.init(); //初始化，将标签数组转换为字符串
        model.addAttribute("blog",blog);
        return INPUT;
    }

    @PostMapping("/blogs")
    public String post(Blog blog, RedirectAttributes attributes,HttpSession session){
        blog.setUser((User) session.getAttribute("user"));
        blog.setType(typeService.getType(blog.getType().getId()));
        blog.setTags(tagService.listTag(blog.getTagIds()));
        Blog b;
        if (blog.getId() == null) {
            b =  blogService.saveBlog(blog); //id为空，执行新建操作
        } else {
            b = blogService.updateBlog(blog.getId(), blog); //id有值，执行更新操作
        }
        if(b == null){
            attributes.addFlashAttribute("message","操作失败");
        }else {
            attributes.addFlashAttribute("message","操作成功");
        }
        return REDIRECT_LIST;
    }

    @GetMapping("/blogs/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes){
        blogService.deleteBlog(id);
        attributes.addFlashAttribute("message","删除成功");
        return REDIRECT_LIST;
    }


}
```

## 页面显示层

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E5%8D%9A%E5%AE%A2%E7%AE%A1%E7%90%86/%E5%8D%9A%E5%AE%A2%E7%AE%A1%E7%90%861.png)


```
<!--博客文章后台管理示例-->
<table th:fragment="blogList" class="ui compact teal table">
    <thead>
    <tr>
        <th></th>
        <th>标题</th>
        <th>类型</th>
        <th>推荐</th>
        <th>状态</th>
        <th>更新时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="blog,iterStat : ${page.content}">
        <td th:text="${iterStat.count}">1</td>
        <td th:text="${blog.title}">读后感</td>
        <td th:text="${blog.type.name}">认知升级</td>
        <td th:text="${blog.recommend} ? '是':'否'">是</td>
        <td th:text="${blog.published} ? '发布':'草稿'">草稿</td>
        <td th:text="${blog.updateTime}">2021-03-27 16:41:30.351</td>
        <td>
            <a href="#" th:href="@{/admin/blogs/{id}/input(id=${blog.id})}" class="ui mini teal basic button">编辑</a>
            <a href="#" th:href="@{/admin/blogs/{id}/delete(id=${blog.id})}" class="ui mini red basic button">删除</a>
        </td>
    </tr>
    </tbody>
    <tfoot>
    <tr>
        <th colspan="7">
            <div class="ui mini pagination menu" th:if="${page.totalPages}>1" >
                <a onclick="page(this)" th:attr="data-page=${page.number}-1" class="item" th:unless="${page.first}">上一页</a>
                <a onclick="page(this)" th:attr="data-page=${page.number}+1" class=" item" th:unless="${page.last}">下一页</a>
            </div>
            <a href="#" th:href="@{/admin/blogs/input}" class="ui mini right floated teal basic button">新增</a>
        </th>
    </tr>
    </tfoot>
</table>
```

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E5%8D%9A%E5%AE%A2%E7%AE%A1%E7%90%86/%E5%8D%9A%E5%AE%A2%E7%AE%A1%E7%90%862.png)


```
<div class="ui container">
        <form id="blog-form" action="#" th:object="${blog}" th:action="@{/admin/blogs}" method="post" class="ui form">
            <input type="hidden" name="published" th:value="*{published}">
            <input type="hidden" name="id" th:value="*{id}">
            <div class="required field">
                <div class="ui left labeled input">
                    <div class="ui selection compact teal basic dropdown label">
                        <input type="hidden" value="原创" name="flag" th:value="*{flag}" >
                        <i class="dropdown icon"></i>
                        <div class="text">原创</div>
                        <div class="menu">
                            <div class="item" data-value="原创">原创</div>
                            <div class="item" data-value="转载">转载</div>
                            <div class="item" data-value="翻译">翻译</div>
                        </div>
                    </div>
                    <input type="text" name="title" placeholder="标题" th:value="*{title}">
                </div>
            </div>

            <div class="two fields">
                <div class="required field">
                    <div class="ui left labeled action input">
                        <label class="ui compact teal basic label">分类</label>
                        <div class="ui fluid selection dropdown">
                            <input type="hidden" name="type.id" th:value="*{type}!=null ? *{type.id}">
                            <i class="dropdown icon"></i>
                            <div class="default text">分类</div>
                            <div class="menu">
                                <div th:each="type : ${types}" class="item" data-value="1" th:data-value="${type.id}" th:text="${type.name}">错误日志</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class=" field">
                    <div class="ui left labeled action input">
                        <label class="ui compact teal basic label">标签</label>
                        <div class="ui fluid selection multiple search  dropdown">
                            <input type="hidden" name="tagIds" th:value="*{tagIds}" >
                            <i class="dropdown icon"></i>
                            <div class="default text">标签</div>
                            <div class="menu">
                                <div th:each="tag : ${tags}" class="item" data-value="1" th:data-value="${tag.id}" th:text="${tag.name}">java</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="required field">
                <div class="ui left labeled input">
                    <label class="ui teal basic label">首图</label>
                    <input type="text" name="firstPicture" th:value="*{firstPicture}" placeholder="首图引用地址">
                </div>
            </div>


            <div class="required field">
                <textarea name="description" th:text="*{description}" placeholder="博客描述..." maxlength="100"></textarea>
            </div>


            <div class="required field">
                <div id="md-content" style="z-index: 1 !important;">
                    <textarea name="content" th:text="*{content}" placeholder="博客内容" >
                    </textarea>
                </div>
            </div>


            <div class="inline fields">
                <div class="field">
                    <div class="ui checkbox">
                        <input type="checkbox" id="recommend" name="recommend" checked th:checked="*{recommend}" class="hidden">
                        <label for="recommend">推荐</label>
                    </div>
                </div>
                <div class="field">
                    <div class="ui checkbox">
                        <input type="checkbox" id="shareStatement" name="shareStatement" th:checked="*{shareStatement}" class="hidden">
                        <label for="shareStatement">转载声明</label>
                    </div>
                </div>
                <div class="field">
                    <div class="ui checkbox">
                        <input type="checkbox" id="appreciation" name="appreciation" th:checked="*{appreciation}" class="hidden">
                        <label for="appreciation">赞赏</label>
                    </div>
                </div>
                <div class="field">
                    <div class="ui checkbox">
                        <input type="checkbox" id="commentabled" name="commentabled" th:checked="*{commentabled}" class="hidden">
                        <label for="commentabled">评论</label>
                    </div>
                </div>
            </div>


            <div class="ui error message"></div>


            <div class="ui right aligned container">
                <button type="button" class="ui button" onclick="window.history.go(-1)" >返回</button>
                <button type="button" id="save-btn" class="ui secondary button">保存</button>
                <button type="button" id="publish-btn" class="ui teal button">发布</button>
            </div>


        </form>
    </div>

```


# 标签管理

## 数据库层

t_tag


```
@Entity
@Table(name="t_tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

    public Tag(){
    }
}
```

## 持久层


```
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
```


## 业务逻辑层


```
public interface TagService {
    Tag saveTag(Tag type);
    Tag getTag(Long id);
    Tag getTagByName(String name);
    Page<Tag> listTag(Pageable pageable);
    List<Tag> listTag();
    List<Tag> listTagTop(Integer size);
    List<Tag> listTag(String ids);
    Tag updateTag(Long id, Tag type);
    void deleteTag(Long id);
}
```

```
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepository tagRepository;

    @Transactional
    @Override
    public Tag saveTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Transactional
    @Override
    public Tag getTag(Long id) {
        return tagRepository.findById(id).get();
    }

    @Override
    public Tag getTagByName(String name) {
        return tagRepository.findByName(name);
    }


    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }

    @Override
    public List<Tag> listTag() {
        return tagRepository.findAll();
    }

    @Override
    public List<Tag> listTagTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC, "blogs.size");
        Pageable pageable=PageRequest.of(0,size,sort);
        return tagRepository.findTop(pageable);
    }

    @Override
    public List<Tag> listTag(String ids) { //1,2,3
        return tagRepository.findAllById(convertToList(ids));
    }


    private List<Long> convertToList(String ids) {
        List<Long> list = new ArrayList<>();
        if (!"".equals(ids) && ids != null) {
            String[] idarray = ids.split(",");
            for (int i=0; i < idarray.length;i++) {
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }

    @Transactional
    @Override
    public Tag updateTag(Long id, Tag tag) {
        Tag t = tagRepository.findById(id).get();
        if (t == null) {
            throw new NotFoundException("不存在该标签");
        }
        BeanUtils.copyProperties(tag,t);
        return tagRepository.save(t);
    }

    @Transactional
    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
}
```


## 请求处理层

```
@Controller
@RequestMapping("/admin")
public class TagController {


    @Autowired
    private TagService tagService;


    @GetMapping("/tags")
    public String tags(@PageableDefault(size = 10,sort = {"id"},direction = Sort.Direction.DESC)
                               Pageable pageable, Model model) {
        model.addAttribute("page",tagService.listTag(pageable));
        return "admin/tags";
    }


    @GetMapping("/tags/input")
    public String input(Model model) {
        model.addAttribute("tag", new Tag());
        return "admin/tags-input";
    }


    @GetMapping("/tags/{id}/input")
    public String editInput(@PathVariable Long id, Model model) {
        model.addAttribute("tag", tagService.getTag(id));
        return "admin/tags-input";
    }




    @PostMapping("/tags")
    public String post(Tag tag,BindingResult result, RedirectAttributes attributes) {
        Tag tag1 = tagService.getTagByName(tag.getName());
        if (tag1 != null) {
            result.rejectValue("name","nameError","不能添加重复的标签");
        }
        if (result.hasErrors()) {
            return "admin/tags-input";
        }
        Tag t = tagService.saveTag(tag);
        if (t == null ) {
            attributes.addFlashAttribute("message", "新增失败");
        } else {
            attributes.addFlashAttribute("message", "新增成功");
        }
        return "redirect:/admin/tags";
    }




    @PostMapping("/tags/{id}")
    public String editPost(Tag tag, BindingResult result,@PathVariable Long id, RedirectAttributes attributes) {
        Tag tag1 = tagService.getTagByName(tag.getName());
        if (tag1 != null) {
            result.rejectValue("name","nameError","不能添加重复的标签");
        }
        if (result.hasErrors()) {
            return "admin/tags-input";
        }
        Tag t = tagService.updateTag(id,tag);
        if (t == null ) {
            attributes.addFlashAttribute("message", "更新失败");
        } else {
            attributes.addFlashAttribute("message", "更新成功");
        }
        return "redirect:/admin/tags";
    }


    @GetMapping("/tags/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes attributes) {
        tagService.deleteTag(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/tags";
    }

}
```

## 页面显示层

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E6%A0%87%E7%AD%BE%E7%AE%A1%E7%90%86/Image.png)

```
<!--博客标签后台管理示例-->
<table class="ui celled table">
    <thead>
    <tr>
        <th></th>
        <th>名称</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="type,iterStat : ${page.content}">
        <td th:text="${iterStat.count}">1</td>
        <td th:text="${type.name}">测试</td>
        <td>
            <a href="#" th:href="@{/admin/types/{id}/input(id=${type.id})}" class="ui mini teal button">编辑</a>
            <a href="#" th:href="@{/admin/types/{id}/delete(id=${type.id})}" class="ui mini red button">删除</a>
        </td>
    </tr>
    </tbody>
    <tfoot>
    <tr>
        <th colspan="6" >
            <div class="ui mini pagination menu" th:if="${page.totalPages}>1">
                <a th:href="@{/admin/types/(page=${page.number}-1)}" class="item" th:unless="${page.first}">上一页</a>
                <a th:href="@{/admin/types/(page=${page.number}+1)}" class="item" th:unless="${page.last}">下一页</a>
            </div>
            <a href="#" th:href="@{/admin/types/input}" class="ui right floated mini teal basic button">新增</a>
        </th>
    </tr>
    </tfoot>
</table>
```


# 分类管理

## 数据库层

t_type

```
Entity
@Table(name="t_type")
public class Type {
    @Id
    @GeneratedValue
    private Long id;
//    @NotBlank(message="分类名称不能为空")


    private String name;


    @OneToMany(mappedBy="type")
    private List<Blog> blogs = new ArrayList<>();

    public Type(){

    }
}
```

## 持久层

```
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
```


## 业务逻辑层

```
public interface TypeService {


    Type saveType(Type type);
    Type getType(Long id);
    Type getTypeByname(String name);
    Page<Type> listType(Pageable pageable);
    Type updateType(Long id,Type type);
    void deleteType(Long id);
    List<Type> listType();


    List<Type> listTypeTop(Integer size);
}
```

```
@Service
public class TypeServiceImpl implements TypeService{
    
    @Autowired
    private TypeRepository typeRepository;


    @Transactional
    @Override
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.findById(id).get();
    }


    @Override
    public Type getTypeByname(String name) {
        return typeRepository.findByName(name);
    }


    @Transactional
    @Override
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }


    @Override
    public List<Type> listTypeTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"blogs.size");
        Pageable pageable =PageRequest.of(0,size,sort);
        return typeRepository.findTop(pageable);
    }

    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t = typeRepository.findById(id).get();
        if(t==null){
            throw new NotFoundException("不存在该类型");
        }
        BeanUtils.copyProperties(type,t);


        return typeRepository.save(t);
    }

    @Transactional
    @Override
    public void deleteType(Long id) {
        typeRepository.deleteById(id);


    }

    @Override
    public List<Type> listType() {
        return typeRepository.findAll();
    }
}
```

## 请求处理层

```
@Controller
@RequestMapping("/admin")
public class TypeController {
    @Autowired
    private TypeService typeService;
    @GetMapping("/types")
    public String types(@PageableDefault(size=4,sort={"id"},direction = Sort.Direction.DESC) Pageable pageable, Model model){


        model.addAttribute("page",typeService.listType(pageable));


        return "admin/types";
    }
    @GetMapping("/types/input")
    public String input(Model model){
        model.addAttribute("type",new Type());
        return "admin/types-input";
    }

    @GetMapping("/types/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("type",typeService.getType(id));
        return "admin/types-input";
    }

    @PostMapping("/types")
    public String post(Type type,BindingResult result,RedirectAttributes attributes){


        Type type1 = typeService.getTypeByname(type.getName());
        if(type1 != null){
            result.rejectValue("name","nameError","不能重复添加分类");
        }
        if(result.hasErrors()){
            return "admin/types-input";
        }


        Type t = typeService.saveType(type);
        if(t==null){
          attributes.addFlashAttribute("message","新增失败");
        }else{
          attributes.addFlashAttribute("message","新增成功");
        }
        return "redirect:/admin/types";
    }

    @PostMapping("/types/{id}")
    public String editpost(Type type,BindingResult result,@PathVariable Long id,RedirectAttributes attributes){


        Type type1 = typeService.getTypeByname(type.getName());
        if(type1 != null){
            result.rejectValue("name","nameError","不能重复添加分类");
        }
        if(result.hasErrors()){
            return "admin/types-input";
        }


        Type t = typeService.updateType(id,type);
        if(t==null){
            attributes.addFlashAttribute("message","更新失败");
        }else{
            attributes.addFlashAttribute("message","更新成功");
        }
        return "redirect:/admin/types";
    }

    @GetMapping("/types/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes attributes){
        typeService.deleteType(id);
        attributes.addFlashAttribute("message","删除成功");
        return "redirect:/admin/types";
    }

}
```

## 页面显示层


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E5%88%86%E7%B1%BB%E7%AE%A1%E7%90%86/Image.png)


```
<!--博客分类后台管理示例-->
<table class="ui compact teal table">
  <thead>
    <tr>
      <th></th>
      <th>名称</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody>
    <tr th:each="type,iterStat : ${page.content}">
      <td th:text="${iterStat.count}">1</td>
      <td th:text="${type.name}">eryrtu56</td>
      <td>
        <a href="#" th:href="@{/admin/tags/{id}/input(id=${type.id})}" class="ui mini teal basic button">编辑</a>
        <a href="#" th:href="@{/admin/tags/{id}/delete(id=${type.id})}" class="ui mini red basic button">删除</a>
      </td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <th colspan="6" >
        <div class="ui mini pagination menu" th:if="${page.totalPages}>1">
          <a th:href="@{/admin/tags(page=${page.number}-1)}" class="  item" th:unless="${page.first}">上一页</a>
          <a th:href="@{/admin/tags(page=${page.number}+1)}" class=" item" th:unless="${page.last}">下一页</a>
        </div>
        <a href="#" th:href="@{/admin/tags/input}"  class="ui mini right floated teal basic button">新增</a>
      </th>
    </tr>
  </tfoot>
</table>
```

#  部署到云服务器


1、购买腾讯云服务器

在腾讯云官网上，购买云服务器，在购买完成后，打开控制台，在主IPV4地址下可以看到公网ip地址和私有网ip地址，项目最终需要绑定在公网ip地址


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B21.png)


服务器的系统配置为


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B22.png)


2、购买域名

购买腾讯云域名，选择自己合适的网站名即可
进入DNS控制台，解析域名，保持正常状态


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B23.png)


3、安装XFTP

登录[XFTP官网](https://www.netsarang.com/zh/xftp/)，下载XFTP
通过云服务器的公网ip地址，和自己设置的用户名，密码，通过xftp连接云服务器


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B24.png)


连接云服务器


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B25.png)


4、安装宝塔linux版

在云服务控制台，使用远程登录，打开服务器

输入下面语句，安装宝塔linux版，遇到安装提示，输入y即可

```
yum install -y wget && wget -O install.sh http://download.bt.cn/install/install_6.0.sh && sh install.sh
```

安装完成后，得到访问网址和密码，进行保存

通过面板上的外网访问网址，以及用户名和密码登入宝塔面板

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B26.png)



5、安装tomcat8.0

初始的服务器，里面没有装jdk8，可以通过直接安装tomcat8，里面自带jdk8版本

在宝塔面板的软件商店里，搜索tomcat,选择tomcat8进行一键安装即可

6、添加数据库sql

首先需要将spring boot项目中的数据导出为sql文件。在SQL的bin目录下，使用mysqldump命令即可导出


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B27.png)

在宝塔面板上的数据库，添加数据库

![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B28.png)



添加完成后，将sql文件导入进数据库即可

7、Maven打包成jar包

在IDEA中，修改pom.xml配置文件，添加下面一句，将packaging设置为jar包


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B29.png)

之后，双击Maven的clean命令，和package命令，将spring boot项目，导入到文件目录的target下，找到jar包


8、修改配置文件

将spring 项目中的application.yml文件复制，粘贴到和jar包，同一个目录下，修改端口号为8086


server:
  port: 8086

9、导入云服务器

通过xftp，将jar包和yml配置文件，放在/home目录下


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B210.png)


10、启动项目

在宝塔面板上，放行8086端口
在宝塔的安全栏中，进行设置


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B211.png)

在云服务器控制台输入以下命令

```
nohup java -jar blog.jar &
```
运行成功后，在浏览器输入 公网ip:8086 ，即可访问到博客页面


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B212.png)





在DNS域名的控制台中，进入域名的记录管理页面，添加记录，记录值为云服务器的公网IP


![image](https://github.com/tsdlrh/Blog_image/blob/master/%E9%83%A8%E7%BD%B2%E5%88%B0%E4%BA%91%E6%9C%8D%E5%8A%A1%E5%99%A8/%E9%83%A8%E7%BD%B213.png)


在宝塔面板上，点击网站，添加站点，将自己的域名，添加即可

在浏览器输入 域名：8086 即可访问博客首页

使用反向代理，可以将8086替换掉

部署到此完成


