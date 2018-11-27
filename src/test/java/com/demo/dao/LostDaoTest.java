package com.demo.dao;

import com.demo.entity.Lost;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.log.LogOutputStream;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LostDaoTest {

    @Autowired
    private LostDao lostDao;

    @Test
    public void queryLost() {
        List<Lost> lostList = lostDao.queryLost();
//        assertEquals(1,lostList.size());
        System.out.println(lostList);
    }

    @Test
    public void queryByLostId() {
        Lost lost = lostDao.queryByLostId(1);
        assertEquals("phone", lost.getLostName());
    }

    @Test
    public void queryBycategory() {
        List<Lost> lostList = lostDao.queryBycategory(2);
        assertEquals(2, lostList.size());
        System.out.println(lostList);
    }

    @Test
    public void insertLost() {
        Lost lost = new Lost();
        lost.setLostName("校园卡");
        lost.setLoster("李四");
        lost.setCategory(2);
        lost.setLostPhoneNum("11112223333");
        lost.setLostDescribe("绿色卡套");
        lost.setCrateTime(new Date());
        lost.setUpdateTime(new Date());
        int result = lostDao.insertLost(lost);
        assertEquals(1, result);
    }

    @Test
    public void updateLost() {
        Lost lost = new Lost();
        lost.setLostName("银行卡");
        lost.setLoster("王五");
        lost.setCategory(1);
        lost.setLostPhoneNum("12345678911");
        lost.setLostDescribe("明理楼");
        lost.setLostId(2);
        lost.setUpdateTime(new Date());
        int result = lostDao.updateLost(lost);
        assertEquals(1, result);

    }

    @Test
    public void deleteLost() {
        int result = lostDao.deleteLost(4);
        assertEquals(1, result);
    }
}