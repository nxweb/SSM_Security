package com.demo.entity;


import lombok.Data;

import java.util.List;

@Data
public class SysUser {

    private Integer id;
    private String username;
    private String password;
    private List<SyeRole> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SyeRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SyeRole> roles) {
        this.roles = roles;
    }
}
