package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.Blog;
import com.example.entity.Notice;
import com.example.service.BlogService;
import com.example.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/29 0029 14:37
 */
@Controller
@RequestMapping("/blog")
public class BlogController{

    @Autowired
    private BlogService blogService;

    @RequestMapping("/getBlogList")
    public String getBlogListm(Model model){
        List blogList = blogService.getBlogList();
        model.addAttribute("blogList",blogList);
        return "welcome";
    }

    @RequestMapping("/details/{title}")
    public String details(@PathVariable String title){
        Blog blog= blogService.details(title);
        System.out.println(blog.getTitle()+blog.getText());
        return "blog/details";
    }

    @RequestMapping("/getNotice")
    @ResponseBody
    public String getNotice(){
        Notice notice = blogService.getNotice();
        JSONObject json = new JSONObject();
        json.put("title",notice.getTitle());
        json.put("notice",notice.getNotice());
        return json.toJSONString();
    }

    @RequestMapping("/addText")
    public void addText(Model model, Blog blog, HttpServletResponse response) throws IOException {
        blog.setCreatTime(DateUtils.getDefautlString(new Date()).toString());
        if(blog.getState()==null){
            blog.setState(0);
        }
        blog.setUrl("details/"+blog.getTitle());
        blogService.addText(blog);
        response.sendRedirect("/admin/mySelf");
    }

    @RequestMapping("/delText/{id}/{state}")
    public void delText(@PathVariable int id,@PathVariable int state, HttpServletResponse response) throws IOException {
        System.out.println(id+"-----"+state);
        if(state!=2){
            blogService.delText(id);
        }else{
            blogService.cleanText(id);
        }
        response.sendRedirect("/admin/mySelf");
    }
}
