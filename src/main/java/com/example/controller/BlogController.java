package com.example.controller;

import com.example.entity.Notice;
import com.example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/29 0029 14:37
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/getBlogList")
    public String getBlogList(Model model){
        List blogList = blogService.getBlogList();
        model.addAttribute("blogList",blogList);
        return "welcome";
    }

    @RequestMapping("/details/{id}")
    public String details(@PathVariable int id){
        System.out.println(id);
        return "blog/details";
    }

    @RequestMapping("/getNotice")
    public void getNotice(){
       // Notice notice = blogService.getNotice();
    }
}
