package com.imooc.ad.dump.table;

/**
 * Created by Qinyi.
 */

public class AdCreativeUnitTable {

    private Long adId;
    private Long unitId;
	public Long getAdId() {
		return adId;
	}
	public void setAdId(Long adId) {
		this.adId = adId;
	}
	public Long getUnitId() {
		return unitId;
	}
	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}
	public AdCreativeUnitTable() {
		super();
	}
	public AdCreativeUnitTable(Long adId, Long unitId) {
		super();
		this.adId = adId;
		this.unitId = unitId;
	}
    
}
