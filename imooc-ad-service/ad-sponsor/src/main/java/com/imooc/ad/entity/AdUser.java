package com.imooc.ad.entity;

import java.util.Date;

import com.imooc.ad.constant.CommonStatus;

public class AdUser {
    private Long id;

    private String username;

    private String token;

    private Integer userStatus;

    private Date createTime;

    private Date updateTime;
    
    public AdUser(String username, String token) {

        this.username = username;
        this.token = token;
        this.userStatus = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.updateTime = this.createTime;
    }

    public AdUser(Long id, String username, String token, Integer userStatus, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.token = token;
        this.userStatus = userStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public AdUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}