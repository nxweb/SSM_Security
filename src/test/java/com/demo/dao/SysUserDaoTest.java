package com.demo.dao;

import com.demo.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void add() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("root");
        sysUser.setPassword("1234");
        int result = userDao.add(sysUser);
        assertEquals(1, result);
    }


    @Test
    public void findById() {
        SysUser sysUser = userDao.findById(4);
        assertEquals("admin", sysUser.getUsername());
    }

    @Test
    public void findByName() {
        SysUser sysUser = userDao.findByName("admin");
        assertEquals(4, sysUser);
    }
}