package com.tkcblog.blog.service;


import com.tkcblog.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    Type saveType(Type type);//保存分类
    Type getType(Long id);//获取分类
    Type getTypeByname(String name);//通过名称获取分类
    Page<Type> listType(Pageable pageable);//列出当前页的分类
    Type updateType(Long id,Type type);//更新分类
    void deleteType(Long id);//删除分类
    List<Type> listType();

    List<Type> listTypeTop(Integer size);//列出推荐分类
}
