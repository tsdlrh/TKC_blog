package com.tkcblog.blog.dao;

import com.tkcblog.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type,Long> {

    //查找分类的名字
    Type findByName(String name);

    //查找博客数量最多的分类
    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
