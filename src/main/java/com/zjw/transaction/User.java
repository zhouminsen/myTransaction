package com.zjw.transaction;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {


    private static final long serialVersionUID = -8098570595898776365L;
    /**
     * 主键
     */
    private Integer id;


    /**
     * 名称
     */
    private String name;

    /**
     * 版本号
     */
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}