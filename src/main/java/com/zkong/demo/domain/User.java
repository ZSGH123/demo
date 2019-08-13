package com.zkong.demo.domain;

/**
 * title: User
 * projectName demo
 * description: 用户模型
 * author 2671242147@qq.com
 * date 2019-08-10 12:16
 ***/
public class User {

    private Integer id;

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
