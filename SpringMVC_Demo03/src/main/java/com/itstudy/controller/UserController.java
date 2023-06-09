package com.itstudy.controller;

import com.itstudy.domain.Student;
import com.itstudy.domain.User;
import com.itstudy.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/*
 * 2. 定义controller
 * 使用@Controller定义bean
 * 统一访问域名设为users
 * 采用REST风格通过网页访问行为来区分方法
 * */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    /*
    * 设置当前操作的访问路径
    * @RequestMapping("/save")
    * 设置当前操作的返回值类型, 返回给游览器的游览方
    * @ResponseBody
    * method = RequestMethod.控制行为  GET,POST,PUT,DELETE
    * save方法采用RequestMethod.POST
    * */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        System.out.println("user save...");
        return "{'module':'springmvc-save'}";
    }

    /*
    * 删除方法RequestMethod.DELETE
    * */
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public String delete() {
        System.out.println("user delete...");
        return "{'module':'springmvc-delete'}";
    }

    /*
    * 查询方法RequestMethod.GET
    * 设定请求参数(路径变量)
    * @PathVariable声明参数来自网络路径,
    * value = "/{id}告诉参数具体来自哪个网络路径的参数, 或者说网络参数往哪个形参传递
    * */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String searchUser(@PathVariable Integer id) {
        System.out.println("user search...");
        return userService.select(id);
    }

    /*
     * 更新学生信息RequestMethod.PUT
     * @PathVariable声明参数来自网络路径,
     * value = "/{id}告诉形参来接收路径参数的的哪一个, 或者说路径参数该往哪里传
     * @RequestBody已经注明是JSON对象传递, 并不需要特地告诉参网络参数往哪个形参传递
     * */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String studentParam(@RequestBody Student student, @PathVariable Integer id) {
        System.out.println("参数传递, 修改id为" + id + "的student" + student);
        return student.toString();
    }
    /****************************************************/
    /****************************************************/

    /*
    * Get/Post请求传递参数
    * */
    @RequestMapping("/getResponse")
    @ResponseBody
    public String getResponse(@RequestParam("name") String username, int age) {
        System.out.println("普通参数传递 name ==> " + username);
        System.out.println("普通参数传递 age ==> " + age);
        return "name: " + username + ", age: " + age;
    }


    /*
    * 数组参数传递
    * */
    @RequestMapping("arrayParam")
    @ResponseBody
    public String arrayParam(String[] strArray) {
        System.out.println("数组参数传递 ==> " + Arrays.toString(strArray));
        return Arrays.toString(strArray);
    }

    /*
    * 集合参数传递
    * */
    @RequestMapping("listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> strList) {
        System.out.println("数组参数传递 ==> " + strList);
        return strList.toString();
    }

    /*
    * json数据传递, 集合参数
    * */
    @RequestMapping("listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> strList) {
        System.out.println("json数据传递 ==> " + strList);
        return strList.toString();
    }

    /*
    * json数据传递, 对象pojo参数
    * */
    @RequestMapping("studentParamForJson")
    @ResponseBody
    public String studentParamForJson(@RequestBody Student student) {
        System.out.println("参数传递student: " + student);
        return student.toString();
    }
}
