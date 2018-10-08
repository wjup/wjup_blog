package com.example.controller;

import com.example.entity.User;
import com.example.service.BlogService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private BlogService blogService;

    @RequestMapping("/mySelf")
    public String mySelf(HttpServletRequest request, Model model){
        User user = (User) request.getSession().getAttribute("session_user");
        model.addAttribute("user",user);
        List blogList = blogService.getBlogListAll();
        model.addAttribute("blogList",blogList);
        return "user";
    }



}
