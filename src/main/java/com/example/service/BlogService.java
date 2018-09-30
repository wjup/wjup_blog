package com.example.service;

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
}
