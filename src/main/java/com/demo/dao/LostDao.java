package com.demo.dao;

import com.demo.entity.Lost;

import java.util.List;
/*
 * @Author hobo
 * @Description :
 * @Date 下午8:17 18-11-25
 * @Param
 * @return
 **/

public interface LostDao {

    /*
     * @Author hobo
     * @Description : 展现lost列表信息
     * @Date 下午8:18 18-11-25
     * @Param []
     * @return java.util.List<com.demo.entity.Lost>
     **/
    List<Lost> queryLost();
    /*
     * @Author hobo
     * @Description : 通过id查询丢失物信息
     * @Date 下午8:18 18-11-25
     * @Param [lostId]
     * @return com.demo.entity.Lost
     **/
    Lost queryByLostId(int lostId);
    /*
     * @Author hobo
     * @Description : 通过物品类查询 返回一个列表
     * @Date 下午8:19 18-11-25
     * @Param [category]
     * @return java.util.List<com.demo.entity.Lost>
     **/
    List<Lost> queryBycategory(int category);

    /*
     * @Author hobo
     * @Description : 插入一条信息
     * @Date 下午8:19 18-11-25
     * @Param [lost]
     * @return int
     **/
    int insertLost(Lost lost);

    /*
     * @Author hobo
     * @Description : 更新一条信息
     * @Date 下午8:20 18-11-25
     * @Param [lost]
     * @return int
     **/
    int updateLost(Lost lost);

    /*
     * @Author hobo
     * @Description : 删除一条信息
     * @Date 下午8:20 18-11-25
     * @Param [lostId]
     * @return int
     **/
    int deleteLost(int lostId);
}
