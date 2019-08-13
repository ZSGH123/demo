package com.zkong.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * title: TestEntity
 * projectName demo
 * description:
 * author 2671242147@qq.com
 * date 2019-08-11 20:37
 ***/
@Component
@ConfigurationProperties("define")
@PropertySource("classpath:test.properties")
public class TestEntity {

    private String name;
    private Integer num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}
