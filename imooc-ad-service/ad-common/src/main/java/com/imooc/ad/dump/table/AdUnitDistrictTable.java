package com.imooc.ad.dump.table;


public class AdUnitDistrictTable {

    private Long unitId;
    private String province;
    private String city;
	public Long getUnitId() {
		return unitId;
	}
	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public AdUnitDistrictTable() {
		super();
	}
	public AdUnitDistrictTable(Long unitId, String province, String city) {
		super();
		this.unitId = unitId;
		this.province = province;
		this.city = city;
	}
    
    
    
}
