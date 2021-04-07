package com.tkcblog.blog.web.admin;

import com.tkcblog.blog.po.Comment;
import com.tkcblog.blog.po.User;
import com.tkcblog.blog.service.BlogService;
import com.tkcblog.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by limi on 2017/10/22.
 */
@Controller
public class CommentController {
    //业务注入
    @Autowired
    private CommentService commentService;

    @Autowired
    private BlogService blogService;

    //评论头像
    @Value("${comment.avatar}")
    private String avatar;

//    @Value("${admin.openid}")
//    private String adminOpenid;

    //返回评论页面
    @GetMapping("/comments/{blogId}")
    public String comments(@PathVariable Long blogId, Model model) {
        model.addAttribute("comments", commentService.listCommentByBlogId(blogId));
        return "blog :: commentList";
    }

    //返回对应的某一级的评论
    @PostMapping("/comments")
    public String post(Comment comment){
        Long blogId = comment.getBlog().getId();
        comment.setBlog(blogService.getBlog(blogId));
        comment.setAvatar(avatar);
        commentService.saveComment(comment);
        return "redirect:/comments/" + comment.getBlog().getId();
    }


//    @PostMapping("/comments")
//    public String post(Comment comment, HttpSession session) {
//        Long blogId = comment.getBlog().getId();
//        comment.setBlog(blogService.getBlog(blogId));
//        String loginStatus = (String) session.getAttribute("loginStatus");
//        if (loginStatus != null) {
//            String avatar = (String) session.getAttribute("avatar");
//            String openid = (String) session.getAttribute("openid");
//            comment.setAvatar(avatar);
//            comment.setAdminComment(1);
////            /*判断是否为管理员评论*/
////            if(adminOpenid.equals(openid)){
////                comment.setAdminComment(2);
////            }
////            System.out.println(openid);
////        } else {
////            comment.setAdminComment(0);
////            comment.setAvatar(avatar);
////        }
//            commentService.saveComment(comment);
//
//        }
//        return "redirect: /comments/" + blogId;
//    }
}




