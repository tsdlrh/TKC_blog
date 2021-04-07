package com.tkcblog.blog.service;

import com.tkcblog.blog.po.Comment;

import java.util.List;

/**
 * Created by limi on 2017/10/22.
 */
public interface CommentService {

    //定义通过博客id对应评论的接口
    List<Comment> listCommentByBlogId(Long blogId);

    //保存评论
    Comment saveComment(Comment comment);
}
