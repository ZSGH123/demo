package com.zkong.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * title: Student
 * projectName demo
 * description: 由Spring根据ConfigurationProperties自动注入属性的值
 * author 2671242147@qq.com
 * date 2019-08-11 18:45
 ***/
@Component
@ConfigurationProperties(prefix = "pocket")
public class Student {

    private String name;
    private Integer age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
