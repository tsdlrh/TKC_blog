package com.tkcblog.blog.service;

import com.tkcblog.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by limi on 2017/10/16.
 */
public interface TagService {

    Tag saveTag(Tag type);//保存标签

    Tag getTag(Long id);//获取标签

    Tag getTagByName(String name);//通过名字获取标签

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTagTop(Integer size);

    List<Tag> listTag(String ids);

    Tag updateTag(Long id, Tag type);//更新标签

    void deleteTag(Long id);//删除标签
}
