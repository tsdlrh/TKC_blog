package com.tkcblog.blog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//建立tag的数据库表
@Entity
@Table(name="t_tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    //标签-博客：多对多，设置主键值为tags
    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

    public Tag(){

    }
    //实现get和set方法
    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
