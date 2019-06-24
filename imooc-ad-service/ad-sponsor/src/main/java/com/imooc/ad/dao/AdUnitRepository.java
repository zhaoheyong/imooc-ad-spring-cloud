package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUnit;
import java.util.List;

/**
 * Created by Qinyi.
 */
public interface AdUnitRepository {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);

	List<Long> findAllById(List<Long> unitIds);
}
