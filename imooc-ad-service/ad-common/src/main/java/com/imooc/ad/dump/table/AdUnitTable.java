package com.imooc.ad.dump.table;


public class AdUnitTable {

    private Long unitId;
    private Integer unitStatus;
    private Integer positionType;

    private Long planId;

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public Integer getUnitStatus() {
		return unitStatus;
	}

	public void setUnitStatus(Integer unitStatus) {
		this.unitStatus = unitStatus;
	}

	public Integer getPositionType() {
		return positionType;
	}

	public void setPositionType(Integer positionType) {
		this.positionType = positionType;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public AdUnitTable() {
		super();
	}

	public AdUnitTable(Long unitId, Integer unitStatus, Integer positionType, Long planId) {
		super();
		this.unitId = unitId;
		this.unitStatus = unitStatus;
		this.positionType = positionType;
		this.planId = planId;
	}
    
    
}
