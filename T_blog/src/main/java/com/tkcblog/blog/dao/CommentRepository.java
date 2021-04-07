package com.tkcblog.blog.dao;

import com.tkcblog.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by limi on 2017/10/22.
 */
public interface CommentRepository extends JpaRepository<Comment,Long>{


    //定义通过博客ID值查找父级评论不为空的接口
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
