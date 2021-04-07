package com.tkcblog.blog.service;

import com.tkcblog.blog.po.Blog;
import com.tkcblog.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author : xsh
 * @create : 2020-02-12 - 0:57
 * @describe:
 */
public interface BlogService {

    Blog getBlog(Long id);//获取博客id

    Blog getAndConvert(Long id);//将html格式的文章转化成markdown格式

    Page<Blog> listBlog(Pageable pageable,BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId,Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);

    Map<String,List<Blog>> archiveBlog();

    Long countBlog();//统计博客数目

    Blog saveBlog(Blog blog);//保存博客

    Blog updateBlog(Long id,Blog blog);//更新博客

    void deleteBlog(Long id);//删除博客

    Page<Blog> listBlog(Long tagId,Pageable pageable,BlogQuery blog);
}
