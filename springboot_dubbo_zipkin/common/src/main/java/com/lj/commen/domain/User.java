package com.lj.commen.domain;

import java.io.Serializable;

/**
 * @author: cfeng
 * @date: 2020/9/6
 * @description:
 */
public class User implements Serializable {
    private int id;

    private  String name;

    private  int age;

    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
