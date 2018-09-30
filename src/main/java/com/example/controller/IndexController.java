package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:wjup
 * @Date: 2018/9/29 0029 17:30
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("")
    public String index(){
        return "redirect:/blog/getBlogList";
    }
}
