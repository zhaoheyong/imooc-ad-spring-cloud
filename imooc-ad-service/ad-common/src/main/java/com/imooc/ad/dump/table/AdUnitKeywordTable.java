package com.imooc.ad.dump.table;


public class AdUnitKeywordTable {

    private Long unitId;
    private String keyword;
	public Long getUnitId() {
		return unitId;
	}
	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public AdUnitKeywordTable() {
		super();
	}
	public AdUnitKeywordTable(Long unitId, String keyword) {
		super();
		this.unitId = unitId;
		this.keyword = keyword;
	}
    
    
}
