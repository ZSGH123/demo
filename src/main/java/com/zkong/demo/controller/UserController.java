package com.zkong.demo.controller;

import com.zkong.demo.domain.RandomData;
import com.zkong.demo.domain.Student;
import com.zkong.demo.domain.TestEntity;
import com.zkong.demo.domain.User;
import com.zkong.demo.reposity.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * title: UserController
 * projectName demo
 * description:
 * author 2671242147@qq.com
 * date 2019-08-10 12:46
 ***/
@RestController
public class UserController {

    private final UserReposity userReposity;

    /**
     * 注入user
     */
    @Resource
    private Student student;

    @Autowired
    private RandomData randomData;

    @Resource
    private TestEntity testEntity;

    /**
     * 通过${}获取application.properties里的自定义属性
     */
    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private Integer age;

    @Value("${pocket.address}")
    private String address;


    @Autowired
    public UserController(UserReposity userReposity) {
        this.userReposity = userReposity;
    }

    @RequestMapping("/user/saveUser")
    public Object saveUser(String name) {
        Assert.notNull(name, "name is null");
        User user = new User(name);
        userReposity.saveUser(user);
        return user;
    }

    @PostMapping("/user/getAllUser")
    public Object saveUser() {
        return userReposity.getAllUser();
    }

    @GetMapping("/hello")
    public String hello() {
        return "大家好，我的名字是" + name + "，我今年" + age + "岁了，我在" + address + "工作！";
    }

    @GetMapping("/say")
    public String say() {
        return "大家好，我的名字是" + student.getName() + "，我今年" + student.getAge() + "岁了，我在" + student.getAddress() + "工作！";
    }


    @GetMapping("/random")
    public RandomData random() {
        return randomData;
    }

    @GetMapping("/testDefine")
    public TestEntity getTestEntity() {
        return testEntity;
    }
}
