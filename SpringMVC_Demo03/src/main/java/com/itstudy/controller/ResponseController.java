package com.itstudy.controller;


import com.itstudy.domain.Student;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/response")
public class ResponseController {

    /*
    * 响应页面/跳转页面
    * */
    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("跳转页面");
        return "project-1.jsp";
    }

    /*
    * 响应文本数据
    * */
    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response txt";
    }

    /*
    * 响应POJO对象
    * */
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public Student toJsonPOJO() {
        System.out.println("返回json对象数据");
        Student student = new Student();
        student.setName("tom");
        student.setAge(21);
        return student;
    }

    /*
    * 响应POJO集合
    * */
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<Student> toJsonList() {
        System.out.println("返回json对象数组");
        Student student1 = new Student();
        student1.setName("tom");
        student1.setAge(21);

        Student student2 = new Student();
        student2.setName("jack");
        student2.setAge(22);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        return studentList;
    }
}
