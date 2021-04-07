package com.tkcblog.blog.service;

import com.tkcblog.blog.NotFoundException;
import com.tkcblog.blog.dao.TypeRepository;
import com.tkcblog.blog.po.Type;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TypeServiceImpl implements TypeService{

    //持久层注入
    @Autowired
    private TypeRepository typeRepository;

    //保存分类
    @Transactional
    @Override
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }
    //获取分类
    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.findById(id).get();
    }
    //通过标签获取分类
    @Override
    public Type getTypeByname(String name) {
        return typeRepository.findByName(name);
    }

    //获取当前页的分类
    @Transactional
    @Override
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }

    //列出推荐分类
    @Override
    public List<Type> listTypeTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"blogs.size");
        Pageable pageable =PageRequest.of(0,size,sort);
        return typeRepository.findTop(pageable);
    }
    //更新分类
    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t = typeRepository.findById(id).get();
        if(t==null){
            throw new NotFoundException("不存在该类型");
        }
        BeanUtils.copyProperties(type,t);

        return typeRepository.save(t);
    }
    //删除分类
    @Transactional
    @Override
    public void deleteType(Long id) {
        typeRepository.deleteById(id);

    }
    //返回所有分类
    @Override
    public List<Type> listType() {
        return typeRepository.findAll();
    }
}
