package com.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 刚更新完的idea反手就不认lombok了0.0，
 */
@Data
public class Lost {

    /**
     * 失物id
     */
    private Integer lostId;

    /**
     * 失物名
     */
    private String lostName;

    /**
     * 失物人
     */
    private String loster;

    /**
     * 失物所属类
     */
    private Integer category;

    /**
     * 失物简述
     */
    private String lostDescribe;

    /**
     * 失物人联系电话
     */
    private String lostPhoneNum;

    /**
     * 创建时间
     */
    private Date crateTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getLostId() {
        return lostId;
    }

    public void setLostId(Integer lostId) {
        this.lostId = lostId;
    }

    public String getLostName() {
        return lostName;
    }

    public void setLostName(String lostName) {
        this.lostName = lostName;
    }

    public String getLoster() {
        return loster;
    }

    public void setLoster(String loster) {
        this.loster = loster;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getLostDescribe() {
        return lostDescribe;
    }

    public void setLostDescribe(String lostDescribe) {
        this.lostDescribe = lostDescribe;
    }

    public String getLostPhoneNum() {
        return lostPhoneNum;
    }

    public void setLostPhoneNum(String lostPhoneNum) {
        this.lostPhoneNum = lostPhoneNum;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
