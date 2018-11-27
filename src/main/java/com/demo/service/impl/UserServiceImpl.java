package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.SysUser;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser add(SysUser sysUser) {
        userDao.add(sysUser);
        return findById(sysUser.getId());
    }

    @Override
    public SysUser findById(int id) {
        SysUser sysUser = new SysUser();
        sysUser.setId(id);
        return userDao.findById(sysUser.getId());
    }

    @Override
    public SysUser findByName(String name) {
        SysUser parme = new SysUser();
        parme.setUsername(name);
        return userDao.findByName(parme.getUsername());
    }
}
