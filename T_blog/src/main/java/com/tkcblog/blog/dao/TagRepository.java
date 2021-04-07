package com.tkcblog.blog.dao;

import com.tkcblog.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by limi on 2017/10/16.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    //查找标签的名字
    Tag findByName(String name);

    //查找博客数最多的标签
    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
