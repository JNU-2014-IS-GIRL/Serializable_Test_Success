package com.example.zhuwo.diary_zhoushanshan;

import java.io.Serializable;

/**
 * Created by zhuwo on 2016/11/17.
 */

public class SaveObjectDemo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

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
}
