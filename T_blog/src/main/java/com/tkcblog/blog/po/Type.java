package com.tkcblog.blog.po;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

//建立Type的数据库表
@Entity
@Table(name="t_type")
public class Type {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message="分类名称不能为空")
    private String name;

    //分类-博客：一对多
    @OneToMany(mappedBy="type")
    private List<Blog> blogs = new ArrayList<>();



    public Type(){

    }
    //实现get和set方法

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

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
