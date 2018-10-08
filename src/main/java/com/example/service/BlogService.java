package com.example.service;

import com.example.entity.Blog;
import com.example.entity.Notice;
import com.example.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/29 0029 14:46
 */

@Service
public class BlogService {

    @Autowired
    private BlogMapper blogMapper;
    public List getBlogList() {
        return blogMapper.getBlogList();
    }

    public Notice getNotice() {
        return blogMapper.getNotice();
    }

    public Blog details(String title) {
        return blogMapper.details(title);
    }

    public void addText(Blog blog) {
        blogMapper.addText(blog);
    }

    public void delText(int id) {
        blogMapper.delText(id);
    }

    public List getBlogListAll() {
        return blogMapper.getBlogListAll();
    }

    public void cleanText(int id) {
        blogMapper.cleanText(id);
    }
}
