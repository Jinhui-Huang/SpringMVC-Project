package com.itstudy.controller;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("/date")
public class DateController {

    @RequestMapping("dateResponse01")
    @ResponseBody
    public String dateResponse01(Date date) {
        System.out.println("日期格式传递 ==> " + date);
        return date.toString();
    }

    @RequestMapping("dateResponse02")
    @ResponseBody
    public String dateResponse02(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        System.out.println("日期格式传递 ==> " + date);
        return date.toString();
    }

    @RequestMapping("dateResponse03")
    @ResponseBody
    public String dateResponse03(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {
        System.out.println("日期格式传递 ==> " + date);
        return date.toString();
    }
}
