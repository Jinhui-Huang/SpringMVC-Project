package com.itstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 2. 定义controller
 * 使用@Controller定义bean
 * */
@Controller
public class UserController {

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
        return "{'module':'springmvc'}";
    }
}
