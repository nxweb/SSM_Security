package com.demo.service;

import com.demo.entity.SysUser;

public interface UserService {

    /*
     * @Author hobo
     * @Description : 添加一个用户
     * @Date 下午7:07 18-11-24
     * @Param [sysUser]
     * @return com.demo.entity.SysUser
     **/
    SysUser add(SysUser sysUser);

    /*
     * @Author hobo
     * @Description : 通过id查找一个用户
     * @Date 下午7:08 18-11-24
     * @Param [id]
     * @return com.demo.entity.SysUser
     **/
    SysUser findById(int id);

    /*
     * @Author hobo
     * @Description : 通过用户名查找用户
     * @Date 下午7:08 18-11-24
     * @Param [name]
     * @return com.demo.entity.SysUser
     **/
    SysUser findByName(String name);
}

