package com.imooc.ad.dump.table;

public class AdUnitItTable {

    private Long unitId;
    private String itTag;
	public Long getUnitId() {
		return unitId;
	}
	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
	public String getItTag() {
		return itTag;
	}
	public void setItTag(String itTag) {
		this.itTag = itTag;
	}
	public AdUnitItTable() {
		super();
	}
	public AdUnitItTable(Long unitId, String itTag) {
		super();
		this.unitId = unitId;
		this.itTag = itTag;
	}
    
    
}
