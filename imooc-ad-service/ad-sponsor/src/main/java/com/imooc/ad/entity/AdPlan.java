package com.imooc.ad.entity;

import java.util.Date;

import com.imooc.ad.constant.CommonStatus;

public class AdPlan {
    private Long id;

    private Long userId;

    private String planName;

    private Integer planStatus;

    private Date startDate;

    private Date endDate;

    private Date createTime;

    private Date updateTime;

    public AdPlan(Long id, Long userId, String planName, Integer planStatus, Date startDate, Date endDate, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.planName = planName;
        this.planStatus = planStatus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    
    public AdPlan(Long userId, String planName,
            Date startDate, Date endDate) {

	  this.userId = userId;
	  this.planName = planName;
	  this.planStatus = CommonStatus.VALID.getStatus();
	  this.startDate = startDate;
	  this.endDate = endDate;
	  this.createTime = new Date();
	  this.updateTime = this.createTime;
    }

    public AdPlan() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public Integer getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(Integer integer) {
        this.planStatus = integer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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