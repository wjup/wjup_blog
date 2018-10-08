package com.example.mapper;

import com.example.entity.Blog;
import com.example.entity.Notice;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/29 0029 14:45
 */
@Repository
public interface BlogMapper {
    List getBlogList();

    Notice getNotice();

    Blog details(String title);

    void addText(Blog blog);

    void delText(int id);

    List getBlogListAll();

    void cleanText(int id);
}
