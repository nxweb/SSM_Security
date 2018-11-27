package com.demo.dao;

import com.demo.entity.SysUser;

public interface UserDao {

    SysUser findById(Integer id);

    SysUser findByName(String name);

    int add(SysUser sysUser);


}
