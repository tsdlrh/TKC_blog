package com.tkcblog.blog.web.admin;

import com.tkcblog.blog.po.Blog;
import com.tkcblog.blog.po.User;
import com.tkcblog.blog.service.BlogService;
import com.tkcblog.blog.service.TagService;
import com.tkcblog.blog.service.TypeService;
import com.tkcblog.blog.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author : xsh
 * @create : 2020-02-08 - 1:03
 * @describe:
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    //定义返回的字符串响应路径
    private static final String INPUT="admin/blogs-input";
    private static final String LIST="admin/blogs";
    private static final String REDIRECT_LIST="redirect:/admin/blogs";

    //业务注入
    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagService tagService;

    //返回博客管理页面
    @GetMapping("/blogs")
    public String blogs(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable, BlogQuery blog, Model model){
        model.addAttribute("types",typeService.listType());
        model.addAttribute("page",blogService.listBlog(pageable,blog));
        return LIST;
    }

    //返回博客搜索页面
    @PostMapping("/blogs/search")
    public String search(@PageableDefault(size = 5,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable, BlogQuery blog, Model model){
        model.addAttribute("page",blogService.listBlog(pageable,blog));
        return "admin/blogs ::blogList"; //返回admin/blogs页面下的一个片段blogList,实现局部刷新
    }

   //返回博客新增页面
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

    //返回博客输入页面
    @GetMapping("/blogs/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        setTypeAndTag(model);
        Blog blog=blogService.getBlog(id);
        blog.init(); //初始化，将标签数组转换为字符串
        model.addAttribute("blog",blog);
        return INPUT;
    }

    //完成博客执行操作的校验
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

    //完成博客的删除
    @GetMapping("/blogs/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes){
        blogService.deleteBlog(id);
        attributes.addFlashAttribute("message","删除成功");
        return REDIRECT_LIST;
    }


}
