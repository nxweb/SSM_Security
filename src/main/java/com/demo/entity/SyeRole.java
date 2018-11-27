package com.demo.entity;

import lombok.Data;

/**
 * @ClassName SyeRole
 * @Description 用户权限类
 * @Author Hobo
 * @Date 18-11-24 下午7:11
 **/
@Data
public class SyeRole {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
