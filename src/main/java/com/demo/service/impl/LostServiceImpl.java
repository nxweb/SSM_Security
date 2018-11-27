package com.demo.service.impl;

import com.demo.dao.LostDao;
import com.demo.entity.Lost;
import com.demo.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class LostServiceImpl implements LostService {

    @Autowired
    private LostDao lostDao;

    @Override
    public List<Lost> queryLost() {
        return lostDao.queryLost();
    }

    @Override
    public Lost queryByLostId(int lostId) {
        return lostDao.queryByLostId(lostId);
    }

    @Override
    public List<Lost> queryBycategory(int category) {
        return lostDao.queryBycategory(category);
    }

    @Override
    @Transactional
    public boolean insertLost(Lost lost) {
        if (lost.getLostName() != null && !"".equals(lost.getLostName())) {
            lost.setCrateTime(new Date());
            lost.setUpdateTime(new Date());

            try {
                int result = lostDao.insertLost(lost);
                if (result > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加信息失败: " + e.getMessage());
            }
        } else {
            throw new RuntimeException("添加信息不能为空");
        }
    }

    @Override
    @Transactional
    public int updateLost(Lost lost) {
        if (lost.getLostName() != null && !"".equals(lost.getLostName())) {
            lost.setUpdateTime(new Date());
            try {
                int result = lostDao.insertLost(lost);
                if (result > 0) {
                    return result;
                } else {
                    throw new RuntimeException("更新信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新信息失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("更新信息Id不能为空");
        }
    }

    @Override
    public int deleteLost(int lostId) {
        if (lostId > 0) {
            try {
                int result = lostDao.deleteLost(lostId);
                if (result > 0) {
                    return lostId;
                } else {
                    throw new RuntimeException("删除信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除信息失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("删除信息Id不能为空");
        }
    }
}
