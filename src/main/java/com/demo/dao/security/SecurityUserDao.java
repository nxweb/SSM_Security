package com.demo.dao.security;


import com.demo.entity.SysUser;

public interface SecurityUserDao {

    SysUser findByUsername(String username);
}
