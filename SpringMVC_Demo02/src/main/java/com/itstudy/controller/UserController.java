package com.itstudy.controller;

import com.itstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * 2. 定义controller
 * 使用@Controller定义bean
 * */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    /*
    * 设置当前操作的访问路径
    * @RequestMapping("/save")
    * 设置当前操作的返回值类型, 返回给游览器的游览方
    * @ResponseBody
    * */
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save...");
        return "{'module':'springmvc-save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user delete...");
        return "{'module':'springmvc-delete'}";
    }

    @RequestMapping("/search")
    @ResponseBody
    public String searchUser() {
        System.out.println("user search...");
        return userService.select(1);
    }
}
